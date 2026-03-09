package com.Library;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n---- Library Management System ----");
            System.out.println("1 Add Book");
            System.out.println("2 View Books");
            System.out.println("3 Search Book");
            System.out.println("4 Issue Book");
            System.out.println("5 Return Book");
            System.out.println("6 Delete Book");
            System.out.println("7 Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    Book book = new Book(id, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    library.searchBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    library.issueBook(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    library.returnBook(sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter Book ID: ");
                    library.deleteBook(sc.nextInt());
                    break;

                case 7:
                    System.out.println("Program ended");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }

	}

}
