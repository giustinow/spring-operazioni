<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1>Benvenuto!</h1>
<form action="scelta" method="post">
<label>Scegli l'operazione:</label>
<select name="operazione">
<option value="+">Addizione</option>
<option value="-">Sottrazione</option>
<option value="*">Moltiplicazione</option>
<option value="/">Divisione</option>
</select>
<input type="submit" value="Invia">
</form>
</body>
</html>