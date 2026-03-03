import java.sql.*;
class insertjdbc{
	public static void main(String args[]){
		try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/sumit";
         String username="root";
         String passward="*******";       //enter your passward
         Connection con=DriverManager.getConnection(url,username,passward);
           

           Sring q="create table Table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
             
             Statement smt=con.createStatement();
             smt.executeUpdate(q);
             System.out.println("table created Table1 bro");
             con.close();
		}
		catch(Exception c){
			c.printStrackTrace();

		}
	}
}