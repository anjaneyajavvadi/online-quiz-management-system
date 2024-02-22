package project;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Java {
	
			private  Set<Questions> qstn=new HashSet<>();
			private static Java j;
			public Java()
			{
				setQuiz();
			}
			public static Java getInstance()
			{
				if(j==null)
				{
					j=new Java();
				}
				return j;
			}
			public void setQuiz()
			{
				Questions question;
				String qstns[]= {" Who invented Java Programming?\r\n"
						+ "A. Guido van Rossum\r\n"
						+ "B. James Gosling\r\n"
						+ "C. Dennis Ritchie\r\n"
						+ "D. Bjarne Stroustrup",
						" Which statement is true about Java?\r\n"
						+ "A. Java is a sequence-dependent programming language\r\n"
						+ "B. Java is a code dependent programming language\r\n"
						+ "C. Java is a platform-dependent programming language\r\n"
						+ "D. Java is a platform-independent programming language",
						" Which component is used to compile, debug and execute the java programs?\r\n"
						+ "A. JRE\r\n"
						+ "B. JIT\r\n"
						+ "C. JDK\r\n"
						+ "D. JVM",
						" Which one of the following is not a Java feature?\r\n"
						+ "A. Object-oriented\r\n"
						+ "B. Use of pointers\r\n"
						+ "C. Portable\r\n"
						+ "D. Dynamic and Extensible",
						" Which of these cannot be used for a variable name in Java?\r\n"
						+ "A. identifier & keyword\r\n"
						+ "B. identifier\r\n"
						+ "C. keyword\r\n"
						+ "D. none of the mentioned",
						" What is the extension of java code files?\r\n"
						+ "A. .js\r\n"
						+ "B. .txt\r\n"
						+ "C. .class\r\n"
						+ "D. .java",
						" What will be the output of the following Java code?\r\n"
						+ "\r\n"
						+ "    class increment {\r\n"
						+ "        public static void main(String args[]) \r\n"
						+ "        {        \r\n"
						+ "             int g = 3;\r\n"
						+ "             System.out.print(++g * 8);\r\n"
						+ "        } \r\n"
						+ "    }\r\n"
						+ "A. 32\r\n"
						+ "B. 33\r\n"
						+ "C. 24\r\n"
						+ "D. 25",
						" Which environment variable is used to set the java path?\r\n"
						+ "A. MAVEN_Path\r\n"
						+ "B. JavaPATH\r\n"
						+ "C. JAVA\r\n"
						+ "D. JAVA_HOME",
						" What will be the output of the following Java program?\r\n"
						+ "\r\n"
						+ "class output {\r\n"
						+ "        public static void main(String args[]) \r\n"
						+ "        {\r\n"
						+ "            double a, b,c;\r\n"
						+ "            a = 3.0/0;\r\n"
						+ "            b = 0/4.0;\r\n"
						+ "            c=0/0.0;\r\n"
						+ " \r\n"
						+ "	    System.out.println(a).;\r\n"
						+ "            System.out.println(b);\r\n"
						+ "            System.out.println(c);\r\n"
						+ "        } \r\n"
						+ "    }\r\n"
						+ "A. NaN\r\n"
						+ "B. Infinity\r\n"
						+ "C. 0.0\r\n"
						+ "D. all of the mentioned\r\n",
						" Which of the following is not an OOPS concept in Java?\r\n"
						+ "A. Polymorphism\r\n"
						+ "B. Inheritance\r\n"
						+ "C. Compilation\r\n"
						+ "D. Encapsulation"
							};
						
						
						
				String answers[]= {"B","D","C","B","C","D","A","D","D","C"};
				
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
			public void updateQuiz()
			{
				
			}
			public Set<Questions> getJavaQstns()
			{
				return qstn;
			}
			
			
			
	}



