<%-- 
    Document   : newComment
    Created on : Mar 30, 2018, 7:13:51 AM
    Author     : rspra
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Comment</title>
    </head>
    <body>
        <h1>New Comment</h1>
        <p>
    <c:if test="${not empty error}">
        <h2><c:out value="${error}" /></h2>
    </c:if>
        </p>
        <form method="POST" action="/project5/comment">
            <input type="text" name="username" placeholder="Username" />
            <input type="text" name="comment" placeholder="Comment" />
            <br />
            <input type="submit" name="submit" value="Submit Comment" />
        </form>
    </body>
</html>
