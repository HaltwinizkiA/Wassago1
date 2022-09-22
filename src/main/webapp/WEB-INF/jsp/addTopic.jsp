<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
   <link rel="stylesheet" type="text/css" href="resources/css/style.css">
  <title>New Topic</title>
</head>

<body>
<div id="upleft">
<a href="/">Main</a><br><br>
<a href="/topics">Topics</a>
<sec:authorize access="isAuthenticated()">
    <h4><a href="/logout">Logout</a></h4>
  </sec:authorize>
</div>

  <center><form:form method="POST" modelAttribute="topicForm">

    <div id="below">
    <h2>Create Topic</h2>
   <form method="POST" action="/addTopic">

         <input name="title" type="text" placeholder="Title" autofocus="true"/><br>
         <input name="Content" type="content" placeholder="Content"/>
         <button type="submit">save</button>

     </form>

  </center>

</body>
</html>