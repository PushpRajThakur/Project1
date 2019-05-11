package chitkara.controller;

import chitkara.dao.UserDao;
import chitkara.operation.UserOperation;
import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      

           UserDao user=new UserDao();
           user.setUid(request.getParameter("uid"));
           user.setPassword(request.getParameter("password"));
           user=UserOperation.login(user);  
           PrintWriter out=response.getWriter();
           
           if(user!=null && user.getUser_type().equalsIgnoreCase("Admin"))
           {
               HttpSession session=request.getSession(true);
               session.setAttribute("user",user);
               response.sendRedirect("ADMIN/dashboard.jsp");
           }
           else if(user!=null && user.getUser_type().equalsIgnoreCase("User"))
           {
               HttpSession session=request.getSession(true);
               //session.setMaxInactiveInterval(1*60);
               session.setAttribute("user",user);
               response.sendRedirect("USER/dashboard.jsp?id="+session.getId());
           }
           else
           {
              // out.println("Sorry uid or password error");
               response.sendRedirect("index.html");
           }
      
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
}
