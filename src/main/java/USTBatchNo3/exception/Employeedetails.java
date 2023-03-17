package USTBatchNo3.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Employeedetails {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "Aadil","123456789876543","aadil1857@gamil.com", "Anthrollil House,Kunnumpuram edappally north", "TVM",22000);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter phone no:");
		e1.setPhoneno(sc.next());
		try {
			if(!e1.getPhoneno().matches("\\d{10}"))
				throw new invalidphoneException("invalid phone number");
			System.out.println("enter email id:");
			e1.setEmail(sc.next());
			try {
				if(!e1.getEmail().matches("[a-zA-Z0-9+_.-]+@[a-zA-Z.-]+$"))
					throw new invalidphoneException("invalid email id");
				 String url = "jdbc:mysql://localhost:3306/march16";
				    String username = "root";
				    String password = "pass@word1";

				    try {
				      // Create a connection to the database
				      Connection conn = DriverManager.getConnection(url, username, password);

				      // Create a statement object
				      Statement stmt = conn.createStatement();


				      
				      String sql = "insert into employee (Eid,name,salary,Phoneno,Email,Address,Location) values (?,?,?,?,?,?,?);";

		   		      PreparedStatement pst=conn.prepareStatement(sql);
		   		      
		   		pst.setInt(1,e1.getEid());
		   		pst.setString(2,e1.getName());
		   		pst.setInt(3,e1.getSalary());
		   		pst.setString(4,e1.getPhoneno());
		   		pst.setString(5,e1.getEmail());
		   		pst.setString(6,e1.getAddress());
		   		pst.setString(7,e1.getLocation());
		   		pst.executeUpdate();
		   		      
//				      // Close the statement and connection objects

//				      
//				      System.out.println("Employee table created successfully!");
				      
				      //INSERST
				      
//				      String sql = "insert into employee values(6,\"POOMBATA\",23,\"D8\"),"
//				      		+ "(7,\"AYSHA\",25,\"D7\");";
//				      stmt.executeUpdate(sql);
				      
				      //update
//				    String sql = "UPDATE employee set name=\"SAJI\" where id=2;";
//				     stmt.executeUpdate(sql);

				      stmt.close();
				      conn.close();
				    } catch (SQLException e) {
				      e.printStackTrace();
				    }
			}
			catch(invalidphoneException e) {
				System.out.println(e.getMessage());
			}
		}
		catch(invalidphoneException e) {
			System.err.println(e.getMessage());
		}
		
		
		   
		
		}
		

	public static class invalidphoneException extends Exception{
		public invalidphoneException(String m) {
			super(m);
		}
	}
	public static class invalidemailException extends Exception{
		public invalidemailException(String m) {
			super(m);
			
		}
	}
	
	
	
	
	
	
	}
	


