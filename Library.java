package com.Library;
import java.util.ArrayList;
public class Library {
	ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");
    }

    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void searchBook(int id) {

        for (Book b : books) {

            if (b.getId() == id) {
                System.out.println("Book found:");
                System.out.println(b);
                return;
            }

        }

        System.out.println("Book not found");
    }

    public void deleteBook(int id) {

        for (Book b : books) {

            if (b.getId() == id) {
                books.remove(b);
                System.out.println("Book deleted");
                return;
            }

        }

        System.out.println("Book not found");
    }

    public void issueBook(int id) {

        for (Book b : books) {

            if (b.getId() == id) {

                if (!b.isIssued()) {
                    b.issueBook();
                    System.out.println("Book issued");
                } else {
                    System.out.println("Book already issued");
                }

                return;
            }

        }

        System.out.println("Book not found");
    }

    public void returnBook(int id) {

        for (Book b : books) {

            if (b.getId() == id) {

                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book returned");
                } else {
                    System.out.println("Book was not issued");
                }

                return;
            }

        }

        System.out.println("Book not found");
    }

}
