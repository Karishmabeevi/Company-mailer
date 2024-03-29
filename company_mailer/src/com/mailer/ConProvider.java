package com.mailer;
import java.sql.*;
public class ConProvider {

	public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3308/companymailert","root","karish098@");
	}catch(Exception e){System.out.println(e);}
	return con;
    }
}
