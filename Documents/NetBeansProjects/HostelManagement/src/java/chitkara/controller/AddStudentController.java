/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitkara.controller;

import chitkara.dao.UserDao;
import chitkara.operation.UserOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.tomcat.jni.User;


public class AddStudentController extends HttpServlet {
    

   
   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            UserDao user=new UserDao();
            user.setFirst_name(request.getParameter("first_name"));
            user.setLast_name(request.getParameter("last_name"));
            user.setUid(request.getParameter("uid"));
            user.setUser_type("User");
            user.setPassword("itsme");
            int i=UserOperation.addStudent(user);
            if(i>0)
            {
                HttpSession session = request.getSession(false);
                session.setAttribute("message","Student Added Successfully");
                response.sendRedirect("addStudent.jsp");
            }
            else
            {
                HttpSession session=request.getSession(false);
                session.setAttribute("message","Student Not Added");
                response.sendRedirect("addStudent.jsp");
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
