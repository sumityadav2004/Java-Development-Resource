import java.sql.*;
import java.io.*;
public class insertimage{
	public static void main(String args[]){
		try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/sumit";
      String username="root";
      String passward="*********";            //enter your passward
      Connection con=DriverManager.getConnection(url,username,passward);

      String q="insert into image(pic) values(?)";
      PreparedStatement psmt=con.prepareStatement(q);

      FileInputStream fis=new FileInputStream("id card_11zon.jpg");

      psmt.setBinaryStream(1,fis,fis.available());
      psmt.executeUpdate();

      System.out.println("success.......");

		}
		catch(Exception e){
			System.out.println("Error!!" + e.getMessage());
			e.printStackTrace();
		}
	}
} 