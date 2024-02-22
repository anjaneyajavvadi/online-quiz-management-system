package project;
import java.util.*;
public class Display {
    static Scanner s1=new Scanner(System.in);
	static InsertMarks ins=new InsertMarks();

	public static void display(String name) {
		do {

	System.out.println("select your subject \n 1.JAVA 2.PYTHON 3.DBMS 4. C");
	try {
	int ch6=s1.nextInt();
	switch(ch6)
	{
	case 1:
		ins.displayMarks(name, "java");
		break;
	case 2:
		ins.displayMarks(name, "python");
		break;
	case 3:
		ins.displayMarks(name, "dbms");
		break;
	case 4:
		ins.displayMarks(name, "c");
		break;	
	default:
			System.out.println("oops wrong choice");
}
	}
	catch(InputMismatchException e) {
		System.out.println("please choose numbers");
	}
	System.out.println("do you want to cheack other subject marks y/n ?");
	String sc=s1.next();
	if(sc.equalsIgnoreCase("n"))
	{
		break;
	}
}while(true);
		
}
}
