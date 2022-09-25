<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Registration</title>
  <link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>

<body>
    <div>
    <div id="upleft">
                <h4><a href="/">Main Page</a></h4>
                <h4><a href="/topics">Topics</a></h4>
                <h4><a href="/news">News</a></h4><br>
    </div>

<center>
<h2>Personal Area<h2>
<form:form method="POST" modelAttribute="userForm">
<h3>change password<h3>

<div>
<form method="POST" action="/personalArea">
      <input name="password"type="password" path="password" placeholder="Password"/>
<br>
      <input name="passwordConfirm"input type="password" path="passwordConfirm"
                  placeholder="Confirm your password"/><br>
      <form:errors path="passwordError"></form:errors><br>
        ${passwordError}
    <button type="submit">Submit</button>
    </div>
</form:form>
</center>
    </div>
</body>
</html>