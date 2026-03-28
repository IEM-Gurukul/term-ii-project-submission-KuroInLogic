[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
**Library Management System**

---

## Problem Statement
Libraries often rely on manual record keeping or poorly structured systems to manage books and users. This can lead to errors in tracking book availability, issuing records, and managing member information.

The goal of this project is to design a modular Library Management System using Java and Object-Oriented Programming principles. The system allows librarians to manage books and members, track issued and returned books, and maintain organized records of library activities.

By applying concepts such as abstraction, inheritance, encapsulation, and exception handling, the project demonstrates how real-world systems can be modeled using object-oriented design. The implementation focuses on clean code structure, maintainability, and logical separation of responsibilities across classes and packages.

---

## Target Users
- Librarians  
- Library administrators  
- Small institutions  

---

## Core Features
- Add and manage books  
- Register members  
- Issue books  
- Return books  
- Search books  

---

## OOP Concepts Used

**Abstraction**  
- Implemented using the abstract `User` class  

**Inheritance**  
- `Member` and `Librarian` extend `User`  

**Polymorphism**  
- Different user types interact with shared methods  

**Encapsulation**  
- Private fields with public getters/setters  

**Exception Handling**  
- Custom exception for unavailable books  

**Collections**  
- `ArrayList` used to store books, members, and transactions  

---

## Project Structure

- **term-ii-project-submission-KuroInLogic/**
  - **docs/**
    - system_overview.md
    - class_description.md
    - how_to_run.md
    - features.md

  - **report/**
    - project_report.pdf

  - **slides/**
    - presentation.pptx

  - **src/**
    - **model/**
      - Book.java
      - User.java
      - Member.java
      - Librarian.java
      - Transaction.java

    - **service/**
      - LibraryService.java

    - **exception/**
      - BookNotAvailableException.java

    - **main/**
      - Main.java

  - README.md
  - .gitignore


## How to Run
1. Clone the repository from GitHub.
2. Open the project in a Java IDE (VS Code / IntelliJ / Eclipse).
3. Ensure Java JDK is installed.
4. Navigate to the main package.
5. Run the Main.java file to start the application.
---

## Git Discipline Notes
This project follows a structured Git workflow with incremental commits demonstrating step-by-step development of the system. Each commit introduces meaningful functionality such as model classes, inheritance structures, service logic, and exception handling.

Minimum 10 meaningful commits will be maintained throughout the development process.
