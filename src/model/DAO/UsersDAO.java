package model.DAO;



import model.ConnectionManager;
import model.Entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rzzayed on 5/23/17.
 */
public class UsersDAO {

       private static UsersDAO usersDAOinstance = new UsersDAO();

        public static UsersDAO getInstance(){
            return usersDAOinstance;
        }

        /**
         * default Constructor
         */
        public UsersDAO()
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
                preparedStatement = con.prepareStatement("Select * from users WHERE username =? AND  password= ?");
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                resultSet = preparedStatement.executeQuery();

                resultSet.next();
                User user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                // System.out.println(user.getUsername());
                // System.out.println(user.getPassword());
                return new User(resultSet.getString("username"), resultSet.getString("password"));
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            return null;
        }

    /**
     * method to get all users from Server.database
     *
     * @return List of users
     * @throws SQLException
     */
    public List<User> getAllUsers() throws SQLException {

        Connection con = ConnectionManager.getConnection();

        // List of Users
        List<User> users = new ArrayList<>();
        Statement mystmt = null;
        try {
            // Creates a Statement object for sending SQL statements to the Server.database.
            mystmt = con.createStatement();

            // Executes the given SQL statement, which returns a single ResultSet object.
            ResultSet rs = mystmt.executeQuery("Select * from users");

            while (rs.next())
            {

                String userName = rs.getString("username");
                String password = rs.getString("password");


                users.add(new User(userName, password));
            }
            System.out.println(users.get(0));
            con.close();
        } catch (SQLException e1) {
        }
        return users;
    }







        /**
         * method to remove user from Server.database
         *
         * @param id
         * @return
         * @throws SQLException
         */
       public Boolean removeUser(int id) throws SQLException
        {
            //CachedUsers.setNoDataChanged(false);
            Connection con = ConnectionManager.getConnection();
            try {
                PreparedStatement preparedStatement = con.prepareStatement(
                        "Delete from users"
                                + " where id =(?)");
                // preparedStatement.setInt(1,employee.getSIN());
                preparedStatement.setInt(1, id);
                int rowaffected = preparedStatement.executeUpdate();
                con.close();
                return rowaffected > 0;
            } catch (SQLException ex) {

            }
            return false;
        }


}
