package model.DAO;

import model.Entities.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rzzayed on 5/23/17.
 */
public class CourseDAO
{
    /*    private static CourseDAO courseDAO = new CourseDAO();
        private  ConnectionPool connectionPool;

    private CourseDAO()
        {
            try {
                connectionPool= new ConnectionPool("com.mysql.jdbc.Driver",
                        "jdbc:mysql://localhost:3306/chat_db?useSSL=false",
                        "root","root",5,10,true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
 /*   public boolean addCourseToDB(Course course) throws SQLException
    {
        // don't get the messages from the cache because data changed
        CachedCourses.setNoDataChanged(false);

        Connection connection = connectionPool.getConnection();
        try {
            // Creates a PreparedStatement object for sending parameterized SQL statements to the Server.database.
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("insert into courses "
                            + "(courseID,courseName)"
                            + " values (?,?)");

            preparedStatement.setInt(1, course.getCourseID());
            preparedStatement.setString(2, course.getCourseName());

            int rowAffected = preparedStatement.executeUpdate();

            connectionPool.free(connection);
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
 /*   public List<Course> getAllCourses() throws SQLException
    {
        Connection connection =  connectionPool.getConnection();

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

                courses.add(new Course(courseId,courseName));
            }

            connectionPool.free(connection);
            connection.close();
        } catch (SQLException e1) {
        }
        return courses;
    }

}*/
}
