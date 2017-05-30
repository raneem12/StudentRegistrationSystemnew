package model.controllers;

/**
 * Created by rzzayed on 5/28/17.
 */
import model.DAO.UsersDAO;
import model.Entities.Student;
import model.Entities.User;
import model.Entities.UserForm;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest request,
                                HttpServletResponse response) throws IOException {
        ArrayList<User> users = null;
        UserForm userForm = new UserForm();
        // populate action properties
        userForm.setUsername(request.getParameter("username"));
        userForm.setPassword(request.getParameter("password"));

            // create Product from ProductForm
            User user = new User();
            user.setUsername(userForm.getUsername());
            user.setPassword(userForm.getPassword());
            User loggedInUser = UsersDAO.getInstance().CheckInDatabase(user.getUsername(),user.getPassword());
        try {
            users = (ArrayList<User>) UsersDAO.getInstance().getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (loggedInUser != null ) {

                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser",user);
                // if (loggedInUser.getUserType() =="admin")

                //User student = new Student();

            // no validation error, execute action method
            // insert code to save product to the database

            // store product in a scope variable for the view
            request.setAttribute("user", user);
            request.setAttribute("users",users);
                //response.sendRedirect("usersList.jsp");
            return "/adminPage.jsp";
            }

            else return "/index.jsp";

    }
}

