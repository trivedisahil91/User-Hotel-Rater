```markdown
# 🌟 User-Hotel-Rater

A **Microservices-based Project** for managing **Users**, **Hotels**, and their **Ratings**.  
This project demonstrates how different services can interact with each other using REST APIs. 🚀  

---

## 🏛 Architecture Overview

```

👤 User Service  <---->  ⭐ Rating Service  <---->  🏨 Hotel Service

```

- **👤 User Service** → Manages user details.  
- **🏨 Hotel Service** → Manages hotel details and fetches hotel ratings.  
- **⭐ Rating Service** → Manages ratings given by users to hotels.  

---

## ⚙️ Tech Stack

- ☕ **Java 17+ / Spring Boot**  
- 🌐 **Spring Cloud** (for microservices communication)  
- 🗄 **MySQL** (Database)  
- 📦 **Maven** (Build tool)  
- 🔗 **REST APIs**  

---

## 📂 Project Structure

```

User-Hotel-Rater/
│
├── user-service/       👤 User Management
├── hotel-service/      🏨 Hotel Management
├── rating-service/     ⭐ Rating Management
└── README.md

````

---

## 🚀 Getting Started

### ✅ Prerequisites
Make sure you have installed:
- Java 17+  
- Maven 3+  
- MySQL  

### ▶️ Run Locally
1. Clone the repo:  
   ```bash
   git clone https://github.com/trivedisahil91/User-Hotel-Rater.git
   cd User-Hotel-Rater
````

2. Import all **3 services** into your IDE (IntelliJ / Eclipse).

3. Configure **database** in each service’s `application.properties`.

4. Start services one by one:

   ```bash
   mvn spring-boot:run
   ```

---

## 🌐 Service Endpoints

### 👤 User Service (default: `http://localhost:8081`)

* `POST /users` → Create new user
* `GET /users/{userId}` → Get user details

### 🏨 Hotel Service (default: `http://localhost:8082`)

* `POST /hotels` → Create new hotel
* `GET /hotels/{hotelId}` → Get hotel details

### ⭐ Rating Service (default: `http://localhost:8083`)

* `POST /ratings` → Add new rating
* `GET /ratings/user/{userId}` → Get ratings by user
* `GET /ratings/hotel/{hotelId}` → Get ratings of a hotel

---

## 📌 Sample API Usage

### ➕ Add User

```json
POST /users
{
  "name": "Sahil",
  "email": "sahil@example.com",
  "about": "Software Developer"
}
```

### ➕ Add Hotel

```json
POST /hotels
{
  "name": "Taj Hotel",
  "location": "Mumbai",
  "about": "Luxury hotel in Mumbai"
}
```

### ➕ Add Rating

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
* 📊 API Gateway & Service Registry
* 🐳 Docker + Kubernetes Deployment
* 📈 Centralized Logging & Monitoring

---

## 👨‍💻 Author

**Sahil Trivedi**
🔗 [GitHub Profile](https://github.com/trivedisahil91)

---

```

---
