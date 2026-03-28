# Library Management System

**Student:** Samriddha Chakraborty  
**Enrollment No.:** 12024052019037  
**Stream:** B.Tech — CSE (IoT)  
**Language:** Java (Core)

---

## Project Structure

```
LibraryManagementSystem/
│
├── src/
│   ├── Main.java
│   ├── Menu.java
│   ├── model/
│   │   ├── Book.java
│   │   ├── Member.java
│   │   └── Transaction.java
│   ├── service/
│   │   ├── LibraryService.java
│   │   └── BorrowService.java
│   └── util/
│       ├── FileHandler.java
│       └── Config.java
│
└── data/
    ├── books.dat
    ├── members.dat
    └── transactions.dat
```

---

## Classes

### `Book.java`
- Stores book details: ISBN, title, author, genre, total copies, available copies
- Methods: `borrowCopy()`, `returnCopy()`, `isAvailable()`

### `Member.java`
- Stores member details: member ID, name, email, phone, join date
- Methods: `register()`, `deactivate()`, `getBorrowHistory()`

### `Transaction.java`
- Records each borrow event: book, member, borrow date, due date, return date, fine
- Methods: `isOverdue()`, `calcFine()`, `markReturned()`

### `LibraryService.java`
- Core logic: `issueBook()`, `returnBook()`, `generateReport()`

### `FileHandler.java`
- Handles persistence: `saveData()`, `loadData()` using Java Serialisation

### `Config.java`
- Constants: `FINE_PER_DAY = 2`, `LENDING_DAYS = 14`

---

## Features

- Add / update / delete books and members
- Borrow and return books with due date tracking
- Auto fine calculation (Rs. 2/day overdue)
- Search by title, author, or ISBN
- Data saved to `.dat` files across sessions

---

## How to Run

```bash
# Compile
javac src/**/*.java -d out/

# Run
java -cp out/ Main
```
