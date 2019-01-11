<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf"  uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s"  uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
<h1>天天记账</h1>
<sf:form commandName="user">
	用户名：<sf:input path="userName"/><sf:errors path="userName" /><br/>
	登入名：<sf:input path="loginName"/><sf:errors path="loginName" /><br/>
	密   码：<sf:input path="passWord"/><sf:errors path="passWord" /><br/>
	<input type="submit" value="注册">
</sf:form>
</body>
</html>