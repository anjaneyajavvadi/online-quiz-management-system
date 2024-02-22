package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class AdminFunctions {
	static Scanner sc=new Scanner(System.in);
	static void adminFuncs()
	{
		do
		{
		System.out.println("1. View questions 2.View Users 3.View highest Scores 4.Logout");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				viewQuestions();
				break;
			case 2:
				viewUsers();
				break;
			case 3:
				viewHighestScores();
				break;
			case 4:
				System.out.println("logging out");
				try {
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				return; // Exit the function when logging out
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
			
		}
		System.out.println("do you want to perform any other functions");
		String c=sc.next();
		{
			if(!(c.equalsIgnoreCase("y")))
			{
				break;
			}
		}
		}
		while(true);		
	}
	static void viewQuestions()
	{
		System.out.println("1.Java \n2.C Programming \n3.DBMS \n4.Python");
		int ch=sc.nextInt();
		do {
		switch(ch)
		{
		case 1:
			ShowQuestions.showJava();
			break;
		case 2:
			ShowQuestions.showC();
			break;
		case 3:
			ShowQuestions.showDBMS();
			break;
		case 4:
			ShowQuestions.showPython();
			break;
		}
		System.out.println("do you want to see another subject questions(y/n)");
		String c=sc.nextLine();
		if(!(c.equals("y")))
		{
			break;
		}
	}while(true);
	}
    public static void viewUsers()
    {
        String jdbcUrl = "jdbc:mysql://localhost:3306/klaus_project";
        String username = "root";
        String password = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            java.sql.Statement statement = connection.createStatement();

            String sql = "SELECT * FROM userdetails";

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
            	String name=resultSet.getString(1);

                System.out.println("Name: " + name);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	static void viewHighestScores()
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.java\n2.python\n3.C\n4.DBMs");
			int c=sc.nextInt();
			switch(c)
			{
			case 1:
				InsertMarks.maxMarks("java");
				break;
			case 2:
				InsertMarks.maxMarks("python");
				break;
			case 3:
				InsertMarks.maxMarks("c");
				break;
			case 4:
				InsertMarks.maxMarks("dbms");
				break;
			}
			System.out.println("if you want to see another subject highest marks (y/n)");
			String v=sc.next();
			if(!v.equalsIgnoreCase("y"))
			{
				break;
			}
		}while(true);
	}

}
