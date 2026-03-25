[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Library Management System
---

## Problem Statement
Libraries often rely on manual record keeping or poorly structured systems to manage books and users. This can lead to errors in tracking book availability, issuing records, and managing member information. The goal of this project is to design a modular Library Management System using Java and Object-Oriented Programming principles. The system will allow librarians to manage books and members, track issued and returned books, and maintain organized records of library activities. By applying concepts such as abstraction, inheritance, encapsulation, and exception handling, the project demonstrates how real-world systems can be modeled using object-oriented design. The implementation focuses on clean code structure, maintainability, and logical separation of responsibilities across classes and packages.
---

## Target User
- Librarians
- Library administrators
- Small institutional libraries (schools or colleges)
---

## Core Features
- Add and manage books in the library
- Register and manage library members
- Issue books to members
- Return books and update availability
- Track book borrowing records
- Search books by title or ID

---

## OOP Concepts Used
- Abstraction: The User class is implemented as an abstract class to define common properties of system users.
- Inheritance: Member and Librarian classes extend the User class to reuse common attributes and behavior.
- Polymorphism: Different user types (Member and Librarian) will interact with the system differently through inherited methods.
- Exception Handling: Different user types (Member and Librarian) will interact with the system differently through inherited methods.
- Collections / Threads: Java Collections (such as ArrayList) will be used to store books, users, and transactions dynamically.

---

## Proposed Architecture Description
The system follows a modular object-oriented architecture organized into multiple packages. The model package contains core entities such as Book, User, Member, Librarian, and Transaction. The service package will handle business logic such as issuing or returning books. The util package will contain helper classes such as file handling utilities. The exception package will store custom exceptions used to handle invalid library operations. The main package will contain the entry point of the program and provide a console-based interface for interacting with the system.
---

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
