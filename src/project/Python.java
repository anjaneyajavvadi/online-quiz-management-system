package project;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Python {

	private  Set<Questions> qstn=new HashSet<>();
	private static Python p;
	public Python()
	{
		setQuiz();
	}
	public static Python getInstance()
	{
		if(p==null)
		{
			p=new Python();
		}
		return p;
	}
	public void setQuiz()
	{
		Questions question;
		String qstns[]= {" Who developed Python Programming Language?\n"
				+ "A Wick van Rossum\n"
				+ "B Rasmus Lerdorf\n"
				+ "C Guido van Rossum\n"
				+ "D Niene Stom\n",
				" Which type of Programming does Python support?\n"
				+ "A object-oriented programming\n"
				+ "B structured programming\n"
				+ "C functional programming\n"
				+ "D all of the mentioned\n",
				" Is Python case sensitive when dealing with identifiers?\n"
				+ "A. no\n"
				+ "B. yes\n"
				+ "C. machine dependent\n"
				+ "D. none of the mentioned\n",
				" Which of the following is the correct extension of the Python file?\n"
				+ "A. .python\n"
				+ "B. .pl\n"
				+ "C. .py\n"
				+ "D. .p\n",
				" Is Python code compiled or interpreted?\n"
				+ "A. Python code is both compiled and interpreted\n"
				+ "B. Python code is neither compiled nor interpreted\n"
				+ "C. Python code is only compiled\n"
				+ "D. Python code is only interpreted\n",
				" All keywords in Python are in _________\n"
				+ "A. Capitalized\n"
				+ "B. lower case\n"
				+ "C. UPPER CASE\n"
				+ "D. None of the mentioned\n",
				" What will be the value of the following Python expression?\n"
				+ "\n"
				+ "4 + 3 % 5\n"
				+ "A. 7\n"
				+ "B. 2\n"
				+ "C. 4\n"
				+ "D. 1\n",
				" Which of the following is used to define a block of code in Python language?\n"
				+ "A. Indentation\n"
				+ "B. Key\n"
				+ "C. Brackets\n"
				+ "D. All of the mentioned\n",
				" Which keyword is used for function in Python language?\n"
				+ "A. Function\n"
				+ "B. def\n"
				+ "C. Fun\n"
				+ "D. Define\n",
				" Which of the following character is used to give single-line comments in Python?\n"
				+ "A. //\n"
				+ "B. #\n"
				+ "C. !\n"
				+ "D. /*\n"
				};	
		String answers[]= {"C","D","B","C","A","D","A","A","B","B"};
		
		int id[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<qstns.length;i++)
		{
			question=new Questions();
			question.setQstn(qstns[i]);
			question.setAnswer(answers[i]);
			question.setqId(id[i]);
			qstn.add(question);
			
		}
	}
	public Set<Questions> getPythonQstns()
	{
		return qstn;
	}
	

}
