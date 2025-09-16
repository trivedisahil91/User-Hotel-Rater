# 🌟 User-Hotel-Rater

A **Microservices-based Project** for managing **Users 👤**, **Hotels 🏨**, and their **Ratings ⭐**.  
This project demonstrates how different services interact with each other using **REST APIs**. 🚀  

---

## 🏛️ Architecture Overview

```

👤 User Service  <---->  ⭐ Rating Service  <---->  🏨 Hotel Service

```

- **👤 User Service** → Manages user details  
- **🏨 Hotel Service** → Manages hotel details & fetches hotel ratings  
- **⭐ Rating Service** → Manages ratings between users & hotels  

---

## ⚙️ Tech Stack

| Technology | Purpose |
|------------|---------|
| ☕ **Java 17+ / Spring Boot** | Backend framework for microservices |
| 🌐 **Spring Cloud** | Microservice communication & configuration |
| 🗄 **MySQL** | Database for storing entities |
| 📦 **Maven** | Build & dependency management |
| 🔗 **REST APIs** | Service-to-service communication |

---

## 📂 Project Structure

```

User-Hotel-Rater/
│
├── user-service/       👤 Handles User Management
├── hotel-service/      🏨 Handles Hotel Management
├── rating-service/     ⭐ Handles Rating Management
└── README.md           📘 Project Documentation

````

---

## 🚀 Getting Started

### ✅ Prerequisites
- Java 17+  
- Maven 3+  
- MySQL  

---

### ▶️ Run Locally

1. **Clone the repository**  
   ```bash
   git clone https://github.com/trivedisahil91/User-Hotel-Rater.git
   cd User-Hotel-Rater
````

2. **Import services**

   ```bash
   Import all **3 services** (`user-service`, `hotel-service`, `rating-service`) into your IDE (IntelliJ / Eclipse).
````
3. **Configure database**
   ```bash
   Update `application.properties` in each service with your **MySQL username & password**.
````
5. **Start services**

   ```bash
   mvn spring-boot:run
````

---

## 🌐 Service Endpoints

| Service              | Port   | Endpoints                                                                             | Description          |
| -------------------- | ------ | ------------------------------------------------------------------------------------- | -------------------- |
| 👤 **User Service**  | `8081` | `POST /users` <br> `GET /users/{userId}`                                              | Manage user details  |
| 🏨 **Hotel Service** | `8082` | `POST /hotels` <br> `GET /hotels/{hotelId}`                                           | Manage hotel details |
| ⭐ **Rating Service** | `8083` | `POST /ratings` <br> `GET /ratings/user/{userId}` <br> `GET /ratings/hotel/{hotelId}` | Manage ratings       |

---

## 📌 Sample API Usage

### 👤 Add User

```json
POST /users
{
  "name": "Sahil",
  "email": "sahil@example.com",
  "about": "Software Developer"
}
```

### 🏨 Add Hotel

```json
POST /hotels
{
  "name": "Taj Hotel",
  "location": "Mumbai",
  "about": "Luxury hotel in Mumbai"
}
```

### ⭐ Add Rating

```json
POST /ratings
{
  "userId": "123",
  "hotelId": "456",
  "rating": 5,
  "feedback": "Excellent service!"
}
```

---

## 🔮 Future Enhancements

* 🛡 Add **JWT Authentication & Authorization**
* 📊 Implement **API Gateway & Service Registry**
* 🐳 Deploy with **Docker & Kubernetes**
* 📈 Add **Centralized Logging & Monitoring**

---

## 👨‍💻 Author

**Sahil Trivedi**
🔗 [GitHub Profile](https://github.com/trivedisahil91)

---
