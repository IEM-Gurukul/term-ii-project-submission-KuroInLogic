package service;

import model.Book;
import model.Member;
import model.Transaction;
import exception.BookNotAvailableException;

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

    public void issueBook(int transactionId, Book book, Member member) throws BookNotAvailableException {

        if (!book.isAvailable()) {
            throw new BookNotAvailableException("Book is not available for issue.");
        }

        Transaction transaction = new Transaction(transactionId, book, member);

        transactions.add(transaction);

        book.setAvailability(false);

        member.borrowBook();

        System.out.println("Book issued successfully.");
    }

    public void returnBook(int transactionId) {

        for (Transaction transaction : transactions) {

            if (transaction.getTransactionId() == transactionId) {

                if (transaction.getReturnDate() != null) {
                    System.out.println("Book already returned.");
                    return;
                }

                transaction.returnBook();

                Book book = transaction.getBook();
                book.setAvailability(true);

                Member member = transaction.getMember();
                member.returnBook();

                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Transaction not found.");
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
