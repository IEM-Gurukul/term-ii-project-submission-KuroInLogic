package model;

import java.time.LocalDate;

public class Transaction {

    private int transactionId;
    private Book book;
    private Member member;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Transaction(int transactionId, Book book, Member member) {
        this.transactionId = transactionId;
        this.book = book;
        this.member = member;
        this.issueDate = LocalDate.now();
        this.returnDate = null;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
    }
}
