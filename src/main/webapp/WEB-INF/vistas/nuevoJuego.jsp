<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Binaries - Nuevo Juego</title>
<link href="css/nuevoJuego.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="bienvenida">
	<div>
		<h1>¡Nuevo juego!</h1>
	</div>
	<div>
		<form method="post" modelAttribute="nuevoJuego">
			<div class="username">
				<label >Nombre usuario: </label>
				<input type="text"  name="users" value="<security:authorize access="isAuthenticated()">
		<security:authentication property="principal.username" />
	</security:authorize>">

			</div>
		<div class="words">
			<label>Palabras: </label>
			<input type="text" name ="word1"/>
			<input type="text" name ="word2"/>
			<input type="text" name ="word3"/>
			<input type="text" name ="word4"/>
			<input type="text" name ="word5"/>
			<button type="submit">Jugar</button>
		</div>	
		</form>
	</div>
	
	</div>

	<div id=container>
		Bienvenido
		<div id=flip>
			<div><div>Sopa</div></div>
			<div><div>The Binaries</div></div>
			<div><div>de letras</div></div>

		</div>
		<security:authorize access="isAuthenticated()">
			  <security:authentication property="principal.username" />
		</security:authorize>
	</div>


</body>
</html>