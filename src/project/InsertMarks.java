package project;
import java.sql.*;

public class InsertMarks {

    public void updateMarks(String name, String subject, int marks) {
        String updateQuery = "UPDATE user_marks SET " + subject + " = ? WHERE name = ?";
        try (
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");
            PreparedStatement st = con.prepareStatement(updateQuery)
        ) {
            st.setInt(1, marks);
            st.setString(2, name);
            int rowsAffected = st.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Update completed");
            } else {
                System.out.println("No records updated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void displayMarks(String name,String subject)
    {
    	try {
    	    Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC driver

    	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");
    	    String query = "SELECT * FROM user_marks WHERE name = ?";
    	    
    	    PreparedStatement st = con.prepareStatement(query);
    	    st.setString(1, name);
    	    ResultSet resultSet = st.executeQuery();

    	    while (resultSet.next()) {
    	        int marks = 0;
    	        
    	        if (subject.equalsIgnoreCase("java")) {
    	            marks = resultSet.getInt("java");
    	        } else if (subject.equalsIgnoreCase("python")) {
    	            marks = resultSet.getInt("python");
    	        } else if (subject.equalsIgnoreCase("dbms")) {
    	            marks = resultSet.getInt("dbms");
    	        } else if (subject.equalsIgnoreCase("c")) {
    	            marks = resultSet.getInt("c");
    	        }
    	        
    	        if (marks != 0) {
    	            System.out.println("Student: " + name);
    	            System.out.println(subject.toUpperCase() + " Marks: " + marks);
    	            break;
    	        } else {
    	            System.out.println("you did not attempt this quiz");
    	        }
    	    }
    	    
    	    con.close();
    	} catch (ClassNotFoundException | SQLException e) {
    	    e.printStackTrace();
    	}
    }
    public static void maxMarks(String subject) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/klaus_project", "root", "");

            String query = "SELECT name, " + subject + " FROM user_marks " +
                           "WHERE " + subject + " = (SELECT MAX(" + subject + ") FROM user_marks)";

            PreparedStatement st = con.prepareStatement(query);
            ResultSet resultSet = st.executeQuery();

            boolean found = false;

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int marks = resultSet.getInt(subject);

                if (marks != 0) {
                    System.out.println("Student: " + name);
                    System.out.println(subject.toUpperCase() + " Marks: " + marks);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No student found for " + subject + " or no students attempted this quiz.");
            }

            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

