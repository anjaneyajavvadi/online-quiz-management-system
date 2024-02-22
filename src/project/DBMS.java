package project;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DBMS {
	
			private  Set<Questions> qstn=new HashSet<>();
			private static DBMS d;
			public DBMS()
			{
				setQuiz();
			}
			public static DBMS getInstance()
			{
				if(d==null)
				{
					d=new DBMS();
				}
				return d;
			}
			public void setQuiz()
			{
				Questions question;
				String qstns[]= {"What is the full form of DBMS?\n"
						+ "A. Data of Binary Management System\n"
						+ "B. Database Management System\n"
						+ "C. Database Management Service\n"
						+ "D. Data Backup Management System\n",
						"What is a database?\n"
						+ "A. Organized collection of information that cannot be accessed, updated, and managed\n"
						+ "B. Collection of data or information without organizing\n"
						+ "C. Organized collection of data or information that can be accessed, updated, and managed\n"
						+ "D. Organized collection of data that cannot be updated\n",
						" What is DBMS?\n"
						+ "A. DBMS is a collection of queries\n"
						+ "B. DBMS is a high-level language\n"
						+ "C. DBMS is a programming language\n"
						+ "D. DBMS stores, modifies and retrieves data\n",
						" Who created the first DBMS?\n"
						+ "A. Edgar Frank Codd\n"
						+ "B. Charles Bachman\n"
						+ "C. Charles Babbage\n"
						+ "D. Sharon B. Codd\n",
						" Which type of data can be stored in the database?\n"
						+ "A. Image oriented data\n"
						+ "B. Text, files containing data\n"
						+ "C. Data in the form of audio or video\n"
						+ "D. All of the above\n",
						" In which of the following formats data is stored in the database management system?\n"
						+ "A. Image\n"
						+ "B. Text\n"
						+ "C. Table\n"
						+ "D. Graph\n",
						" Which of the following is not a type of database?\n"
						+ "A. Hierarchical\n"
						+ "B. Network\n"
						+ "C. Distributed\n"
						+ "D. Decentralized\n",
						" Which of the following is not an example of DBMS?\n"
						+ "A. MySQL\n"
						+ "B. Microsoft Acess\n"
						+ "C. IBM DB2\n"
						+ "D. Google\n",
						" Which of the following is not a feature of DBMS?\n"
						+ "A. Minimum Duplication and Redundancy of Data\n"
						+ "B. High Level of Security\n"
						+ "C. Single-user Access only\n"
						+ "D. Support ACID Property\n",
						" Which of the following is a feature of the database?\n"
						+ "A. No-backup for the data stored\n"
						+ "B. User interface provided\n"
						+ "C. Lack of Authentication\n"
						+ "D. Store data in multiple locations\n"
						};
						
						
						
				String answers[]= {"B","C","D","B","D","C","D","D","C","B"};
				
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
			public Set<Questions> getDBMSQstns()
			{
				return qstn;
			}
			
			
	}






