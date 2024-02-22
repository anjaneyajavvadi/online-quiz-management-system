package project;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;



public class LoginAndRegister {

	public static void main(String s[]) throws SQLException {
        int ch;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~WELCOME TO THE ONLINE QUIZ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        while (true){
            
            System.out.println("choose\n1.Login\n2.Register\n3.exit");
            try {
                ch = sc.nextInt();
                sc.nextLine();
                switch (ch) {
                    case 1:
                        login(sc);
                        break;
                    case 2:
                        register(sc);
                        break;
                    case 3:
                        System.out.println("closing have a nice day !!");
                        sc.close();
                        System.exit(0);
                        default:
                        	System.out.println("Invalid Choice !!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input Error: Please enter numeric values");
            }
        }
    }
    static void login(Scanner sc)
    {
    	while(true)
		{
    	try
		{
		
		System.out.println("enter user name");
		final String name=sc.nextLine();
		System.out.println("enter the password");
		final String password=sc.next();
		if(loginCheck(name, password))
		{
			System.out.println("welcome User "+name+" !!");
			System.out.println();
			Quiz.quiz(name);
			System.out.println("logged out !! have a nice day");
			break;
		}
		else if(adminLoginCheck(name,password))
		{
			System.out.println("welcome Admin "+name+" !!");
			System.out.println();
			AdminFunctions.adminFuncs();
			System.out.println("logged out !! have a nice day");
			break;
			
		}
		else
		{
			System.out.println("login falied!! check your username and password");
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("please enter string values");
		}
		}
    }
    static void register(Scanner sc) throws SQLException
    {
    	boolean userCorrect=false;
    	while(!userCorrect)
    	{
        System.out.println("enter user name");
        final String name = sc.nextLine();
        boolean usernameExists =checkUsernameExistsInDatabase(name);
        if (usernameExists) {
            System.out.println("Username already exists in the database.");
        } else {
            System.out.println("Enter user emailId");
            final String emailId = sc.nextLine();
            System.out.println("Enter the password");
            final String password = sc.nextLine();
            registration(name, emailId, password);
            userCorrect=true;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");
                Statement stmt = con1.createStatement();
                String sql1 = "INSERT INTO `user_marks`(`name`,`python`,`java`,`c`,`dbms`) VALUES ('" + name + "','0','0','0','0')";
                stmt.executeUpdate(sql1);
                con1.close();
            } catch (Exception e) {
                System.out.println("Database Error: " + e.getMessage());
            }
            System.out.println("Do you want to log in? (y/n)");
            String ch1 = sc.next();
            if (ch1.equals("y")) {
                login(sc);
            }
        }
        break;
    	}
    }
    static void registration(String name,String emailId,String password)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO `userdetails`(`name`, `mailid`,`pwd`) VALUES ('"+name+"' , '"+emailId+"','"+ password+"')";
			stmt.executeUpdate(sql);
			System.out.println("Registration Successful");
			con.close();
			} 
		catch (Exception e) {
			System.out.println(e);
			}
}
    static boolean checkUsernameExistsInDatabase(String username) throws SQLException {
	    try (
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");
	        PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM userdetails WHERE name = ?");
	    ) {
	        stmt.setString(1, username);
	        try (ResultSet resultSet = stmt.executeQuery())
	        {
	            resultSet.next();
	            int count = resultSet.getInt(1);
	            return count > 0;
	        }
	    }
	}
    public static boolean loginCheck(String name,String pwd)
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");
		Statement stmt = con.createStatement();
		String sql = "select * from userdetails WHERE name='"+name+"'and pwd='"+pwd+"'";
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next())
		{
			return true;
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	return false;
	}
    public static boolean adminLoginCheck(String name,String password)
    {

    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");
    		Statement stmt = con.createStatement();
    		String sql = "select * from admins WHERE name='"+name+"'and pwd='"+password+"'";
    		ResultSet rs=stmt.executeQuery(sql);
    		if(rs.next())
    		{
    			return true;
    		}
    	}
    		catch(Exception e)
    		{
    			System.out.println(e);
    		}
    	return false;
    }

}
