package by.romanitski.controller;

import by.romanitski.dao.LoginDao;
import by.romanitski.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("user_name");
        String userPassword = request.getParameter("user_password");

        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);


        //TODO *add a binding to the session and fix jsp mapping!!!
        /*try {
            if (loginDao.validate(user)) {
                HttpSession session = request.getSession();
                // session.setAttribute("username",username);
                response.sendRedirect("successful_login.jsp");
            } else {
                HttpSession session = request.getSession();
                //response.sendRedirect("successful_login.jsp");
                //session.setAttribute("user", username);
                response.sendRedirect("user_login.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/successful_login.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Server at: ").append(request.getContextPath());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user_login.jsp");
        dispatcher.forward(request, response);
    }
}