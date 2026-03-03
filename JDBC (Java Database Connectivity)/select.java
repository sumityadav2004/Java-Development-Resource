import java.sql.*;
import java.io.*;

public class select{
	public static void main(String args[]){
		try{
          Class.forName("com.mysql.cj.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/sumit";
         String username="root";
         String passward="*********";     //enter your passward
         Connection con=DriverManager.getConnection(url,username,passward);

         String query="Select * from table1";
         Statement smt=con.createStatement();
         ResultSet set =smt.executeQuery(query);

         while(set.next()){
         	int id=set.getInt(1);
         	String name=set.getString(2);
         	String city=set.getString(3);
         	System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);
        }

		}
		catch(Exception c){
			c.printStackTrace();
		}
	}
}
