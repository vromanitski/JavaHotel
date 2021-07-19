<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1>User Register Form</h1>
    <form action="<%= request.getContextPath() %>/register" method="post">
        <table style="with: 80%">
            <tr>
                <td>User Name</td>
                <td><input type="text" name="user_name"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="user_password"/></td>
            </tr>
            <tr>
                <td>Key Word</td>
                <td><input type="text" name="user_key_word"/></td>
            </tr>
        </table>
        <input type="submit" value="Submit"/>
    </form>
</div>
</body>
</html>
