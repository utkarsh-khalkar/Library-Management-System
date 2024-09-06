package com.company.librarymanagement.dao;

import com.company.librarymanagement.model.Member;
import com.company.librarymanagement.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

    public boolean addMember(Member member)
    {
        try(Connection connection= DatabaseUtil.getJDBCConnection()) {

            String query="insert into members(name,membership_date,email) values(?,?,?)";

            PreparedStatement pstmt=connection.prepareStatement(query);
            pstmt.setString(1,member.getMemberName());
            pstmt.setString(2,member.getMemberShipDate());
            pstmt.setString(3,member.getMemberemail());

            int rowAffected=pstmt.executeUpdate();

            return rowAffected>0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
