
package chitkara.operation;

import chitkara.db.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProfileOperation {
       static PreparedStatement stmt=null;
    static Connection con=null;
    static ResultSet rs=null;
    
    public ResultSet showProfile (String uid)
    {
        try{
             con=DbConnection.getCon();
            stmt=con.prepareStatement("select * from profile where U_id=?");
            stmt.setString(1,uid);
            rs=stmt.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
          
}
    public ResultSet showAllComplaints()
    {
        try{
             con=DbConnection.getCon();
            stmt=con.prepareStatement("select * from complaint");
            
            rs=stmt.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
}
