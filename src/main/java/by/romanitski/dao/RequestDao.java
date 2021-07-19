package by.romanitski.dao;

import by.romanitski.model.Request;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RequestDao {

    public int requestUser (Request req) throws ClassNotFoundException, IOException {

        String INSERT_REQUEST = "INSERT INTO request" +
                " (userTimeOfStay) VALUE " +
                " (?);";

        int result = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = ConnectionPool.getInstance().getConnection();

        try { PreparedStatement preparedStatement = connection.prepareStatement(INSERT_REQUEST); {
            preparedStatement.setString(3, req.getUserTimeOfStay());

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