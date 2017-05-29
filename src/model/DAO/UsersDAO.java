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
                User user = new User(resultSet.getString(1), resultSet.getString(2));
                System.out.println(user.getUsername());
                return new User(resultSet.getString("username"), resultSet.getString("password"));
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            return null;
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
