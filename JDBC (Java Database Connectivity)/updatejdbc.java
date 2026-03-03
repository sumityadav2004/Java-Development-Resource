import java.io.*;
import java.sql.*;

public class updatejdbc{
    public static void main(String args []){
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/sumit";
         String username="root";
         String passward="*********";           //enter your passward
        Connection con=DriverManager.getConnection(url,username,passward);


        String q="insert into Table1(tname,tcity) values(?,?)";
        PreparedStatement pstmt=con.prepareStatement(q);
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter the name");
         String name=br.readLine();

         System.out.println("enter the city");
         String city=br.readLine();
        pstmt.setString(1, name);
        pstmt.setString(2, city);
        
        pstmt.executeUpdate();


        System.out.println("success.........");


        }
        catch(Exception e){
            e.printStackTrace();
        }         
    }
}