<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1>User Login Form</h1>
    <form action="<%= request.getContextPath() %>/login" method="post">
        <table style="with: 100%">
            <tr>
                <td>User Name</td>
                <td><input type="text" name="user_name"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="user_password"/></td>
            </tr>

        </table>
        <input type="submit" value="Submit"/>
    </form>
</div>
</body>
</html>
