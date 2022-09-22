<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Log in with your account</title>
  <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
  <title>All Topic</title>
</head>

<body>
<div>
<div id="upleft">
  <h4><a href="/">Main Page</a></h4>
  <h4><a href="/news">News</a></h4><br>
  </div>
  <center>
    <c:forEach items="${allTopic}" var="topic">
      <tr>
      <a href="/topic/${topic.id}">${topic.title}</a><br>
      </tr>
    </c:forEach>
    </center>
</div>
</body>
</html>