# Project Structure Guide

## Current Organization

The Spring projects are now organized following Maven conventions and best practices:

### Maven Project Structure

Every Maven project follows this standard structure:

```
project-name/
├── pom.xml                              # Maven configuration
├── README.md                            # Project documentation
├── src/
│   ├── main/
│   │   ├── java/                        # Java source code
│   │   │   └── com/package/
│   │   │       ├── Controller.java
│   │   │       ├── Service.java
│   │   │       ├── Repository.java
│   │   │       └── Entity.java
│   │   └── resources/                   # Configuration files
│   │       ├── application.properties
│   │       └── notes.txt
│   └── test/
│       └── java/                        # Unit tests
│           └── com/package/
│               └── *Test.java
└── target/                              # Build output (auto-generated)
    ├── classes/
    ├── test-classes/
    └── *.jar
```

## Projects Overview

### 1. DataJpaTask
**Purpose**: Spring Boot + JPA/Hibernate demonstration
**Technology**: Spring Boot 4.0.5, Java 21, Spring Data JPA
**Status**: ✅ Properly organized

```
DataJpaTask/
├── pom.xml                          (Spring Boot starter parent)
├── README.md                        (Project documentation)
├── src/
│   ├── main/
│   │   ├── java/com/aman/
│   │   │   ├── DataJpaTaskApplication.java
│   │   │   ├── entity/Product.java
│   │   │   ├── repository/ProductRepository.java
│   │   │   └── service/ProductService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/java/com/aman/demo/
│       └── DataJpaTaskApplicationTests.java
└── target/
```

**Key Files**:
- `pom.xml`: Spring Boot parent configuration
- `application.properties`: Database and JPA settings
- `entity/Product.java`: JPA entity
- `repository/ProductRepository.java`: Spring Data JPA repository
- `service/ProductService.java`: Business logic

---

### 2. DemoAnnotation
**Purpose**: Spring annotation-based configuration
**Technology**: Spring Core 6.2.16, Java 17, Maven
**Status**: ✅ Properly organized (Cleaned up)

```
DemoAnnotation/
├── pom.xml
├── README.md
├── src/
│   ├── main/java/com/nit/              (Clean - removed test files)
│   │   ├── Address.java
│   │   ├── App.java
│   │   ├── AppConfig.java
│   │   ├── Customer.java
│   │   └── CustomerAddress.java
│   └── test/java/com/nit/
│       └── AppTest.java
└── target/
```

**Changes Made**:
- ✅ Removed `test.java` (test code in wrong location)
- ✅ Removed `testDi.java` (misplaced test file)
- ✅ Removed `Untitled 1` (garbage file)

**Key Files**:
- `AppConfig.java`: Spring @Configuration class with @Bean definitions
- `App.java`: Main entry point with ApplicationContext
- `Customer.java` & `Address.java`: Entity classes showing DI

---

### 3. Dependency_Injection
**Purpose**: Spring Core dependency injection patterns
**Technology**: Spring Core 6.2.16, Java 17, Maven
**Status**: ✅ Restructured to Maven format

```
Dependency_Injection/
├── pom.xml                              (Created)
├── README.md                            (Created)
├── src/
│   ├── main/java/com/aman/
│   │   ├── Main.java
│   │   ├── ProductController.java
│   │   ├── ProductDAO.java
│   │   └── ProductService.java
│   └── test/java/com/aman/
└── target/
```

**Changes Made**:
- ✅ Removed `bin/` directory (compiled output)
- ✅ Removed `module-info.java` (not needed for Maven)
- ✅ Created proper directory structure:
  - `src/main/java/com/aman/` (from `src/com/aman/`)
  - `src/test/java/com/aman/` (empty but available)
- ✅ Created `pom.xml` for Maven build
- ✅ Created comprehensive `README.md`

**Key Files**:
- `Main.java`: Entry point demonstrating DI
- `ProductController.java`: Depends on ProductService
- `ProductService.java`: Depends on ProductDAO
- `ProductDAO.java`: Data access layer

---

### 4. Spring_Basic
**Purpose**: Spring Framework fundamentals
**Technology**: Spring Core 6.2.16, Java 17, Maven
**Status**: ✅ Restructured to Maven format

```
Spring_Basic/
├── pom.xml                              (Created)
├── README.md                            (Created)
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── DI.java                  (Moved from root)
│   │   └── resources/
│   │       └── notes.txt                (Moved from root as docs)
│   └── test/java/
└── target/
```

**Changes Made**:
- ✅ Removed `.metadata/` (Eclipse metadata)
- ✅ Removed nested `Dependency_Injection/` folder (duplicate)
- ✅ Created proper Maven structure:
  - `src/main/java/` (from root)
  - `src/main/resources/` (for configuration)
  - `src/test/java/` (for tests)
