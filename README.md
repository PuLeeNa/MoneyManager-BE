# Money Manager - Backend
On-Going project......

A Spring Boot application for managing personal finances.

## Technologies Used

- Java 21
- Spring Boot 3.5.6
- Spring Data JPA
- MySQL
- Spring Boot Mail
- Lombok

## Prerequisites

- JDK 21 or higher
- MySQL database
- Maven 3.6+ (or use the included Maven wrapper)

## Getting Started

### Configuration

Configure your database connection in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/moneymanager
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Running the Application

Using Maven wrapper:
```bash
./mvnw spring-boot:run
```

Or on Windows:
```bash
mvnw.cmd spring-boot:run
```

## Building the Project

```bash
./mvnw clean package
```

## License

This project is for educational purposes.

