<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1>User Login Form</h1>
    <form action="<%= request.getContextPath() %>/request" method="post">
        <table style="with: 100%">
            <tr>
                <td>Room Capacity</td>
                <td><input type="text" name="room_capacity"/></td>
            </tr>

            <%-- TODO *add enumeration data iteration !!!--%>
            <tr>
                <%--<td>Room Class</td>
                <jsp:useBean id="obj" class="by.romanitski.model.Room" scope="page"/>

                <label>
                    <select>
                        <c:forEach var="item" items="${obj.RoomClass}">
                        <option>${item}</option>
                        </c:forEach>
                    </select>
                </label>--%>
            </tr>
            <tr>
                <td>User Time of Stay</td>
                <td><input type="date" name="user_time_of_stay"/></td>
            </tr>
        </table>
        <input type="submit" value="Submit"/>
    </form>
</div>
</body>
</html>