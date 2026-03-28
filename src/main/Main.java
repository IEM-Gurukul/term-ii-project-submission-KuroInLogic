package main;

import model.Book;
import model.Member;
import service.LibraryService;
import exception.BookNotAvailableException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LibraryService service = new LibraryService();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    Book book = new Book(bookId, title, author);
                    service.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Member member = new Member(memberId, name, email);
                    service.registerMember(member);
                    break;

                case 3:
                    try {
                        System.out.print("Enter Transaction ID: ");
                        int tId = sc.nextInt();

                        System.out.print("Enter Book ID: ");
                        int bId = sc.nextInt();

                        System.out.print("Enter Member ID: ");
                        int mId = sc.nextInt();

                        Book foundBook = service.searchBookById(bId);
                        Member foundMember = null;

                        for (Member m : service.getMembers()) {
                            if (m.getUserId() == mId) {
                                foundMember = m;
                                break;
                            }
                        }

                        if (foundBook == null || foundMember == null) {
                            System.out.println("Invalid book or member.");
                        } else {
                            service.issueBook(tId, foundBook, foundMember);
                        }

                    } catch (BookNotAvailableException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter Transaction ID: ");
                    int returnId = sc.nextInt();
                    service.returnBook(returnId);
                    break;

                case 5:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();

                    Book found = service.searchBookById(searchId);

                    if (found != null) {
                        System.out.println("Book Found: " + found.getTitle());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}