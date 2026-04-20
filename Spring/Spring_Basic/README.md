# Spring Basic - Spring Framework Fundamentals

## Project Description
This project covers the fundamental concepts of Spring Framework, including the IoC container, bean lifecycle, and basic configuration methods.

## Technology Stack
- **Framework**: Spring Core 6.2.16
- **Java**: 17
- **Build Tool**: Maven
- **Configuration**: Annotation-based

## Project Structure
```
Spring_Basic/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── DI.java (Main example)
│   │   └── resources/
│   │       └── notes.txt (Documentation)
│   └── test/java/
└── target/
```

## Core Concepts Covered

### 1. Dependency Injection (DI)
The process of providing objects with their dependencies instead of having them create dependencies internally.

**Problem Without DI**:
```java
class Car {
    private Engine engine = new Engine(); // Tight coupling
}
```

**Solution With DI**:
```java
class Car {
    private Engine engine;
    
    public Car(Engine engine) {
        this.engine = engine; // Injected
    }
}
```

### 2. Inversion of Control (IoC)
Spring manages object creation and dependency resolution instead of the application code.

```
Traditional: Application → Creates Objects → Manages Dependencies
Spring IoC:  Spring Container → Creates Objects → Manages Dependencies
```

### 3. Spring Container
The core component that:
- Creates beans
- Manages bean lifecycle
- Injects dependencies
- Handles configuration

## Key Components

### DI.java
Main example demonstrating:
- Simple DI pattern
- Engine and Car classes
- Loose coupling benefits
- Method overriding for flexibility

### Bean Lifecycle

```
1. Instantiation: Bean created
2. Population: Properties set
3. Initialization: Init methods called
4. Use: Bean used by application
5. Destruction: Bean destroyed
```

## Spring Annotations Reference

```java
@Component      // Generic component
@Service        // Service layer component
@Repository     // Data access layer component
@Controller     // Web controller component
@Configuration  // Configuration class
@Bean           // Bean definition method
@Autowired      // Dependency injection marker
@Qualifier      // Disambiguate beans
@Scope          // Bean scope (singleton, prototype, etc.)
@PostConstruct  // Run after initialization
@PreDestroy     // Run before destruction
```

## Building and Running

```bash
# Build project
mvn clean install

# Compile
mvn compile

# Run tests
mvn test
```

## Understanding DI.java

### Example Structure
```java
public class DI {
    // Engine class representing a dependency
    static class Engine {
        void start() {
            System.out.println("Engine Started");
        }        
    }

    // Car class that depends on Engine
    static class Car {
        private Engine engine;
        
        // Dependency injection via constructor
        Car(Engine engine) {
            this.engine = engine;
        }
        
        void drive() {
            engine.start();
            System.out.println("Car driving");
        }
    }

    public static void main(String[] args) {
        // Without Spring (manual DI)
        Engine e = new Engine();
        Car c = new Car(e);
        c.drive();
        
        // With Spring (container-managed)
        // ApplicationContext would handle this
    }
}
```

## Benefits of DI

| Aspect | Without DI | With DI |
|--------|-----------|---------|
| **Coupling** | Tight | Loose |
| **Testability** | Hard to mock | Easy to mock |
| **Flexibility** | Requires code changes | Easy to change |
| **Maintenance** | Difficult | Easy |
| **Reusability** | Limited | High |

## Configuration Methods

### 1. Annotation-Based (Recommended)
```java
@Configuration
public class Config {
    @Bean
    public Engine engine() {
        return new Engine();
    }
    
    @Bean
    public Car car(Engine engine) {
        return new Car(engine);
    }
}
```

### 2. Java-Based Configuration
```java
new AnnotationConfigApplicationContext(Config.class);
```

### 3. XML-Based Configuration (Legacy)
```xml
<bean id="engine" class="com.example.Engine"/>
<bean id="car" class="com.example.Car">
    <constructor-arg ref="engine"/>
</bean>
```

## Spring Bean Scopes

| Scope | Description |
|-------|-------------|
| **Singleton** | Single instance per container (default) |
| **Prototype** | New instance each time |
| **Request** | One per HTTP request (web apps) |
| **Session** | One per HTTP session (web apps) |
| **Application** | One per ServletContext (web apps) |

## Interview Questions

1. **What is Dependency Injection?**
   - Design pattern that deals with how components get hold of their dependencies
   - Objects are given dependencies rather than creating them

2. **Why Spring Framework?**
   - Lightweight, non-intrusive
   - Flexible and modular
   - Extensive ecosystem
   - Great testability

3. **What is IoC Container?**
   - Component that manages object creation and lifecycle
   - Resolves dependencies automatically
   - Makes code less coupled

4. **Constructor vs Setter Injection?**
   - Constructor: Immutable, mandatory dependencies
   - Setter: Flexible, optional dependencies

5. **What is Spring Bean?**
   - Object managed by Spring container
   - Follows bean lifecycle
   - Can be autowired

## Best Practices

1. **Program to interfaces**
   ```java
   IEngine engine = new Engine();
   ```

2. **Use constructor injection** when possible
   ```java
   public Car(Engine engine) {
       this.engine = engine;
   }
   ```

3. **Avoid field injection** unless necessary
   ```java
   // Avoid
   @Autowired
   private Engine engine;
   ```

4. **Use @Qualifier** for disambiguation
   ```java
   public Car(@Qualifier("v8Engine") Engine engine)
   ```

5. **Keep beans stateless** when possible
   - Use Singleton scope for stateless beans
   - Use Prototype for stateful objects

## Common Mistakes

1. **Circular Dependencies**
   - A depends on B, B depends on A
   - Solution: Redesign or use ObjectProvider

2. **Not Defining Beans**
   - Missing @Bean or @Component
   - Result: NoSuchBeanDefinitionException

3. **Field Injection Over Constructor**
   - Harder to test and trace
   - Hides dependencies

4. **Creating Objects with 'new'**
   - Defeats purpose of DI
   - Creates tight coupling

## Troubleshooting

### NoSuchBeanDefinitionException
```
Check:
- Is bean defined with @Bean or @Component?
- Is component scanning enabled?
- Check class name and package
```

### UnsatisfiedDependencyException
```
Check:
- All required dependencies are defined
- No circular dependencies
- Correct type and name matching
```

## Resources for Further Learning

1. Spring Framework Documentation
2. Spring In Action book
3. Baeldung Spring tutorials
4. YouTube Spring courses
5. Official Spring examples

## Next Steps

1. **Understand Bean Lifecycle**: @PostConstruct, @PreDestroy
2. **Explore AOP**: Cross-cutting concerns
3. **Learn Configuration**: @PropertySource, profiles
4. **Study Advanced DI**: ObjectProvider, ObjectFactory
5. **Move to Spring Boot**: Simplified Spring configuration

## Practice Exercises

1. Create a 3-layer architecture (Controller, Service, DAO)
2. Implement constructor and setter injection
3. Create multiple beans and use @Qualifier
4. Understand circular dependency errors
5. Design service interfaces for flexibility

---

**Last Updated**: April 2026
**Foundation**: Spring DI is essential knowledge for all Spring applications
