/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitkara.operation;

/**
 *
 * @author PushpRajThakur
 */
import chitkara.dao.ComplaintDao;
import chitkara.dao.UserDao;
import chitkara.db.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserOperation {
    static PreparedStatement stmt=null;
    static Connection con=null;
    static ResultSet rs=null;
    
    public static UserDao login(UserDao user)
    {
        try{
             con=DbConnection.getCon();
            stmt=con.prepareStatement("select * from user where U_id=? and password=?");
            stmt.setString(1,user.getUid());
            stmt.setString(2,user.getPassword());
            rs=stmt.executeQuery();
            
            if(rs.next()){
               // System.out.println(rs.getString("first_name")+" "+rs.getString("last_name"));
               user.setFirst_name(rs.getString("first_name"));
               user.setLast_name(rs.getString("last_name"));
               user.setId(rs.getInt("id"));
               user.setUser_type(rs.getString("user_type"));
               return user;
            }
            else
            {
                user=null;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return user;
    }
    public static int addStudent(UserDao user)
    {
        int i=0;
        try
        {
            con=DbConnection.getCon();
            stmt=con.prepareStatement("insert into user(First_name,Last_name,U_id,Password,user_type) values(?,?,?,?,?)");
            stmt.setString(1,user.getFirst_name());
            stmt.setString(2,user.getLast_name());
            stmt.setString(3,user.getUid());
            stmt.setString(4,user.getPassword());
            stmt.setString(5,user.getUser_type());
            i=stmt.executeUpdate();
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                }
        return i;
}

    public static int addComplaint(ComplaintDao complaint) {
        int i=0;
        try
        {
            con=DbConnection.getCon();
            stmt=con.prepareStatement("insert into complaint(first_name,last_name,uid,comp) values(?,?,?,?)");
          
            stmt.setString(1,complaint.getFirst_name());
            stmt.setString(2,complaint.getLast_name());
            stmt.setString(3,complaint.getUid());
            stmt.setString(4,complaint.getComplaint());
           i=stmt.executeUpdate();
        }
         catch(Exception e)
                {
                    e.printStackTrace();
                }
        return i;
    }
    
     public static int updateComplaint(int id,String status)
        {
            int i=0;
            try{
                con=DbConnection.getCon();
                stmt=con.prepareStatement("update complaint set status=? where id=?");
                stmt.setString(1,status);
                stmt.setInt(2,id);
                i=stmt.executeUpdate();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return i;
        }
}

