/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManager;
import java.sql.*;

/**
 *
 * @author PATIR
 */
public class Host {
    static Connection con = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            System.out.println("准备连接数据库!");    
	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
	    con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=Bookmanager","sa","123456");    
	    System.out.println("连接成功!");
        }
        catch (Exception e) 
	{    
	    System.out.println("连接错误："+e);  
        }
        Login Start=new Login();
        Start.setVisible(true);
    }
    
}
