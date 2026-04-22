```src/
  ├── main/java/com/[package]/*.java
  ├── main/resources/
  └── test/java/com/[package]/*Test.java
pom.xml
README.md

Study the projects in order:
 Spring_Basic → Dependency_Injection → DemoAnnotation → DataJpaTask

 Customer-order-Task:
 com.aman.customerorders
│
├── CustomerOrdersApplication.java   🚀 (main class)
│
├── controller                      🌐 (API layer)
│     ├── CustomerController.java
│     └── OrderController.java
│
├── service                         ⚙️ (business logic)
│     ├── CustomerService.java
│     ├── OrderService.java
│     └── impl
│          ├── CustomerServiceImpl.java
│          └── OrderServiceImpl.java
│
├── repository                      🗃️ (DB access)
│     ├── CustomerRepository.java
│     ├── CustomerProfileRepository.java
│     └── OrderRepository.java
│
├── entity                          🧱 (JPA entities)
│     ├── Customer.java
│     ├── CustomerProfile.java
│     └── Order.java
│
├── dto                             📦 (data transfer)
│     ├── CustomerRequest.java
│     └── OrderRequest.java
│
├── config                          🔧 (configurations)
│     └── AppConfig.java
│
└── exception                       ❗ (error handling)
      ├── GlobalExceptionHandler.java
      └── ResourceNotFoundException.java```
