package com.company.librarymanagement.service;

import com.company.librarymanagement.dao.BookDAO;
import com.company.librarymanagement.dao.MemberDAO;
import com.company.librarymanagement.model.Book;
import com.company.librarymanagement.model.Member;

import java.sql.SQLException;
import java.util.Scanner;

public class LibraryService {

    /*
    Library Services are:
    addBook
    addMember
     */

    private  BookDAO bookDAO=new BookDAO();  // Cannot be accessed the outside LibraryServices Class.
    private MemberDAO memberDAO=new MemberDAO();
    public static void main(String[] args) throws SQLException {

        LibraryService libraryService=new LibraryService();
        libraryService.showMenu();


    }
    public void showMenu()
    {
        Scanner scanner=new Scanner(System.in);

        boolean exit=false;

        while (!exit)
        {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Show Books");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.println("Enter the Choice");
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    addBook();
                    break;
                case 2:
                    addMember();
                    break;
                case 3:
                    bookDAO.showBooks();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    exit=true;
                    System.out.println("Exiting the System Good Bye..");
                    break;
                default:
                    System.out.println("Invalid Choice Please try again Later..");
            }

        }
        scanner.close();
    }

    public void  addBook()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Book Title.");
        String title=scanner.nextLine();
        System.out.println("Enter Book Author Name. ");
        String author=scanner.nextLine();
        System.out.println("Enter Gener(Fictional / Non Fictional).");
        String gener=scanner.nextLine();
        System.out.println("Enter Publication Year.");
        int year=scanner.nextInt();
        System.out.println("Enter Available Copies.");
        int copies=scanner.nextInt();

        Book newBook=new Book(title,author,gener,year,copies);

        try {
            boolean isAdded=bookDAO.addBook(newBook);
            if (isAdded) {
                System.out.println("Book Added Successfully");
            }else{
                System.out.println("Failed to Add the Book.");
            }
        }catch (Exception e)
        {
            System.out.println("Error Occurred while adding the Book"+e.getMessage());
        }
    }

    public  void addMember()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Member Name.");
        String name=scanner.next();
        System.out.println("Enter MemberShip Date");
        String date=scanner.next();
        System.out.println("Enter Email Address..");
        String email=scanner.next();

        Member member=new Member(name,date,email);

        try {
            boolean isAdded=memberDAO.addMember(member);
            if (isAdded) {
                System.out.println("Member Added Successfully..");
            }else {
                System.out.println("Failed to Add Member");
            }
        }catch (Exception e)
        {
            System.out.println("Error Occurred while adding the Member."+e.getMessage());
        }

    }

    public void deleteBook()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Book ID that you want to delete..");
        int bookid=scanner.nextInt();
        try {
            boolean isDeleted = bookDAO.deleteBook(bookid);
            if (isDeleted) {
                System.out.println("Book Deleted Successfully..");
            } else {
                System.out.println("Failed to Delete  Book");
            }
        } catch (Exception e) {
            System.out.println("Error Occurred while deleting the Book."+e.getMessage());
        }
    }

}
