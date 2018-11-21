<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Confirm</title>
</head>
<body>
<a href="getguestbooklist.do"><img src=gb2.png></a>
<%String no = request.getParameter("no");%>
<%String name = request.getParameter("name");%>
<%String password = request.getParameter("password");%>
<%String content = request.getParameter("content");%>

<form action="updatecon.do" method="post">


<table>
<tr>
<td> 비밀번호 </td>
<td> <input type = "password" name ="pwcon" > </td>

<td> <input type="submit" value="수정"> </td>


</tr>
</table>

</form>

</body>
</html>