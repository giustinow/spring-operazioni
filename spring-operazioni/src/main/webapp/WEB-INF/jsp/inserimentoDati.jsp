<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inserimento Dati</title>
</head>
<body>
<form action="calcolo" method="post">
<input type="number" name="primo">
${operazione}
<input type="hidden" name="operazione" value="${operazione}">
<input type="number" name="secondo">
<input type="submit" value="Risultato">
</form>
</body>
</html>