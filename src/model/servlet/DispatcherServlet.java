package model.servlet;


import model.DAO.CourseDAO;
import model.DAO.UsersDAO;
import model.Entities.Course;
import model.controllers.AdminController;
import model.controllers.InputProductController;
import model.controllers.LoginController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


    public class DispatcherServlet extends HttpServlet {

        private static final long serialVersionUID = 748495L;

        @Override
        public void doGet(HttpServletRequest request,
                          HttpServletResponse response)
                throws IOException, ServletException {
            process(request, response);
        }

        @Override
        public void doPost(HttpServletRequest request,
                           HttpServletResponse response)
                throws IOException, ServletException {
            process(request, response);
        }

        private void process(HttpServletRequest request,
                             HttpServletResponse response)
                throws IOException, ServletException {

            String uri = request.getRequestURI();
        /*
         * uri is in this form: /contextName/resourceName,
         * for example: /app10a/product_input.
         * However, in the event of a default context, the
         * context name is empty, and uri has this form
         * /resourceName, e.g.: /product_input
         */
            int lastIndex = uri.lastIndexOf("/");
            String action = uri.substring(lastIndex + 1);
            response.getWriter().println(uri);
            String dispatchUrl = null;

            if (action.equals("login.action"))
            {
                LoginController controller =
                        new LoginController();
                dispatchUrl = controller.handleRequest(request,
                        response);
            }
            else if (action.equals("listUser.action"))
            {
                LoginController controller =
                        new LoginController();
                dispatchUrl = controller.handleRequest(request,
                        response);
            }
            else if (action.equals("listStudents"))
            {
               /* AdminController controller =
                        new AdminController();
                dispatchUrl = controller.handleRequest(request,
                        response);*/
            }  else if (action.equals("listcourses"))
            {
                try {
                    ArrayList<Course> courses = (ArrayList<Course>) CourseDAO.getInstance().getAllCourses();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }


            if (dispatchUrl != null)
            {
                RequestDispatcher rd =
                        request.getRequestDispatcher(dispatchUrl);
                rd.forward(request, response);
            }
        }
    }