- ✅ Moved `DI.java` to `src/main/java/`
- ✅ Moved documentation to `src/main/resources/notes.txt`
- ✅ Created `pom.xml`
- ✅ Created comprehensive `README.md`

**Key Files**:
- `DI.java`: Dependency injection example with Engine/Car classes

---

## Cleanup Summary

### Files Removed
| File | Reason |
|------|--------|
| `A.txt` | Garbage file in Spring root |
| `DemoAnnotation/src/main/java/com/nit/test.java` | Misplaced test file |
| `DemoAnnotation/src/main/java/com/nit/testDi.java` | Misplaced test file |
| `DemoAnnotation/src/main/java/com/nit/Untitled 1` | Garbage file |
| `DemoAnnoation/` (entire folder) | Duplicate project |
| `Dependency_Injection/bin/` | Compiled output directory |
| `Dependency_Injection/src/module-info.java` | Not needed for Maven |
| `Spring_Basic/Dependency_Injection/` | Duplicate nested folder |
| `Spring_Basic/.metadata/` | Eclipse workspace metadata |

### Files Reorganized
| From | To | Reason |
|------|----|---------| 
| `DI.java` (root) | `src/main/java/DI.java` | Maven convention |
| `Full_Spring_module.txt` (root) | `src/main/resources/notes.txt` | Maven convention |

### Files Created
| File | Purpose |
|------|---------|
| `Dependency_Injection/pom.xml` | Maven build configuration |
| `Spring_Basic/pom.xml` | Maven build configuration |
| `README.md` (main Spring/) | Master documentation |
| `DataJpaTask/README.md` | Project documentation |
| `DemoAnnotation/README.md` | Project documentation |
| `Dependency_Injection/README.md` | Project documentation |
| `Spring_Basic/README.md` | Project documentation |
| `STRUCTURE.md` | This file - structure guide |

---

## Directory Structure After Cleanup

```
d:\PREPARE_JAVA_PLACEMENT\Spring\
├── README.md                            ← Main documentation
├── STRUCTURE.md                         ← This file
│
├── DataJpaTask/
│   ├── pom.xml
│   ├── README.md
│   ├── HELP.md
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── src/
│   │   ├── main/java/com/aman/
│   │   ├── main/resources/
│   │   └── test/java/com/aman/demo/
│   └── target/
│
├── DemoAnnotation/
│   ├── pom.xml
│   ├── README.md
│   ├── src/
│   │   ├── main/java/com/nit/
│   │   │   ├── Address.java
│   │   │   ├── App.java
│   │   │   ├── AppConfig.java
│   │   │   ├── Customer.java
│   │   │   └── CustomerAddress.java
│   │   └── test/java/com/nit/
│   │       └── AppTest.java
│   └── target/
│
├── Dependency_Injection/
│   ├── pom.xml                          ✨ NEW
│   ├── README.md                        ✨ NEW
│   ├── src/
│   │   ├── main/java/com/aman/
│   │   │   ├── Main.java
│   │   │   ├── ProductController.java
│   │   │   ├── ProductDAO.java
│   │   │   └── ProductService.java
│   │   └── test/java/com/aman/
│   └── target/
│
└── Spring_Basic/
    ├── pom.xml                          ✨ NEW
    ├── README.md                        ✨ NEW
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── DI.java
    │   │   └── resources/
    │   │       └── notes.txt
    │   └── test/java/
    └── target/
```

---

## Building All Projects

```bash
# Navigate to Spring folder
cd d:\PREPARE_JAVA_PLACEMENT\Spring

# Build each project
cd DataJpaTask && mvn clean install && cd ..
cd DemoAnnotation && mvn clean install && cd ..
cd Dependency_Injection && mvn clean install && cd ..
cd Spring_Basic && mvn clean install && cd ..

# Or build all at once with a parent pom
# (can create if needed)
```

---

## Next Steps

1. **Review Documentation**: Read each project's README.md
2. **Verify Builds**: Run `mvn clean install` on each project
3. **Run Applications**: Execute each project to verify they work
4. **Add Missing Configurations**: Add .gitignore, .editorconfig if needed
5. **Set Up CI/CD**: Configure GitHub Actions or similar

---

## Standards Applied

✅ **Maven Conventions**: All projects follow standard Maven directory layout
✅ **Consistent Naming**: Package and artifact names are consistent
✅ **Documentation**: Comprehensive README for each project
✅ **Code Organization**: Separation of concerns with layers
✅ **Java Version**: Consistent Java 17+ across projects
✅ **Dependency Management**: Centralized pom.xml configurations
✅ **No Garbage Files**: Removed all unnecessary files

---

## Interview Preparation

These projects are now organized for studying:
1. Spring Core concepts
2. Spring Boot applications
3. Dependency Injection patterns
4. JPA/Hibernate integration
5. Annotation-based configuration

Good luck with your Java placement preparation! 🚀

---

**Last Updated**: April 20, 2026
**Status**: Structure Optimized ✅
