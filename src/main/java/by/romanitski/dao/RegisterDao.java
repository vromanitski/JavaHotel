package by.romanitski.dao;

import by.romanitski.model.User;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

    public int registerUser(User user) throws ClassNotFoundException, IOException {

        String INSERT_USERS = "INSERT INTO users" +
                " (userId, userName, userPassword, userKeyWord) VALUES " +
                " (?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = ConnectionPool.getInstance().getConnection();

        try { PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS); {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, user.getUserPassword());
            preparedStatement.setString(4, user.getUserKeyWord());

            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();
        }} catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        return result;
    }
}