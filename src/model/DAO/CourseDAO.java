package model.DAO;

import model.utility.ConnectionManager;
import model.Entities.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rzzayed on 5/23/17.
 */
public class CourseDAO
{
       private static CourseDAO courseDAO = new CourseDAO();
       // private  ConnectionPool connectionPool;

    private CourseDAO()
        {

        }
    public static CourseDAO getInstance(){
        return courseDAO;
    }

    /**
     * Method to add message to database Message table
     * @param course
     * @return true if succeeded
     * @throws SQLException
     */
   public boolean addCourseToDB(Course course) throws SQLException
    {

        Connection connection = ConnectionManager.getConnection();
        try {
            // Creates a PreparedStatement object for sending parameterized SQL statements to the Server.database.
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("insert into courses "
                            + "(courseID,courseName)"
                            + " values (?,?)");

            preparedStatement.setInt(1, course.getCourseID());
            preparedStatement.setString(2, course.getCourseName());

            int rowAffected = preparedStatement.executeUpdate();

            connection.close();
            return rowAffected > 0;

        } catch (SQLException e) {
        }
        return false;
    }

    /**
     * method to get all messsages from Server.database
     * @return List of messages
     * @throws SQLException
     */
   public List<Course> getAllCourses() throws SQLException
    {
        Connection connection =  ConnectionManager.getConnection();

        // ArrayList of messages
        List<Course> courses = new ArrayList<>();
        Statement mystmt = null;
        try {
            // Creates a Statement object for sending SQL statements to the Server.database.
            mystmt = connection.createStatement();

            // Executes the given SQL statement, which returns a single ResultSet object.
            ResultSet rs = mystmt.executeQuery("Select * from courses");

            while (rs.next())
            {
                int courseId = rs.getInt(1);
                String courseName = rs.getString(2);

                courses.add(new Course(courseName,courseId));
            }

            connection.close();
        } catch (SQLException e1) {
        }
        return courses;
    }

}

