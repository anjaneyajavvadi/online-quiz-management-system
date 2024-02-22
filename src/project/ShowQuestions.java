package project;

public class ShowQuestions {
	static void showJava()
	{
		int i=0;
		for(Questions q:Java.getInstance().getJavaQstns())
		{
			i++;
			System.out.println(i+" "+q.getQstn());
			System.out.println();
			System.out.println("Answer: "+q.getAnswer());
		}
	}
	static void showC()
	{
		int i=0;
		for(Questions q:CProgramming.getInstance().getCQstns())
		{
			i++;
			System.out.println(i+" "+q.getQstn());
			System.out.println();
			System.out.println("Answer :"+q.getAnswer());
		}
	}
	static void showDBMS()
	{
		int i=0;
		for(Questions q:DBMS.getInstance().getDBMSQstns())
		{
			i++;
			System.out.println(i+" "+q.getQstn());
			System.out.println();
			System.out.println("Answer :"+q.getAnswer());
			
		}
	}
	static void showPython()
	{
		int i=0;
		for(Questions q:Python.getInstance().getPythonQstns())
		{
			i++;
			System.out.println(i+" "+q.getQstn());
			System.out.println();
			System.out.println("Answer :"+q.getAnswer());
		}
	}

}
