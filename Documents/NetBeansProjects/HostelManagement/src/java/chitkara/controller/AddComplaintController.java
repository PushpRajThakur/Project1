/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitkara.controller;

import chitkara.dao.ComplaintDao;
import chitkara.dao.UserDao;
import chitkara.operation.UserOperation;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddComplaintController extends HttpServlet {
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
           
                if(request.getParameter("id")!=null)
                   {
                 int id=Integer.parseInt(request.getParameter("id"));
                 String status=request.getParameter("value");
                 int i=UserOperation.updateComplaint(id,status);
                 
                 if(i>0){
                     HttpSession session = request.getSession(false);
                  session.setAttribute("message","Complaint Updated Successfully");
                  response.sendRedirect("showComplaint.jsp"); 
                 }
                 else
                 {
                     HttpSession session = request.getSession(false);
                  session.setAttribute("message","Complaint Not Udpated");
                  response.sendRedirect("showComplaint.jsp"); 
                 }
             }
                
                
                
                
                else{  
                
                
            ComplaintDao user=new ComplaintDao();
            user.setFirst_name(request.getParameter("first_name"));
            user.setLast_name(request.getParameter("last_name"));
            user.setUid(request.getParameter("uid"));
            user.setComplaint(request.getParameter("complaint"));
            int i=UserOperation.addComplaint(user);
            if(i>0)
            {
                HttpSession session = request.getSession(false);
                session.setAttribute("message","Complaint Added Successfully");
                response.sendRedirect("addComplaint.jsp");
            }
            else
            {
                HttpSession session=request.getSession(false);
                session.setAttribute("message","Complaint Not Added");
                response.sendRedirect("addComplaint.jsp");
            }
            
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

       public String getServletInfo() {
        return "Short description";
    }

}
