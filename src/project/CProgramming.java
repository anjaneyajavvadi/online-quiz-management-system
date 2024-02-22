package project;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CProgramming {
	
			private  Set<Questions> qstn=new HashSet<>();
			private static CProgramming cp;
			public CProgramming()
			{
				setQuiz();
			}
			public static CProgramming getInstance()
			{
				if(cp==null)
				{
					cp=new CProgramming();
				}
				return cp;
			}
			public void setQuiz()
			{
				Questions question;
				String qstns[]= {" Who is the father of C language?\n"
						+ "A. Steve Jobs\n"
						+ "B. James Gosling\n"
						+ "C. Dennis Ritchie\n"
						+ "D. Rasmus Lerdorf\n",
						" Which of the following is not a valid C variable name?\n"
						+ "A. int number;\n"
						+ "B. float rate;\n"
						+ "C. int variable_count;\n"
						+ "D. int $main;\n",
						" All keywords in C are in ____________\n"
						+ "A. LowerCase letters\n"
						+ "B. UpperCase letters\n"
						+ "C. CamelCase letters\n"
						+ "D. None of the mentioned\n",
						" Which of the following is true for variable names in C\n?"
						+ "A. They can contain alphanumeric characters as well as special characters\n"
						+ "B. It is not an error to declare a variable to be one of the keywords(like goto, statiC.\n"
						+ "C. Variable names cannot start with a digit\n"
						+ "D. Variable can be of any length\n",
						" Which is valid C expression?\n"
						+ "A. int my_num = 100,000;\n"
						+ "B. int my_num = 100000;\n"
						+ "C. int my num = 1000;\n"
						+ "D. int $my_num = 10000;\n",
						" Which of the following cannot be a variable name in C\n?"
						+ "A. volatile\n"
						+ "B. true\n"
						+ "C. friend\n"
						+ "D. export\n",
						" What is short int in C programming?\n"
						+ "A. The basic data type of C\n"
						+ "B. Qualifier\n"
						+ "C. Short is the qualifier and int is the basic data type\n"
						+ "D. All of the mentioned\n",
						" Which of the following declaration is not supported by C language\n?"
						+ "A. String str;\n"
						+ "B. char *str;\n"
						+ "C. float str = 3e2;\n"
						+ "D. Both “String str;” and “float str = 3e2;”\n",
						" Which keyword is used to prevent any changes in the variable within a C program?\n"
						+ "A. immutable\n"
						+ "B. mutable\n"
						+ "C. const\n"
						+ "D. volatile\n",
						" What is the result of logical or relational expression in C?\n"
						+ "A. True or False\n"
						+ "B. 0 or 1\n"
						+ "C. 0 if an expression is false and any positive number if an expression is true\n"
						+ "D. None of the mentioned\n"
						};
						
						
						
				String answers[]= {"C","D","A","C","B","A","C","A","C","B"};
				
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
			public Set<Questions> getCQstns()
			{
				return qstn;
			}
			
			
	}



