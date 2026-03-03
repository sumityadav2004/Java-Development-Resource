import java.sql.*;
import java.io.*;
import javax.swing.*;
public class longimage{
	public static void main(String args[]){
		try{
          Class.forName("com.mysql.cj.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/sumit";
         String username="root";
         String passward="*********";           //enter your passward
         Connection con=DriverManager.getConnection(url,username,passward);
         String q="insert into image(pic) value(?)";
         PreparedStatement psmt=con.prepareStatement(q);
         JFileChooser jfc=new JFileChooser();
         jfc.showOpenDialog(null);
         File file =jfc.getSelectedFile();
         FileInputStream fis=new FileInputStream(file);
         psmt.setBinaryStream(1,fis,fis.available());
         psmt.executeUpdate();
         JOptionPane.showMessageDialog(null, "sucess");

	}catch(Exception c){
		c.printStackTrace();
	}
}}
