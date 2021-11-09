<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Binaries - Resultado</title>
<link href="css/lista.css" rel="stylesheet" type="text/css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
 
</head>
<body>
	<h1>Listado de los resultados</h1>
	<table border="1" cellpadding="5" class="table">
		<thead class="thead-dark">
		<tr>
			<th scope="col">#</th>
			<th scope="col">Nombre</th>
			<th scope="col">Fecha</th>
			<th scope="col">Duración</th>
			<th scope="col">Puntos</th>
		</tr>
		</thead>
		<% int i = 1; %>
		<c:forEach var="juego" items="${puntos}">
			<tr>
				<td scope="row"><%=i++%></td>
				<td><c:out value="${juego.username}" /></td>
				<td><c:out value="${juego.gameDate}" /></td>
				<td><c:out value="${juego.duracion}" /></td>
				<td><c:out value="${juego.puntos}" /></td>
			</tr>
		</c:forEach>
	</table>

	</table>
	</div>
	<form method="post">
		<button type="submit" id='nuevoJuego' class="btnNuevoJuego">NUEVO JUEGO</button>
	</form>
	</div>

</body>
</html>