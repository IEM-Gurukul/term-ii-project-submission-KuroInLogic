package service;

import model.Book;
import model.Member;
import model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<Book> books;
    private List<Member> members;
    private List<Transaction> transactions;

    public LibraryService() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered successfully.");
    }

    public void issueBook(int transactionId, Book book, Member member) {

        if (!book.isAvailable()) {
            System.out.println("Book is not available for issue.");
            return;
        }

        Transaction transaction = new Transaction(transactionId, book, member);

        transactions.add(transaction);

        book.setAvailability(false);

        member.borrowBook();

        System.out.println("Book issued successfully.");
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
