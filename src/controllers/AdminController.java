package controllers;

import model.DAO.CourseDAO;
import model.DAO.UsersDAO;
import model.Entities.Course;
import model.Entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by rzzayed on 5/30/17.
 */
public class AdminController implements Controller
{
    private String action;

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        if (action.equals("listcourses"))
        {
            try
            {
                ArrayList<Course> courses = (ArrayList<Course>) CourseDAO.getInstance().getAllCourses();
                request.setAttribute("courses", courses);
                request.setAttribute("action",action);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else if (action.equals("listusers"))
        {
            try
            {
                ArrayList<User> users = (ArrayList<User>) UsersDAO.getInstance().getAllUsers();
                System.out.println(users);
                request.setAttribute("users", users);
                request.setAttribute("action",action);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else if (action.equals("insertUser"))
        {
           String username = request.getParameter("Username");
           String password = request.getParameter("password");
           String userType = request.getParameter("User Type");
           int type = 0;
           if (userType.equals("Admin")){
               type = 2;
           }
           else if (userType.equals("Student")){
               type = 1;
           }
           else if (userType.equals("Teacher")){
               type = 0;
           }
            UsersDAO.getInstance().addUser(new User(username,password,type));
           ArrayList<User> users = (ArrayList<User>) UsersDAO.getInstance().getAllUsers();
            System.out.println(users + "neww");
           request.setAttribute("users",users);
           request.setAttribute("action",action);
        }
        return "/adminPage.jsp";

    }
}
