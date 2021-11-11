<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta http-equiv="Cache-Control" content="no-store,no-cache,must-revalidate">
	<meta http-equiv="Pragma" content="no-cache">
	<meta http-equiv="Expires" content="-1">
	<link href="css/style.css" rel="stylesheet" type="text/css">
	<title>The Binaries - Login</title>
</head>
<body>
<div>
	<h1>THE BINARIES</h1>
	<h2>¡Bienvenidos a nuestro juego!</h2>
	<h4>Introduce tu nombre de usuario y contraseña</h4>


	<form method="POST" action="/login">
		<table>
			<tr><td>Nombre usuario: </td><td><input type="text" name="username"/></td></tr>
			<tr><td>Contraseña: </td><td><input type="password" name="password"/></td></tr>
			<tr><td></td><td><input type="submit" name="buttonSubmit" value="Login"/></td></tr>
		</table>
	</form>
	<div class="error">
		<%
			String error = request.getParameter("error");
			if(error != null){
				if(error.equals("true")){
					out.print("Te has confundido, por favor vuelve a intentarlo.");
				}
			}
		%>
	</div>
</div>

</body>
</html>