package model;

public class Member extends User {

    private int borrowedBooks;

    public Member(int userId, String name, String email) {
        super(userId, name, email);
        this.borrowedBooks = 0;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void incrementBorrowedBooks() {
        borrowedBooks++;
    }

    public void decrementBorrowedBooks() {
        borrowedBooks--;
    }
}
