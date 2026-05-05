# gestione-documentale

A Spring Boot application with clean architecture and modular design.

## Project Structure

```
src/main/java/com/example/gestione-documentale/
├── controller/      # REST endpoints and request handlers
├── service/         # Business logic and service layer
├── repository/      # Data access layer (JPA repositories)
├── entity/          # JPA entity classes
├── dto/             # Data transfer objects
├── mapper/          # Entity to DTO converters
├── exception/       # Custom exceptions and handlers
├── config/          # Spring configuration classes
├── util/            # Utility and helper classes
└── constants/       # Application constants
```

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- MySQL 8.0+

### Installation

1. Clone the repository
2. Navigate to the project directory
3. Create a database: `CREATE DATABASE gestione-documentale;`
4. Configure `application.properties` with your database details
5. Run: `mvn clean install`
6. Start the application: `mvn spring-boot:run`

### Configuration

Copy `.env.example` to `.env` and update with your configuration:

```properties
SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/gestione-documentale
SPRING_DATASOURCE_USERNAME=root
SPRING_DATASOURCE_PASSWORD=
SPRING_JPA_HIBERNATE_DDL_AUTO=update
```

## API Documentation

Once the application is running, access Swagger UI at:
`http://localhost:8080/swagger-ui.html`

## Built With

- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Lombok
- Maven

## License

This project is licensed under the MIT License.
# Spring Boot Webapp Template

Progetto di partenza per webapp Spring Boot 3 con PostgreSQL, Flyway e Coder devcontainer.

## Stack

- Java 21 + Spring Boot 3.3
- Spring Data JPA + Hibernate
- PostgreSQL 16 (dev) / H2 (test)
- Flyway per le migration DB
- Lombok
- Spring Boot DevTools (hot reload)
- Spring Boot Actuator

## Avvio locale (con PostgreSQL già attivo)

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

## Endpoint REST

| Metodo | URL                    | Descrizione           |
|--------|------------------------|-----------------------|
| GET    | /api/articoli          | Lista tutti           |
| GET    | /api/articoli?search=X | Ricerca per nome      |
| GET    | /api/articoli/{id}     | Dettaglio             |
| POST   | /api/articoli          | Crea nuovo            |
| PUT    | /api/articoli/{id}     | Aggiorna              |
| DELETE | /api/articoli/{id}     | Elimina               |
| GET    | /actuator/health       | Health check          |

## Git pre-commit hook

```bash
git config core.hooksPath .githooks
```

## Profili

- `dev` — PostgreSQL locale, SQL logging attivo
- `test` — H2 in-memory, Flyway disabilitato
