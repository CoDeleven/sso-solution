<html>
<body>
<h2>Hello <%=request.getAttribute("username")%>!</h2>
Your SessionID is: <%= request.getSession().getId()%>
</body>
</html>
