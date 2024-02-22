package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class AdminRegistration {
	static Scanner s2=new Scanner(System.in);
	static void register()
	{
		System.out.println("enter admin name");
		final String name=s2.nextLine();
		System.out.println("Enter user emailId");
        final String emailId = s2.nextLine();
        System.out.println("Enter the password");
        final String password = s2.nextLine();
        boolean userCorrect = true;
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO `admins`(`name`, `mailid`,`pwd`) VALUES ('"+name+"' , '"+emailId+"','"+ password+"')";
			stmt.executeUpdate(sql);
			System.out.println("Registration Successful");
			con.close();
			} 
		catch (Exception e) {
			System.out.println(e);
			}
	}
	public static void main(String s[])
	{
		register();
	}

}
