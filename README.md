# MyJDBC
# 🔗 JDBC Practice Repository

This repository contains various **Java JDBC programs** written to practice and demonstrate how Java applications connect to relational databases using the **JDBC (Java Database Connectivity)** API.

## 📘 What is JDBC?

JDBC is a standard Java API used to interact with relational databases like **MySQL**, **Oracle**, **PostgreSQL**, etc. It enables Java programs to execute SQL queries, retrieve results, and perform database operations directly.

## 📦 Project Descriptions

### 1. 🧪 JdbcDemo

> Basic example showing how to connect to a database and run a simple query.

- Load JDBC driver
- Establish a connection
- Execute a SELECT query
- Print results to the console

### 2. ✍️ JdbcCrudDemo

> Demonstrates full CRUD (Create, Read, Update, Delete) operations using JDBC.

- `InsertData.java`: Insert new records
- `ReadData.java`: Fetch and display records
- `UpdateData.java`: Update existing records
- `DeleteData.java`: Delete records
- Uses **PreparedStatement** for secure parameterized queries

### 3. 🚀 JdbcBatchDemo

> Shows how to execute multiple SQL statements efficiently using **batch processing**.

- Adds multiple insert statements into a batch
- Executes all in a single call
- Great for performance in large inserts

---
## 🛠️ Technologies Used

- Java SE 8 or above
- JDBC API
- MySQL 
- OracleSQL JDBC Driver 
- IDE: VS Code / IntelliJ / Eclipse

## 🚀 How to Run

1. Make sure **Oracle server** is running.
2. Create a database and required tables manually or via script.
3. Download or clone the repository:
   ```bash
   git clone https://github.com/yourusername/jdbc-practice.git
