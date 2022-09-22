<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
     <title>Log in with your account</title>
     <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
  <title>News</title>
</head>

<body>
<div><div id="upleft">
       <h4><a href="/">Main Page</a></h4>
       <h4><a href="/topics">Topics</a></h4><br>
       </div>
<center><td><form action="/addNews" method="get"></td>
            <button type="submit">Add News</button>
    <h1>News</h1>
    <c:forEach items="${allNews}" var="news">
    <tr>
                <br><h2>${news.title}</h2>
                <td>${news.content}</td><br>
                <td>${news.date}&nbsp</td><td>${news.user.username}</td><br><br>
              </tr>
              </c:forEach>
    </center>
</div>
</body>
</html>