<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>The Binaries - Nuevo juego</title>

	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link href="css/nuevoJuego.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="viewport">
	<!-- Sidebar -->
	<div id="sidebar">
		<header>
			<a href="#">Juego Sopa Letras</a>
		</header>
		<ul class="nav">
			<li>
				<a href="/lista">
					<i class="zmdi zmdi-view-dashboard"></i> Tabla de puntos</a>
			</li>
			<li>
				<a href="/nuevoJuego">
					<i class="zmdi zmdi-link"></i> Nuevo Juego
				</a>
			</li>

			<li>
				<a href="/logout">
					<i class="zmdi zmdi-link"></i> Logout
				</a>
			</li>

		</ul>
	</div>
	<!-- Content -->
	<div id="content">

		<div class="container-fluid">
			<p>


			<p>
			<div class="bienvenida">
				<div>
					<h1>¡Nuevo juego!</h1>
				</div>
				<div>
					<form method="post" modelAttribute="nuevoJuego">
						<div class="username">
							<label >Nombre usuario: </label>
							<input type="text"  name="user" value="<security:authorize access="isAuthenticated()">
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

			</p>
		</div>
	</div>
</div>

</body>
</html>




