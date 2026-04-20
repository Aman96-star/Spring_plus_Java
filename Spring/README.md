# Java Placement Preparation - Spring Projects

This workspace contains multiple Spring Framework projects demonstrating various concepts and best practices for Java job interview preparation.

## Project Structure

```
Spring/
├── DataJpaTask/              # Spring Boot JPA & Hibernate demonstration
├── DemoAnnotation/           # Spring annotations and configuration
├── Dependency_Injection/     # Spring Dependency Injection (Core)
└── Spring_Basic/             # Spring framework basics
```

## Projects Overview

### 1. DataJpaTask
- **Type**: Spring Boot Application
- **Framework**: Spring Data JPA + Hibernate
- **Purpose**: Database operations using JPA repository pattern
- **Key Concepts**: Entity mapping, Repository pattern, Database transactions
- **Location**: `DataJpaTask/`

**Structure**:
```
DataJpaTask/
├── pom.xml                      # Maven configuration
├── src/
│   ├── main/
│   │   ├── java/com/aman/
│   │   │   ├── DataJpaTaskApplication.java
│   │   │   ├── entity/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/java/com/aman/demo/
└── target/                      # Build output (auto-generated)
```

### 2. DemoAnnotation
- **Type**: Spring Framework Application
- **Framework**: Spring Core (No Boot)
- **Purpose**: Understanding Spring annotations and bean configuration
- **Key Concepts**: @Bean, @Configuration, Annotation-based configuration
- **Location**: `DemoAnnotation/`

**Structure**:
```
DemoAnnotation/
├── pom.xml                      # Maven configuration
├── src/
│   ├── main/java/com/nit/
│   │   ├── Address.java
│   │   ├── App.java
│   │   ├── AppConfig.java
│   │   ├── Customer.java
│   │   └── CustomerAddress.java
│   └── test/java/com/nit/
│       └── AppTest.java
└── target/                      # Build output (auto-generated)
```

### 3. Dependency_Injection
- **Type**: Maven Java Application
- **Framework**: Spring Core
- **Purpose**: Demonstrate Spring Dependency Injection patterns
- **Key Concepts**: Constructor injection, Setter injection, Field injection
- **Location**: `Dependency_Injection/`

**Structure**:
```
Dependency_Injection/
├── pom.xml                      # Maven configuration
├── src/
│   ├── main/java/com/aman/
│   │   ├── Main.java
│   │   ├── ProductController.java
│   │   ├── ProductDAO.java
│   │   └── ProductService.java
│   └── test/java/com/aman/
└── target/                      # Build output (auto-generated)
```

### 4. Spring_Basic
- **Type**: Maven Java Application
- **Framework**: Spring Core
- **Purpose**: Learn Spring fundamentals
- **Key Concepts**: Bean lifecycle, IoC container, Spring configuration
- **Location**: `Spring_Basic/`

**Structure**:
```
Spring_Basic/
├── pom.xml                      # Maven configuration
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── DI.java          # Dependency Injection example
│   │   └── resources/
│   │       └── notes.txt        # Documentation notes
│   └── test/java/
└── target/                      # Build output (auto-generated)
```

## Building and Running

### Prerequisites
- Java 17 or higher
- Maven 3.8.0+
- IDE: VS Code with Java extensions or IntelliJ IDEA

### Build All Projects
```bash
cd DataJpaTask
mvn clean install

cd ../DemoAnnotation
mvn clean install

cd ../Dependency_Injection
mvn clean install

cd ../Spring_Basic
mvn clean install
```

### Run Individual Projects

#### DataJpaTask
```bash
cd DataJpaTask
mvn spring-boot:run
```

#### DemoAnnotation
```bash
cd DemoAnnotation
mvn test
```

#### Dependency_Injection
```bash
cd Dependency_Injection
mvn exec:java -Dexec.mainClass="com.aman.Main"
```

#### Spring_Basic
```bash
cd Spring_Basic
mvn compile
```

## Key Concepts Covered

### 1. Dependency Injection (DI)
- Constructor Injection
- Setter Injection
- Field Injection via @Autowired

### 2. Spring Annotations
- @Component, @Service, @Repository, @Controller
- @Bean, @Configuration
- @Autowired
- @Qualifier

### 3. Spring Data JPA
- Entity mapping with @Entity
- Repository pattern
- Query derivation
- Relationships (OneToMany, ManyToOne, etc.)

### 4. Application Configuration
- application.properties
- @PropertySource
- ConfigurationProperties

## Maven Plugins Configuration

All projects use:
- **maven-compiler-plugin**: Java 17 compilation
- **spring-boot-maven-plugin**: Spring Boot execution (DataJpaTask)

## Common Commands

| Command | Description |
|---------|-------------|
| `mvn clean` | Remove target directory |
| `mvn compile` | Compile source code |
| `mvn test` | Run tests |
| `mvn package` | Create JAR file |
| `mvn install` | Install to local repository |
| `mvn clean install` | Clean and install |

## Troubleshooting

### Maven not found
```bash
# Verify Maven installation
mvn -version

# Add Maven to PATH if needed
```

### Java version mismatch
```bash
# Check Java version
java -version

# All projects require Java 17+
```

### Spring Boot application won't run
```bash
# Ensure application.properties exists and is configured correctly
# Check src/main/resources/application.properties
```

## Interview Preparation Tips

1. **DataJpaTask**: Understand JPA relationships, query optimization
2. **DemoAnnotation**: Know different ways to configure beans
3. **Dependency_Injection**: Master DI patterns - crucial for Spring interviews
4. **Spring_Basic**: Understand Spring container and bean lifecycle

## Resources

- [Spring Documentation](https://spring.io/projects/spring-framework)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Maven Documentation](https://maven.apache.org/)

## Next Steps

1. Review and run each project
2. Understand the dependency injection flow in Dependency_Injection project
3. Study JPA mapping in DataJpaTask
4. Practice creating new beans and configuring them
5. Learn Spring Security for advanced topics

---

**Last Updated**: April 2026
**Java Version**: 17
**Spring Framework Version**: 6.2.16
