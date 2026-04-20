# DataJpaTask - Spring Boot JPA Demo

## Project Description
This is a Spring Boot application demonstrating Spring Data JPA and Hibernate for database operations.

## Technology Stack
- **Framework**: Spring Boot 4.0.5
- **ORM**: Hibernate / Spring Data JPA
- **Java**: 21
- **Build Tool**: Maven

## Project Structure
```
DataJpaTask/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/com/aman/
│   │   │   ├── DataJpaTaskApplication.java (Entry point)
│   │   │   ├── entity/
│   │   │   │   └── Product.java
│   │   │   ├── repository/
│   │   │   │   └── ProductRepository.java
│   │   │   └── service/
│   │   │       └── ProductService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/java/com/aman/demo/
│       └── DataJpaTaskApplicationTests.java
└── target/
```

## Key Components

### Entity: Product
The main entity class representing a product in the database.

### Repository: ProductRepository
Extends JpaRepository to provide CRUD operations and custom queries.

### Service: ProductService
Business logic layer for product operations.

### Main Application
DataJpaTaskApplication - Spring Boot entry point.

## Building the Project

```bash
# Clean and install
mvn clean install

# Run the application
mvn spring-boot:run

# Run tests
mvn test
```

## Configuration

Edit `src/main/resources/application.properties`:
```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/product_db
spring.datasource.username=root
spring.datasource.password=password

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Learning Objectives

1. Understand JPA entity mapping
2. Learn repository pattern in Spring
3. Master CRUD operations
4. Understand relationships (OneToMany, ManyToOne, etc.)
5. Query optimization and performance

## Common JPA Queries

```java
// Basic CRUD
productRepository.save(product);
productRepository.findById(1L);
productRepository.findAll();
productRepository.deleteById(1L);

// Custom queries
List<Product> products = productRepository.findByName("Laptop");
```

## Troubleshooting

### Database connection error
- Verify MySQL is running
- Check connection properties in application.properties
- Ensure database exists

### Compilation errors
- Ensure Java 21 is installed
- Run `mvn clean compile`

## Next Steps

1. Add more entities (Category, Order, etc.)
2. Implement relationships
3. Create custom queries
4. Add pagination and sorting
5. Implement caching strategies

---

**Last Updated**: April 2026
