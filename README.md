# 🚀 Inventory Search API

## 📌 Project Overview

This project is a **RESTful Inventory Search API** built using **Spring Boot (Java 17)**.
It allows users to search inventory items using **multiple optional filters (AND conditions)**.

- [Docker Image Creation](https://github.com/voorevamshi/Docker/blob/main/jarToDockerImage.md)
- [Running Docker Image on EC2](https://github.com/voorevamshi/Docker/blob/main/ec2DockerImageRunningCommands.md))
- [Kubernetes Deploy](https://github.com/voorevamshi/Kubernetes/blob/main/workloads/deployments%20/InventoryApiDeployment.md)

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database
* Swagger (Springdoc OpenAPI)
* JUnit & Mockito
* Docker

---

## 🔍 Features

### ✅ Search API

* Endpoint:
  `GET /api/inventory/search`

* Supports optional filters:

  * `name`
  * `category`
  * `price`

* Example:

  ```
  /api/inventory/search?category=Electronics&price=50000
  ```

---

### ✅ Dynamic Filtering

* Implemented using **JPA Specifications**
* Supports flexible AND-based filtering
* Scalable and maintainable design

---

### ✅ Pagination & Sorting

* Supports pagination using `Pageable`

* Example:

  ```
  /api/inventory/search?page=0&size=5
  ```

* Response includes:

  * totalElements
  * totalPages
  * current page data

---

### ✅ Validation

* Implemented using **Jakarta Validation annotations**
* Example:

  ```java
  @Min(0)
  private Double price;
  ```

---

### ✅ Error Handling

* Centralized using `@RestControllerAdvice`

* Handles:

  * Validation errors
  * Illegal arguments
  * Generic exceptions

* Sample error response:

  ```json
  {
    "timestamp": "...",
    "status": 400,
    "error": "Validation Error",
    "message": "Price must be >= 0"
  }
  ```

---

### ✅ API Documentation (Swagger)

* Swagger UI:

  ```
  http://localhost:8080/swagger-ui/index.html
  ```

* OpenAPI JSON:

  ```
  http://localhost:8080/v3/api-docs
  ```

---

### ✅ Database (H2)

* In-memory database used for development
* Console:

  ```
  http://localhost:8080/h2-console
  ```

---

### ✅ Unit Testing

* Implemented using **JUnit & Mockito**
* Service layer tested
* Repository interactions mocked

---

### ✅ Docker Support

* Dockerized application

#### Build:

```
docker build -t inventory-api .
```

#### Run:

```
docker run -p 8080:8080 inventory-api
```

---

## 📄 OpenAPI YAML

* File: `openapi.yaml`
* Included for documentation and assignment submission

---

## 📂 Project Structure

```
controller → service → repository → entity
```

---

## ▶️ How to Run

### 1. Build project

```
mvn clean install
```

### 2. Run application

```
mvn spring-boot:run
```

---

## 🧪 Example API Calls

### Get all electronics

```
/api/inventory/search?category=Electronics
```

### Search by name

```
/api/inventory/search?name=iphone
```

### With pagination

```
/api/inventory/search?category=Electronics&page=0&size=2
```

---

## 💡 Assumptions

* All filters are optional
* Filters are applied using AND condition
* Name search is case-insensitive

---

## 🎯 Conclusion

This project demonstrates:

* Clean architecture
* Scalable search implementation
* Proper validation and error handling
* API documentation
* Unit testing and containerization

---

## 👨‍💻 Author

Your Name
