<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" href="resources/css/tarefas.css" rel="stylesheet" />
<title>ADICIONAR TAREFA</title>
</head>
<body>
	<h2>Adicionar tarefa</h2><hr/>
	
	<form:errors path="tarefa.descricao" style="color: red;"></form:errors>
	<form action="adicionaTarefa" method="post">
		<p><label>Descrição:</label></p>
		<p><textarea rows="5" cols="100" name="descricao"></textarea></p>
		<p><input type="submit" value="Adicionar"></p>
	</form>

</body>
</html>