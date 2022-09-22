<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Log in with your account</title>
  <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
  <title>Topic</title>
</head>

<body>
    <div>
<center>
  <h4><a href="/">Main Page</a></h4>
<div class="d2">
<h3>${topic.title}</h3>
</div>
<div class="d3">
<td>${topic.content}</td><br><br>
</div>
</center>


    </div>
<div><center><div class="d1">>

    <c:forEach items="${topicMessage}" var="message">
    <tr>
                <h2>${message.content}</h2><br>
                <td>${message.createDate}&nbsp</td><td>${message.author.username}</td><br><br>
              </tr>
              </c:forEach>

    <div>

    <form method="POST"  modelAttribute="messageForm">
             <input name="Content" type="content" placeholder="Your Message"/>
             <button type="submit">post</button>
                  </form>

    </div>
    </div>
    </center>
</div>
</body>
</html>