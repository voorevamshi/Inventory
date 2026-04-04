# Inventory Search API

## Features
- Dynamic filtering (AND conditions)
- OpenAPI docs
- H2 DB
- Clean architecture

## Run
mvn spring-boot:run

## Example
GET /api/inventory/search?name=phone&category=electronics

## Assumptions
- All filters optional
- Case-insensitive search for name

## Bonus
- Pagination can be added using Pageable
- Unit tests can be added using JUnit
