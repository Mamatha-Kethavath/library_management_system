Library Management System – Java (Swing + JDBC + MySQL)

This project is a simple Library Management System built using Java Swing, JDBC, and MySQL.
It allows librarians or admins to manage books, track availability, and handle issuing/returning operations.

🚀 Features

Add new books

View all available books

Update book details

Delete books

Issue books to users

Return books

Auto-calculated late fees

MySQL database integration

🛠️ Technologies Used

Java (Swing) – GUI

JDBC – Database Connectivity

MySQL – Data Storage

MySQL Connector/J – JDBC Driver

Apache Tomcat (Only if Servlet version is used)

🗂️ Project Structure
src/
 ├── dao/
 │     ├── BookDAO.java
 │     ├── UserDAO.java
 │     └── IssueDAO.java
 ├── model/
 │     ├── Book.java
 │     ├── User.java
 │     └── Issue.java
 ├── Main.java
 └── DbConnection.java

🧰 Database Setup

Create database:

CREATE DATABASE jdbc_steps;
USE jdbc_steps;


Create tables:

CREATE TABLE books (
   id INT PRIMARY KEY AUTO_INCREMENT,
   title VARCHAR(200),
   author VARCHAR(200),
   copies INT
);

▶️ How to Run

Install MySQL

Create the database & tables

Open project in Eclipse/IntelliJ

Add MySQL connector jar to Build Path

Run Main.java


📝 Future Enhancements

Login system

Admin dashboard

Search & filter books

Export reports

🤝 Contributions

Contributions are welcome!
Feel free to fork this repo and create pull requests.

📧 Contact

For queries or help:
Mamatha Kethavath
