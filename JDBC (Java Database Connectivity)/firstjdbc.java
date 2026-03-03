import java.sql.*;
class firstjdbc{
	public static void main(String args[]){
		try{

              Class.forName("com.mysql.cj.jdbc.Driver");
               
               String url= "jdbc:mysql://localhost:3306/sumit";
               String username="root";
               String passward="2003@lokesh";
               Connection con=DriverManager.getConnection(url,username,passward);
               if(con.isClosed()){
               	System.out.println("connection Established");

               }
               else{
               	System.out.println("connection NotEstablished");
               }
		   }
		catch(Exception e){
           e.printStackTrace();
		}
	}
}