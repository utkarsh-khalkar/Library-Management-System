package com.company.librarymanagement.dao;

import com.company.librarymanagement.model.Book;
import com.company.librarymanagement.util.DatabaseUtil;

import java.net.SocketImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {


    public boolean addBook(Book book) {
        String query="insert into books(title,author,genre, publication_yeat,availabel_copies) values(?,?,?,?,?) ";

        try(Connection con=DatabaseUtil.getJDBCConnection()) {

            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1,book.getTitle());
            pstmt.setString(2,book.getAuthor());
            pstmt.setString(3,book.getGener());
            pstmt.setInt(4,book.getPublicationyear());
            pstmt.setInt(5,book.getAvailableCopies());

            int rowAffected=pstmt.executeUpdate();

            return rowAffected>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public  void showBooks()
    {
        String query="select * from books";
        try(Connection con=DatabaseUtil.getJDBCConnection()) {

            PreparedStatement pstmt= con.prepareStatement(query);
            ResultSet resultSet= pstmt.executeQuery();

            System.out.println("Available Books in Library..");
            System.out.println("Book ID \t"+"Book Title\t"+"Author\t"+"Gener\t" +"Publication Year\t"+" Copies Available ");
            while (resultSet.next())
            {
                int book_id=resultSet.getInt(1);
                String title=resultSet.getString(2);
                String author=resultSet.getString(3);
                String gener=resultSet.getString(4);
                int year=resultSet.getInt(5);
                int copies=resultSet.getInt(6);

                System.out.println(book_id+"\t"+title+"\t"+author+"\t"+gener+"\t"+year+"\t"+copies);


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteBook(int bookId)
    {
        String query="delete from books where book_id= ?";
        try(Connection connection=DatabaseUtil.getJDBCConnection()) {
            PreparedStatement pstmt=connection.prepareStatement(query);
            pstmt.setInt(1,bookId);
            int rowAffected=pstmt.executeUpdate();

            return  rowAffected>0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
