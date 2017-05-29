package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by rzzayed on 5/29/17.
 */

    public class ConnectionManager
    {
        /**
         * instance fields used to connect to the Database
         */
        private static final String URL = "jdbc:mysql://localhost:3306/chat?useSSL=false";
        private static final String USER = "root";
        private static final String PASSWORD = "root";

        /**
         * method that attempts to establish a connection to the given Server.database URL
         *
         * @return a connection to the URL
         */
        public static Connection getConnection()
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                return DriverManager.getConnection(URL, USER, PASSWORD);
            }
            catch (SQLException ex)
            {
                Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

