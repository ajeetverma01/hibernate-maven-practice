# Hibernate Practice

This is a simple Java project demonstrating how to use **Hibernate ORM** with **Maven**. It includes basic CRUD operations and uses MySQL as the database.

## 🔧 Technologies Used

- Java
- Hibernate (ORM)
- Maven
- MySQL
- JDBC
- JPA Annotations

## 📁 Project Structure

```
Hibernate-practice/
├── .idea/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/
│   │   │       └── App.java
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

## 🚀 How to Run

1. **Clone the repo**
   ```bash
   git clone https://github.com/ajeetverma01/hibernate-maven-practice.git
   ```

2. **Import into your IDE** (IntelliJ IDEA, Eclipse, etc.)

3. **Set up MySQL Database**
    - Create a database (e.g., `my_hibernate_db`)
    - Update your DB credentials in `hibernate.cfg.xml`

4. **Build the project**
   ```bash
   mvn clean install
   ```

5. **Run the main class**
    - Run the `App.java` to test the Hibernate CRUD operations

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