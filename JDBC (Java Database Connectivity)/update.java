import java.sql.*;
import java.io.*;
public class inserting_by_dynamic_input{
	public static void main(String args[]){
		try{Class.forName("com.mysql.cj.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/sumit";
         String username="root";
         String passward="*******";      //enter your passward
         Connection con=DriverManager.getConnection(url,username,passward);
           
      
        String q="update table1 set tName=? , tCity=? where tId=?";
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter new name:");
         String name=br.readLine();

         System.out.println("enter the city");
         String city=br.readLine();

         System.out.println("enter the id:");
         int id=Integer.parseInt(br.readLine());
         PreparedStatement psmt=con.prepareStatement(q);
         psmt.setString(1,name);
         psmt.setString(2,city);

         psmt.setInt(3,id);
            psmt.executeUpdate();
            System.out.print("success......");

            con.close();

		}
		catch(Exception e){
		e.printStackTrace();
	}
  }
}