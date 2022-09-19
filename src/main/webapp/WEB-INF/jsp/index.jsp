<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE HTML>
<html>
<head>
  <title>ETWAS AUSDENKEN</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<body>
<div><center><br><br><br><br>
  <h3>${pageContext.request.userPrincipal.name}</h3>
  <sec:authorize access="!isAuthenticated()">
    <h4><a href="/login">Login</a></h4>
    <h4><a href="/registration">Registration</a></h4>
  </sec:authorize>
  <sec:authorize access="isAuthenticated()">
    <h4><a href="/logout">Logout</a></h4>
  </sec:authorize>
  <h4><a href="/news">News</a></h4>
  <h4><a href="/admin">Users (only Admin)</a></h4>
  </center>
</div>
</body>
</html>