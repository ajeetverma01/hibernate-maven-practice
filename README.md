# Hibernate Practice

This is a simple Java project demonstrating how to use **Hibernate ORM** with **Maven**. It includes basic CRUD operations and uses MySQL as the database.

## 🔧 Concepts Used

- Java
- Hibernate (ORM)
- HQL
- Maven
- MySQL
- JDBC
- Mapping
- JPA Annotations
- pagination
- Caching
- Cascading

## 📁 Project Structure

```
Hibernate-practice/
├── .idea/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/mapping/
│   │   │   ├── HQL/
│   │   │   └── org/example/
│   │   │   |    ├── App.java
│   │   │   |   └── a.png
|   |   |   └──Pagination
|   |   |   └──CasCading
|   |   |   └──Caching
│   │   └── resources/
│   │       └── hibernate.cfg.xml
│   └── test/
│       └── java/
│           └── org/example/
│               └── AppTest.java
├── .gitignore
├── pom.xml
├── README.md
```

## 📌 Features

- Hibernate configuration using XML
- Basic CRUD operations {Create, Read, Update (in progress), Delete (in progress)}
- Entity class with JPA annotations
- Maven-based project setup
- MySQL database connection
- HQL

## 🗃️ Sample Entity

```java
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    private String email;
    
    // Getters and setters
}
```

## 📄 License

This project is open source and free to use.

---

## ✍️ Author

**Ajeet Verma**  
_Computer Science Student | Java Full Stack Developer_