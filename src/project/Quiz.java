package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	static Scanner s1=new Scanner(System.in);
	static void quiz(String name)
	{
		// do-while loop to allow the user to select an option and then perform that action.
		do {
		    try {
		        System.out.println("\n1.If you want to take any quiz \n2.if you want to check your marks in previous quizzes \n3.update account  details \n4.Logout");
		        int ch2 = s1.nextInt();
		        s1.nextLine(); // Consume newline character

		        switch (ch2) {
		            case 1: // Take a quiz.
		                quizTaker(name);
		                break;
		            case 2: // Display previous quiz results.
		                Display.display(name);
		                break;
		            case 3: // Update account details.
		                UpdateAcc.updateAcc(name);
		                break;
		            case 4: // Logout.
		                System.out.println("Logging out.......");
		                try {
							Thread.sleep(1000);
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
		                return;
		        }

		        // Check if the user wants to go to the home page.
		        System.out.println("do you want to go to home page page: y/n ?");
		        String sc = s1.next();
		        if (sc.equalsIgnoreCase("n")) {
		            break;
		        }
		    } catch (Exception e) {
		        System.out.println(e);
		    }
		} while (true);

		
	
}
	static void quizTaker(String name)
	{
		do {
			InsertMarks ins=new InsertMarks();
			System.out.println("Choose the subject \n1.Java\n2.Python\n3.DBMS\n4.C programming ");
			try
			{
			String cs;
			int ch3=s1.nextInt();
			switch(ch3)
			{
			case 1:
				int jm=QuizManager.javaTakeTest();
				ins.updateMarks(name,"java", jm);
				break;
			case 2:
				int pm=QuizManager.pyTakeTest();
				ins.updateMarks(name,"python", pm);
				break;
			case 3:
				int dm=QuizManager.dbmsTakeTest();
				ins.updateMarks(name,"dbms", dm);
				break;
			case 4:
				int cm=QuizManager.cPTakeTest();
				ins.updateMarks(name, "c", cm);
				break;
			}
			}
			catch(InputMismatchException e)
			{
				System.out.println("please enter numeric values");
			}
			System.out.println("do you want to answer any other quiz (y/n)?");
			String sol=s1.next();
			if(sol.equals("n"))
			{
				break;
			}
		}while(true);

}
	}
