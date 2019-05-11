/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitkara.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection implements Provider
{
	static Connection con=null;

	public static Connection getCon() throws SQLException {
		try{
		Class.forName(driver);	
		con=DriverManager.getConnection(url,username,password);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return con;
	}
}

