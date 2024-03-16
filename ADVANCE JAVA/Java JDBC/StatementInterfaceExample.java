import java.sql.*;  
class FetchRecord{  
public static void main(String args[])throws Exception{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
Statement stmt=con.createStatement();  
  
stmt.executeUpdate("insert into emp10 values(12,'Shiva',45000)");  
int result=stmt.executeUpdate("update emp15 set name='Vimal',salary=300000 where id=33");  
int result=stmt.executeUpdate("delete from emp10 where id=33");  
System.out.println(result+" records affected");  
con.close();  
}}  
