package by.romanitski.controller;

import by.romanitski.dao.RegisterDao;
import by.romanitski.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private final RegisterDao user_dao = new RegisterDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("user_name");
        String userPassword = request.getParameter("user_password");
        String userKeyWord = request.getParameter("user_key_word");

        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserKeyWord(userKeyWord);

        try {
            user_dao.registerUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/successful_registered.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Server at: ").append(request.getContextPath());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user_register.jsp");
        dispatcher.forward(request, response);
    }
}