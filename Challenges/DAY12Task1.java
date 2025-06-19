package Mysqlprogram;

import java.sql.*;

public class DAY12Task1 {

	public static void main(String[] args) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		String Url="jdbc:mysql://localhost:3306/addon";
		String User="root";
		String Password="";
	Connection connect=DriverManager.getConnection(Url, User, Password);
	System.out.println("Driver Loaded");
	}

}
