package jdbclab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBcCRUDDemo {

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    	  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
	    	 if(con!=null)
	    		  System.out.println("Connection established successfully");
	    	  Statement st=con.createStatement();
	    	 st.executeUpdate("create table std_IT(sname VARCHAR2(10),sid NUMBER(4),dept VARCHAR2(5))");
	    	 System.out.println("CRUD Operations on table");
	    	 System.out.println("Table created successfully");
	    	String str="insert into std_IT values(?,?,?)";
	    	 PreparedStatement ps=con.prepareStatement(str);
	    	 System.out.println("Enter no.of Std details : ");
	    	 int n1=sc.nextInt();
			for(int i=1;i<=n1;i++){
	    	 System.out.println("Enter student name:");
	    	 String s=sc.next();
	    	 System.out.println("Enter student id:");
	    	 int n=sc.nextInt();
	    	 System.out.println("Enter student dept:");
	    	 String dep=sc.next();
	    	 ps.setString(1, s);
	    	 ps.setInt(2, n);
	    	 ps.setString(3, dep);
	    	 ps.executeUpdate();
	    	 }
	    	 System.out.println("Executed successfully");
	    	 ps.executeUpdate("update std_IT set dept='IT' where dept='CSE'or dept='cse'");
	    	 System.out.println("Updated Succcesfully");
	    	 ps.executeUpdate("delete  from std_IT  where dept='AIML'or dept='aiml'");
	    	 System.out.println("Deleted Succcesfully");
	    	 ResultSet result=ps.executeQuery("select *from std_IT");
	    	 System.out.println("Retrived Data from Std_IT table");
	    	  while(result.next())
	    	  {
	    		  System.out.println(result.getString(1)+" "+result.getInt(2)+" "+result.getString(3));
	    	  }
	    	 }catch(Exception e) {
		    	  System.out.println(e);
		      }

	}
}
