package com.mailer;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ComposeDao {

    public static int save(String sender, String receiver, String subject, String message) {
        int status = 0;
        try {
            Connection con = ConProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO COMPANY_MAILER_MESSAGE (sender, receiver, subject, message, trash, messagedate) VALUES (?, ?, ?, ?, ?, CURDATE())");
            ps.setString(1, sender);
            ps.setString(2, receiver);
            ps.setString(3, subject);
            ps.setString(4, message);
            ps.setString(5, "no");

            status = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

        return status;
    }
}
