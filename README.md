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
