package model.DAO;

import model.ConnectionManager;
import model.Entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rzzayed on 5/29/17.
 */
public class StudentDAO
{
    private static StudentDAO usersDAOinstance = new StudentDAO();

    public static StudentDAO getInstance(){
        return usersDAOinstance;
    }

    /**
     * default Constructor
     */
    public StudentDAO()
    {
    }

    /**
     * This method is used when the user Logs in to check if he has an account in the database
     * @param username
     * @param password
     * @return
     */
    public User CheckInDatabase(String username, String password)
    {
        Connection con = ConnectionManager.getConnection();
        PreparedStatement preparedStatement;
        ResultSet resultSet = null;
        System.out.println(username + " " + password);
        try {
            preparedStatement = con.prepareStatement("Select * from students WHERE username =? ");
            preparedStatement.setString(1, username);

            resultSet = preparedStatement.executeQuery();

            resultSet.next();

            //System.out.println(user.getUsername());
            return new User(resultSet.getString("username"), resultSet.getString("password"));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
