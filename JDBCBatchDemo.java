package jdbclab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class JDBCBatchDemo {
public static void main(String[] args) {	
Scanner s= new Scanner(System.in);
System.out.println("Number of Students:");
int n=s.nextInt();
String  e_details[][]= new String[n][2];
for(int i = 0; i < n; i++) {  
 System.out.println("Enter student name:");
  e_details[i][0] = s.next();  
    System.out.println("Enter student dept:");
e_details[i][1] = s.next();  
}
try {
Scanner sc= new Scanner(System.in);
  Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
  if(con!=null)
  System.out.println("Connection established successfully");
  Statement st=con.createStatement();
   st.executeUpdate("create table std_IT(sname Varchar2(10),dept VARCHAR2(5))");
   System.out.println("Table created successfully");
  String str="insert into std_IT values(?,?)";
  PreparedStatement ps=con.prepareStatement(str);
  for (String[] emp : e_details) {
        ps.setString(1, emp[0]);
        ps.setString(2, emp[1]);
        ps.addBatch();
    }
  ps.executeBatch();
  System.out.println("Batch insert completed successfully!");
  ResultSet result=ps.executeQuery("select *from std_IT");
 System.out.println("Retrived Data from Std_IT table");
while(result.next()){
 System.out.println(result.getString(1)+" "+result.getString(2));
  }
}catch(Exception e) {
System.out.println(e);
}
}
