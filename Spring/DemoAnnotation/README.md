# DemoAnnotation - Spring Annotations & Configuration

## Project Description
This project demonstrates Spring Framework annotations and annotation-based bean configuration without using Spring Boot.

## Technology Stack
- **Framework**: Spring Core 6.2.16
- **Java**: 17
- **Build Tool**: Maven
- **Configuration**: Annotation-based (No XML)

## Project Structure
```
DemoAnnotation/
├── pom.xml
├── src/
│   ├── main/java/com/nit/
│   │   ├── App.java (Entry point)
│   │   ├── AppConfig.java (Configuration class)
│   │   ├── Address.java
│   │   ├── Customer.java
│   │   └── CustomerAddress.java
│   └── test/java/com/nit/
│       └── AppTest.java
└── target/
```

## Key Concepts

### AppConfig.java
Spring configuration class with @Configuration annotation:
- Defines beans using @Bean
- Sets up component scanning

### Component Classes
- **Address.java**: Model class for addresses
- **Customer.java**: Model class with Address dependency
- **CustomerAddress.java**: Relationship demonstration

### App.java
Main entry point demonstrating:
- ApplicationContext initialization
- Bean retrieval and usage

## Core Annotations Used

```java
@Configuration          // Marks class as configuration source
@Bean                   // Marks method as bean definition
@Component              // Generic stereotype annotation
@Service                // Service layer annotation
@Repository             // Persistence layer annotation
@Autowired              // Dependency injection
@Qualifier              // Bean selection qualifier
```

## Building and Running

```bash
# Build project
mvn clean install

# Run application
mvn exec:java -Dexec.mainClass="com.nit.App"

# Run tests
mvn test
```

## Key Learning Points

1. **Annotation-Based Configuration**
   - Replacing XML configuration with annotations
   - @Configuration and @Bean usage

2. **Dependency Injection**
   - How Spring manages dependencies
   - Constructor vs Setter injection

3. **Bean Lifecycle**
   - Bean creation and initialization
   - Bean scope management

4. **Component Scanning**
   - Auto-discovery of components
   - Custom scan base packages

## Sample Code Structure

```java
@Configuration
public class AppConfig {
    
    @Bean
    public Address address() {
        return new Address("123 Main St", "City", "12345");
    }
    
    @Bean
    public Customer customer(Address address) {
        Customer c = new Customer();
        c.setAddress(address);
        return c;
    }
}

// Usage
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);
        
        Customer customer = context.getBean(Customer.class);
        // Use customer object
    }
}
```

## Interview Questions Related

1. What's the difference between @Component and @Bean?
2. Explain dependency injection in Spring
3. What are different scopes of Spring beans?
4. How does component scanning work?
5. Difference between constructor and setter injection

## Troubleshooting

### Bean not found
- Check @Component or @Bean annotations
- Verify component-scan base package
- Check for circular dependencies

### Dependency injection failures
- Ensure bean definitions exist
- Use @Qualifier for ambiguous beans
- Check constructor/setter signatures

## Next Steps

1. Explore other annotations (@Scope, @PostConstruct, etc.)
2. Understand bean lifecycle callbacks
3. Learn about AOP (Aspect-Oriented Programming)
4. Study Spring events
5. Move to Spring Boot for advanced concepts

---

**Last Updated**: April 2026
