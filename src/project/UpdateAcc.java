package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAcc {
	static Scanner s1=new Scanner(System.in);
	static void updateAcc(String name)
	{
		int u;
		System.out.println("\n1.EMAIL \n2.PASSWORD");
		u=s1.nextInt();
		switch(u)
		{
		case 1:
			System.out.println("enter new mail");
			String mail=s1.next();
			updatemail(name, mail);
			break;
		case 2:
			System.out.println("enter new password");
			String npwd=s1.next();
			System.out.println("confirm new password");
			String cpwd=s1.next();
			while(!cpwd.equals(npwd))
			{
				System.out.println("passwords does not match !!");
				System.out.println("enter new password");
				npwd=s1.next();
				System.out.println("confirm new password");
				cpwd=s1.next();	
			}
			if(cpwd.equals(npwd))
			{
				updatepassword(name, cpwd);
			}
			break;
		}
	}
	static void updatemail(String name,String email)
	{
		String updateQuery = "UPDATE userdetails SET mailid = ? WHERE name = ?";
        try (
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");
            PreparedStatement st = con.prepareStatement(updateQuery)
        ) {
        	st.setString(1, email);
            st.setString(2,name);
            int rowsAffected = st.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Email Update completed");
            } else {
                System.out.println("No records updated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}
	static void updatepassword(String name,String pwd)
	{
		String updateQuery = "UPDATE userdetails SET pwd = ? WHERE name = ?";
        try (
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");
            PreparedStatement st = con.prepareStatement(updateQuery)
        ) {
        	st.setString(1, pwd);
            st.setString(2,name);
            int rowsAffected = st.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println(" password Changed");
            } else {
                System.out.println("No records updated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

}
