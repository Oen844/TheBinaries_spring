<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Score</title>



    <link href="css/canvas.css" rel="stylesheet" type="text/css">
    <!-- Latest compiled and minified CSS -->

    <link href="css/navbar.css" rel="stylesheet" type="text/css">
    <link href="css/lista.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>


<div id="viewport">
    <!-- Sidebar -->
    <div id="sidebar">
        <header>
            <a href="#">My App</a>
        </header>
        <ul class="nav">
            <li>
                <a href="/lista">
                    <i class="zmdi zmdi-view-dashboard"></i> Tabla de puntos
                </a>
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
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#"><i class="zmdi zmdi-notifications text-danger"></i>
                        </a>
                    </li>
                    <li><a href="#"><security:authorize access="isAuthenticated()">
                        <security:authentication property="principal.username" />
                    </security:authorize></a></li>
                </ul>
            </div>
        </nav>
        <div class="container-fluid">
            <p>

            <div class="table-title">
                <div class="table-fill">
                    <h1>Estas son todas las puntuaciones!</h1>
                    <table border="1" cellpadding="5" class="table">
                        <thead class="thead-dark">
                        <tr>
                            <th  scope="col">#</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Fecha</th>
                            <th scope="col">Duracion</th>
                            <th scope="col">Puntos</th>
                        </tr>
                        </thead>
                        <% int i = 1; %>
                        <c:forEach var="game" items="${scores}">
                            <tr>
                                <td scope="row"><%=i++%></td>
                                <td><c:out value="${game.username}" /></td>
                                <td><c:out value="${game.gameDate}" /></td>
                                <td><c:out value="${game.duration}" /></td>
                                <td><c:out value="${game.score}" /></td>
                            </tr>
                        </c:forEach>
                    </table>



                </div>

            </div>


            </p>
        </div>
    </div>
</div>

<div class = "canvas">
    <div><canvas id="drawing_canvas"></canvas></div>
</div>


<script src="js/canvas.js"></script>

</body>
</html>