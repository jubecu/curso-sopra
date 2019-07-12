<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home de Spring MVC</title>
</head>
<body>
	<marquee>
		<h1>Formulario</h1>
	</marquee>
	<form action="muestrapelis">
		Titulo: <input type="text" name="titulo"> <br><br>
		Director: <input type="text" name="director"> <br><br>
		Sinopsis: <input type="text" name="sinopsis"> <br><br>
		Categoria: <input type="text" name="categoria"> <br><br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>