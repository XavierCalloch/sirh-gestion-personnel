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
	<h1>Nouveau collaborateur</h1>
	<br>
	
	<% 
		Collaborateur c = (Collaborateur) request.getAttribute("collaborateur");
	
		if (c == null) { %>
			<form method=post>
				<label for="lbnom">Nom:</label><br>
				<input type="text" id="lbnom" name="nom"><br><br>
				
				<label for="lbprenom">Pr&eacute;nom:</label><br>
				<input type="text" id="lbprenom" name="prenom"><br><br>
				
				<label for="lbdateNaiss">Date de naissance:</label><br>
				<input type="text" id="lbdateNaiss" name="dateNaiss"><br><br>
				
				<label for="lbadresse">Adresse:</label><br>
				<textarea class="form-control" type="text" name="adresse" id="lbadresse" rows="3" cols="30"></textarea><br><br>
				
				<label for="lbnumSecu">Num&eacute;ro de s&eacute;curit&eacute;sociale:</label><br>
				<input type="text" id="lbnumSecu" name="numSecu"><br><br>
				
				<input type="submit" value="Valider"></input>
			</form>
		<% }
		else { %>
			<p> Erreurs de paramètres </p>	
		
			<form method=post>
				<label for="lbnom">Nom:</label><br>
				<input type="text" id="lbnom" name="nom" value="<%= c.getNom()%>"><br><br>
				
				<label for="lbprenom">Pr&eacute;nom:</label><br>
				<input type="text" id="prenom" name="lbprenom" value="<%= c.getPrenom()%>"><br><br>
				
				<label for="lbdateNaiss">Date de naissance:</label><br>
				<input type="text" id="lbdateNaiss" name="dateNaiss" value="<%= c.getDateNaissance()%>"><br><br>
				
				<label for="lbadresse">Adresse:</label><br>
				<textarea class="form-control" type="text" name="adresse" id="lbadresse" rows="3" cols="10"
					value="<%= c.getAdresse()%>"></textarea><br><br>
				
				<label for="lbnumSecu">Num&eacute;ro de s&eacute;curit&eacute;sociale:</label><br>
				<input type="text" id="lbnumSecu" name="numSecu" value="<%= c.getNumSecu()%>"><br><br>
		
				<input type="submit" value="Valider"></input>
			</form>	
			
			<%
		}
			%>

</body>
</html>