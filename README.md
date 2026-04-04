# \# 🚀 Inventory Search API

# 

# \## 📌 Project Overview

# 

# This project is a \*\*RESTful Inventory Search API\*\* built using \*\*Spring Boot (Java 17)\*\*.

# It allows users to search inventory items using \*\*multiple optional filters (AND conditions)\*\*.

# 

# ---

# 

# \## 🛠️ Tech Stack

# 

# \* Java 17

# \* Spring Boot

# \* Spring Data JPA

# \* H2 Database

# \* Swagger (Springdoc OpenAPI)

# \* JUnit \& Mockito

# \* Docker

# 

# ---

# 

# \## 🔍 Features

# 

# \### ✅ Search API

# 

# \* Endpoint:

# &nbsp; `GET /api/inventory/search`

# 

# \* Supports optional filters:

# 

# &nbsp; \* `name`

# &nbsp; \* `category`

# &nbsp; \* `price`

# 

# \* Example:

# 

# &nbsp; ```

# &nbsp; /api/inventory/search?category=Electronics\&price=50000

# &nbsp; ```

# 

# ---

# 

# \### ✅ Dynamic Filtering

# 

# \* Implemented using \*\*JPA Specifications\*\*

# \* Supports flexible AND-based filtering

# \* Scalable and maintainable design

# 

# ---

# 

# \### ✅ Pagination \& Sorting

# 

# \* Supports pagination using `Pageable`

# 

# \* Example:

# 

# &nbsp; ```

# &nbsp; /api/inventory/search?page=0\&size=5

# &nbsp; ```

# 

# \* Response includes:

# 

# &nbsp; \* totalElements

# &nbsp; \* totalPages

# &nbsp; \* current page data

# 

# ---

# 

# \### ✅ Validation

# 

# \* Implemented using \*\*Jakarta Validation annotations\*\*

# \* Example:

# 

# &nbsp; ```java

# &nbsp; @Min(0)

# &nbsp; private Double price;

# &nbsp; ```

# 

# ---

# 

# \### ✅ Error Handling

# 

# \* Centralized using `@RestControllerAdvice`

# 

# \* Handles:

# 

# &nbsp; \* Validation errors

# &nbsp; \* Illegal arguments

# &nbsp; \* Generic exceptions

# 

# \* Sample error response:

# 

# &nbsp; ```json

# &nbsp; {

# &nbsp;   "timestamp": "...",

# &nbsp;   "status": 400,

# &nbsp;   "error": "Validation Error",

# &nbsp;   "message": "Price must be >= 0"

# &nbsp; }

# &nbsp; ```

# 

# ---

# 

# \### ✅ API Documentation (Swagger)

# 

# \* Swagger UI:

# 

# &nbsp; ```

# &nbsp; http://localhost:8080/swagger-ui/index.html

# &nbsp; ```

# 

# \* OpenAPI JSON:

# 

# &nbsp; ```

# &nbsp; http://localhost:8080/v3/api-docs

# &nbsp; ```

# 

# ---

# 

# \### ✅ Database (H2)

# 

# \* In-memory database used for development

# \* Console:

# 

# &nbsp; ```

# &nbsp; http://localhost:8080/h2-console

# &nbsp; ```

# 

# ---

# 

# \### ✅ Unit Testing

# 

# \* Implemented using \*\*JUnit \& Mockito\*\*

# \* Service layer tested

# \* Repository interactions mocked

# 

# ---

# 

# \### ✅ Docker Support

# 

# \* Dockerized application

# 

# \#### Build:

# 

# ```

# docker build -t inventory-api .

# ```

# 

# \#### Run:

# 

# ```

# docker run -p 8080:8080 inventory-api

# ```

# 

# ---

# 

# \## 📄 OpenAPI YAML

# 

# \* File: `openapi.yaml`

# \* Included for documentation and assignment submission

# 

# ---

# 

# \## 📂 Project Structure

# 

# ```

# controller → service → repository → entity

# ```

# 

# ---

# 

# \## ▶️ How to Run

# 

# \### 1. Build project

# 

# ```

# mvn clean install

# ```

# 

# \### 2. Run application

# 

# ```

# mvn spring-boot:run

# ```

# 

# ---

# 

# \## 🧪 Example API Calls

# 

# \### Get all electronics

# 

# ```

# /api/inventory/search?category=Electronics

# ```

# 

# \### Search by name

# 

# ```

# /api/inventory/search?name=iphone

# ```

# 

# \### With pagination

# 

# ```

# /api/inventory/search?category=Electronics\&page=0\&size=2

# ```

# 

# ---

# 

# \## 💡 Assumptions

# 

# \* All filters are optional

# \* Filters are applied using AND condition

# \* Name search is case-insensitive

# 

# ---

# 

# \## 🎯 Conclusion

# 

# This project demonstrates:

# 

# \* Clean architecture

# \* Scalable search implementation

# \* Proper validation and error handling

# \* API documentation

# \* Unit testing and containerization

# 

# ---

# 

# \## 👨‍💻 Author

# 

# Your Name



