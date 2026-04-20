# Dependency Injection - Spring Core Demonstration

## Project Description
This project demonstrates the fundamental concept of Dependency Injection using Spring Framework core. It shows how to decouple components and manage dependencies through Spring's IoC container.

## Technology Stack
- **Framework**: Spring Core 6.2.16
- **Java**: 17
- **Build Tool**: Maven
- **Pattern**: Dependency Injection (Constructor, Setter, Field)

## Project Structure
```
Dependency_Injection/
├── pom.xml
├── src/
│   ├── main/java/com/aman/
│   │   ├── Main.java (Entry point)
│   │   ├── ProductController.java (Controller layer)
│   │   ├── ProductService.java (Service layer)
│   │   └── ProductDAO.java (Data access layer)
│   └── test/java/com/aman/
└── target/
```

## Architecture

### Layered Architecture
```
Main
  ↓
ProductController
  ↓ (depends on)
ProductService
  ↓ (depends on)
ProductDAO
```

### Dependency Flow

**Without DI (Tight Coupling)**:
```java
public class ProductController {
    private ProductService service = new ProductService(); // Hard dependency
}
```

**With DI (Loose Coupling)**:
```java
public class ProductController {
    private ProductService service;
    
    public ProductController(ProductService service) {
        this.service = service; // Injected dependency
    }
}
```

## Core Classes

### ProductDAO
- Handles database operations
- Simulates data persistence layer
- Methods: save(), findById(), findAll(), delete()

### ProductService
- Business logic layer
- Depends on ProductDAO
- Methods: createProduct(), getProduct(), etc.

### ProductController
- Presentation/Controller layer
- Depends on ProductService
- Orchestrates client requests

### Main
- Entry point demonstrating:
  - ApplicationContext creation
  - Bean instantiation
  - Dependency resolution
  - Component usage

## Dependency Injection Types

### 1. Constructor Injection (Recommended)
```java
public class ProductController {
    private final ProductService service;
    
    public ProductController(ProductService service) {
        this.service = service;
    }
}
```

### 2. Setter Injection
```java
public class ProductController {
    private ProductService service;
    
    public void setService(ProductService service) {
        this.service = service;
    }
}
```

### 3. Field Injection
```java
public class ProductController {
    @Autowired
    private ProductService service;
}
```

## Building and Running

```bash
# Clean and build
mvn clean install

# Run application
mvn exec:java -Dexec.mainClass="com.aman.Main"

# Compile only
mvn compile
```

## Key Learning Objectives

1. **Understand Dependency Injection**
   - What is DI and why it's important
   - Loose vs tight coupling

2. **IoC Container Basics**
   - How Spring manages dependencies
   - Bean lifecycle management

3. **Layered Architecture**
   - Separation of concerns
   - Different layers and responsibilities

4. **Configuration Methods**
   - Annotation-based configuration
   - Java-based configuration
   - XML-based configuration

5. **Design Patterns**
   - Singleton pattern
   - Dependency Inversion Principle
   - Interface-based design

## Interview Questions

1. **What is Dependency Injection?**
   - Answer: A design pattern where objects receive their dependencies from outside

2. **Why use DI instead of 'new' operator?**
   - Answer: Testability, flexibility, loose coupling, easier maintenance

3. **Types of DI?**
   - Answer: Constructor, Setter, Field, Interface injection

4. **What's Spring IoC Container?**
   - Answer: Container that manages bean lifecycle and dependency resolution

5. **Advantages of Constructor Injection?**
   - Answer: Immutability, mandatory dependencies, easier testing

## Code Example

```java
// Configuration
@Configuration
public class AppConfig {
    @Bean
    public ProductDAO productDAO() {
        return new ProductDAO();
    }
    
    @Bean
    public ProductService productService(ProductDAO dao) {
        return new ProductService(dao);
    }
    
    @Bean
    public ProductController productController(ProductService service) {
        return new ProductController(service);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);
        
        ProductController controller = context.getBean(ProductController.class);
        controller.handleRequest();
    }
}
```

## Best Practices

1. **Use Constructor Injection** when possible
2. **Program to interfaces** not implementations
3. **Keep dependencies explicit**
4. **Avoid circular dependencies**
5. **Use @Qualifier** for multiple implementations

## Troubleshooting

### NoSuchBeanDefinitionException
- Check if bean is defined
- Verify component scanning
- Ensure class is marked with @Component or similar

### Circular Dependency Error
- Redesign to remove circular dependency
- Use ObjectProvider for lazy resolution
- Split responsibilities

### Field injection not working
- Ensure class is a Spring bean
- Check for typos in bean names
- Verify component scanning

## Advanced Topics

1. **Bean Scopes**: Singleton, Prototype, Request, Session
2. **AOP**: Cross-cutting concerns
3. **Event Publishing**: ApplicationEvent and listeners
4. **Bean Post-Processors**: Customize bean creation
5. **Property Binding**: Configuration externalization

## Next Steps

1. Run this project and understand the flow
2. Modify to add more layers
3. Implement custom annotations
4. Explore different configuration methods
5. Learn Spring Boot for production applications

---

**Last Updated**: April 2026
**Key Concept**: Dependency Injection is the foundation of Spring Framework
