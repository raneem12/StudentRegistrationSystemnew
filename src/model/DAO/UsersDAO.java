package model.DAO;



import model.Entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rzzayed on 5/23/17.
 */
public class UsersDAO {

      /*  private static UsersDAO usersDAOinstance = new UsersDAO();

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
  /*      public User CheckInDatabase(String username, String password)
        {
            Connection con = ConnectionManager.getConnection();
            PreparedStatement preparedStatement;
            ResultSet resultSet = null;
            try {
                preparedStatement = con.prepareStatement("Select * from users" +
                        " where username = ? and password =? ");
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                resultSet = preparedStatement.executeQuery();

                resultSet.next();

                return new User(resultSet.getString("username"), resultSet.getString("password"),resultSet.getString("user_type"));
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
 /*       public List<User> getAllUsers() throws SQLException {

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
                    int id = rs.getInt(1);
                    String userName = rs.getString(2);
                    String password = rs.getString(3);
                    String userType = rs.getString(4;

                    users.add(new User(id, userName, password,userType));
                }
                con.close();
            } catch (SQLException e1) {
            }
            return users;
        }


        /**
         * method to add User to Server.database
         *
         * @param user
         * @return
         * @throws SQLException
         */
     /*   public boolean addUser(User user) throws SQLException {
            CachedUsers.setNoDataChanged(false);
            Connection connection = ConnectionManager.getConnection();
            try {
                // Creates a PreparedStatement object for sending parameterized SQL statements to the Server.database.
                PreparedStatement preparedStatement = connection.prepareStatement
                        ("insert into users "
                                + "(username,password,user_Type)"
                                + " values (?,?,?,?)");

                preparedStatement.setString(1, user.getUserName());
                preparedStatement.setString(2, user.getPassword());
                preparedStatement.setString(3 , user.getUserType());


                int rowAffected = preparedStatement.executeUpdate();
                connection.close();
                return rowAffected > 0;
            } catch (SQLException e) {
            }
            return false;
        }


        /**
         * method to remove user from Server.database
         *
         * @param id
         * @return
         * @throws SQLException
         */
  /*      public Boolean removeUser(int id) throws SQLException
        {
            CachedUsers.setNoDataChanged(false);
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
    }*/
}
