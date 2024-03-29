<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Registration</title>
  <link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>

<body>
<div><center><br><br><br><br>
  <form:form method="POST" modelAttribute="userForm">
    <h2>Registration</h2>
    <div>
     <h4><a href="/">Main Page</a></h4>

      <form:input type="text" path="username" placeholder="Username"
                  autofocus="true"></form:input>
      <form:errors path="username"></form:errors>
        ${usernameError}
    </div>
    <div>
      <form:input type="password" path="password" placeholder="Password"></form:input>
    </div>
    <div>
      <form:input type="password" path="passwordConfirm"
                  placeholder="Confirm your password"></form:input><br>
      <form:errors path="password"></form:errors>
        ${passwordError}

    </div>
    <button type="submit">Submit</button>
  </form:form>
  <a href="/">Main</a>
    </center>
</div>
</body>
</html>