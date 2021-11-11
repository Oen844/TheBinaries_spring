<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <title>The Binaries - Sopa de letras</title>

 	<link href="css/juego.css" rel="stylesheet" type="text/css">
	<link href="css/time.css" rel="stylesheet" type="text/css">

    <link rel="stylesheet" type="text/css" href="/css/wordfind.css">
    <script language="javascript" type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script> 
    <script type="text/javascript" src="/js/wordfind/wordfind.js"></script>
    <script type="text/javascript" src="/js/wordfind/wordfindgame.js"></script>
	<script type="text/javascript" src="/js/juego.js"></script>
 
	<style>
	.crono_wrapper {text-align:center;width:200px;}
	</style>
</head>
<body onload="empezarDetener()">
	<div class="container">
	     <h1>¡Vamos a jugar!</h1>
		<div class="sopaletras">
		  	 <div id='juego'></div>
	   		 <div id='Palabras' class="words"></div>
		</div>
		<div class="footer">
					<div class="crono_wrapper">
						<h2 id='crono'>00:00:00</h2>
					</div>
					<form method="post" modelAttribute="game">
						<input type="hidden" id="score" name="score">
				 		<input type="hidden" id="duration" name="duration">
				 		<button type="submit" id='solve' class="btnSolve" onclick="diferencia(inicio,actual)">Resolver</button>
					</form>
		</div>
	</div>

	<div class="circle">
		<div class="up">
			<div class="innera"></div>
		</div>
		<div class="down">
			<div class="innerb"></div>
		</div>
	</div>



    <script>
    var words = [];
   	var word1 = "${palabras[0]}";
   	if (word1 != "")
    {
   		words.push(word1);
    }
   	var word2 = "${palabras[1]}";
   	if (word2 != "")
    {
   		words.push(word2);
    }
   	var word3 = "${palabras[2]}";
   	if (word3 != "")
    {
   		words.push(word3);
    }
   	var word4 = "${palabras[3]}";
   	if (word4 != "")
    {
   		words.push(word4);
    }
   	var word5 = "${palabras[4]}";
   	if (word5 != "")
    {
   		words.push(word5);
    }
    var gamePuzzle = wordfindgame.create(words, '#juego', '#Palabras');

    var puzzle = wordfind.newPuzzle(words,{height: 18, width:18, fillBlanks: false});
    wordfind.print(puzzle);

    $('#solve').click( function() {wordfindgame.solve(gamePuzzle, words);});
        
    </script>
    
    
</body>
</html>