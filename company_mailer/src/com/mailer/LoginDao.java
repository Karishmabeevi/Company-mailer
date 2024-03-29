package com.mailer;

import java.sql.*;

public class LoginDao {

    public static boolean validate(String email, String password) {
        boolean status = false;
        try {
            Connection con = ConProvider.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM company_mailer_user WHERE email=? AND password=? AND authorized=?");
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3, "yes");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                status = true;
            }
            con.close(); // Close the connection after use to release resources.
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}
