<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <title>The Binaries - Sopa de letras</title>
 	<link href="css/juego.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="/css/wordfind.css">
    <script language="javascript" type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script> 
    <script type="text/javascript" src="/wordfind/wordfind.js"></script> 
    <script type="text/javascript" src="/wordfind/wordfindgame.js"></script> 


</head>
<h1>Juego Sopa de Letras</h1>
<link href="css/juego.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="/css/wordfind.css">
<script language="javascript" type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script type="text/javascript" src="/wordfind/wordfind.js"></script>
<script type="text/javascript" src="/wordfind/wordfindgame.js"></script>
<script>
  var inicio=0;
  var timeout=0;
  var actual=0;
  var points = 5000;

  function diferencia(inicio,actual){
    var tiempo = new Date(actual-inicio);
    var seconds = tiempo.getTime() / 1000;
    seconds = Math.floor(seconds);
    points = points - seconds;
    if (points <= 0){
      points = 1;
    }
    else if(points >= 4970){
      points = 5000;
    }
    document.getElementById("score").value = puntos;
    document.getElementById("duration").value = seconds;
    return seconds,points;
  }

  function empezarDetener()
  {
    if(timeout==0)
    {
      // Obtenemos el valor actual
      inicio=vuelta=new Date().getTime();

      // iniciamos el proceso
      funcionando();

    }
  }

  function funcionando()
  {
    // obteneos la fecha actual
    actual = new Date().getTime();

    // obtenemos la diferencia entre la fecha actual y la de inicio
    var diff=new Date(actual-inicio);

    // mostramos la diferencia entre la fecha actual y la inicial
    var result=LeadingZero(diff.getUTCHours())+":"+LeadingZero(diff.getUTCMinutes())+":"+LeadingZero(diff.getUTCSeconds());
    document.getElementById('crono').innerHTML = result;

    // Indicamos que se ejecute esta función nuevamente dentro de 1 segundo
    timeout=setTimeout("funcionando()",1000);
  }

  /* Funcion que pone un 0 delante de un valor si es necesario */
  function LeadingZero(Time) {
    return (Time < 10) ? "0" + Time : + Time;
  }
</script>

<style>
  .crono_wrapper {text-align:center;width:200px;}
</style>
</head>
<body onload="empezarDetener()">
<div class="container">
  <h1>¡Comenzamos el juego!</h1>
  <div class="sopaletras">
    <div id='juego'></div>
    <div id='Palabras' class="palabras"></div>
  </div>
  <div class="footer">
    <div class="crono_wrapper">
      <h2 id='crono'>00:00:00</h2>
    </div>
    <form method="post" modelAttribute="juego">
      <input type="hidden" id="puntos" name="puntos">
      <input type="hidden" id="duracion" name="duracion">
      <button type="submit" id='solve' class="btnSolve" onclick="diferencia(inicio,actual)">Resolver</button>
    </form>
  </div>
</div>





<script>
  var palabras = [];
  var word1 = "${palabras[0]}";
  if (word1 != "")
  {
    palabras.push(word1);
  }
  var word2 = "${palabras[1]}";
  if (word2 != "")
  {
    palabras.push(word2);
  }
  var word3 = "${palabras[2]}";
  if (word3 != "")
  {
    palabras.push(word3);
  }
  var word4 = "${palabras[3]}";
  if (word4 != "")
  {
    palabras.push(word4);
  }
  var word5 = "${palabras[4]}";
  if (word5 != "")
  {
    palabras.push(word5);
  }
  var gamePuzzle = wordfindgame.create(palabras, '#juego', '#Palabras');

  var puzzle = wordfind.newPuzzle(palabras,{height: 18, width:18, fillBlanks: false});
  wordfind.print(puzzle);

  $('#solve').click( function() {wordfindgame.solve(gamePuzzle, wpalabras);});

</script>


</body>
</html>