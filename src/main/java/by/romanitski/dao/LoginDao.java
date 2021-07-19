package by.romanitski.dao;

import by.romanitski.model.User;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

    public boolean validate(User user) throws ClassNotFoundException, IOException  {

        boolean status = false;

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = ConnectionPool.getInstance().getConnection();

        try { PreparedStatement preparedStatement = connection
                     .prepareStatement("SELECT * FROM users WHERE userName = ? AND userPassword = ? "); {
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getUserPassword());

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        }} catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        return status;
    }
}