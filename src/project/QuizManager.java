package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuizManager {
	static Scanner sc=new Scanner(System.in);
	static int javaTakeTest()
	{
		int javaMarks=0;
		System.out.println("-----Java MCQ Test-----");
		System.out.println();
		System.out.println("!!! Note The answers should be a-d otherwise they are traeted as incorrect !!!\n");
		Java.getInstance();
		int i=1;
		
		for(Questions q:Java.getInstance().getJavaQstns())
		{
			System.out.println(i+" "+q.getQstn());
		
			try {
				System.out.print("Your answer (a-b):");
			String ch=sc.next();
			if(ch.equalsIgnoreCase(q.getAnswer()))
			{
				javaMarks=javaMarks+1;
				System.out.println("correct");
			}
			else
			{
				System.out.println("incorrect answer !! correct answer is:"+q.getAnswer());
			}
			try {
				Thread.sleep(800);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			i=i+1;
		}
			catch(InputMismatchException e)
			{
				System.out.println("please enter alphabet characters");
				
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Your marks:"+javaMarks);
		return javaMarks;
}
	static int pyTakeTest()
	{
		int pyMarks=0;
		System.out.println("-----Python MCQ Test-----");
		System.out.println();
		System.out.println("!!! Note The answers should be a-d otherwise they are traeted as incorrect !!!\n");
		Python.getInstance();
		int i=1;
		for(Questions q:Python.getInstance().getPythonQstns())
		{
			System.out.println();
			System.out.println(i+" "+q.getQstn());
			try {
				System.out.print("Your answer (a-b):");
			String ch=sc.next();
			if(ch.equalsIgnoreCase(q.getAnswer()))
			{
				pyMarks=pyMarks+1;
				System.out.println("correct");
			}
			else
			{
				System.out.println("incorrect answer !! correct answer is:"+q.getAnswer());
			}
			i=i+1;
			try {
				Thread.sleep(800);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			}
			catch(InputMismatchException e)
			{
				System.out.println("please enter alphabetical characters");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Your marks:"+pyMarks);
		return pyMarks;

}
	static int dbmsTakeTest()
	{
		int dbmsMarks=0;
		System.out.println("-----DBMS MCQ Test-----");
		System.out.println();
		System.out.println("!!! Note The answers should be a-d otherwise they are traeted as incorrect !!!\n");
		DBMS.getInstance();
		int i=1;
		for(Questions q:DBMS.getInstance().getDBMSQstns())
		{
			System.out.println(i+" "+q.getQstn());
			try {
				System.out.print("Your answer (a-b):");
			String ch=sc.next();
			if(ch.equalsIgnoreCase(q.getAnswer()))
			{
				dbmsMarks=dbmsMarks+1;
				System.out.println("correct");
			}
			else
			{
				System.out.println("incorrect answer !! correct answer is:"+q.getAnswer());
			}
			try {
				Thread.sleep(800);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			i=i+1;
			}
			catch(InputMismatchException e)
			{
				System.out.println("please enter alphabetical characters");
			}
			
		}
		System.out.println();
		System.out.println();
		
		System.out.println("your marks"+dbmsMarks);
		return dbmsMarks;

}
	static int cPTakeTest()
	{
		int cMarks=0;
		System.out.println("-----C Progarmming MCQ Test-----");
		System.out.println();
		System.out.println("!!! Note The answers should be a-d otherwise they are traeted as incorrect !!!\n");
		CProgramming.getInstance();
		int i=1;
		for(Questions q:CProgramming.getInstance().getCQstns())
		{
			
			System.out.println(i+" "+q.getQstn());
			try
			{
				System.out.print("Your answer (a-b):");
			String ch=sc.next();
			if(ch.equalsIgnoreCase(q.getAnswer()))
			{
				cMarks=cMarks+1;
				System.out.println("correct");
			}
			else
			{
				System.out.println("incorrect answer !! correct answer is:"+q.getAnswer());
		
			}
			}
			catch(InputMismatchException e)
			{
				System.out.println("please enter alphabetical characters");
			}
			try {
				Thread.sleep(800);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			i=i+1;
		}
		System.out.println();
		System.out.println();
		
		System.out.println("your marks:"+cMarks);
		return cMarks;

}
	
}
