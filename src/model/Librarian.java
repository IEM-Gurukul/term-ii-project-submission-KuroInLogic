package model;

public class Librarian extends User {

    public Librarian(int userId, String name, String email) {
        super(userId, name, email);
    }

    public void manageLibrary() {
        System.out.println("Librarian managing the library system.");
    }
}
