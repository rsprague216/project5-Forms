<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home</title>
    </head>
    <body>
        <h1>Project 5 Home Page</h1>
        <p>
        <ul>
            <c:forEach var="userComment" items="${userComments}">
                <li>
                    <c:out value="${userComment.name}" />: 
                    <c:out value="${userComment.comment}" />
                </li>
            </c:forEach>
        </ul>
        </p>
        <form method="GET" action="/project5/comment">
            <input type="submit" name="comment" value="New Comment" />
        </form>
    </body>
</html>
