<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
		<%
			List<Collaborateur> collabs = (List<Collaborateur>) request.getAttribute("listeCollaborateurs");
			for (Collaborateur c : collabs) {
		%>
		<li>Nom: <%=c.getNom()%></li>
		<%
			}
		%>
	</ul>
</body>
</html>