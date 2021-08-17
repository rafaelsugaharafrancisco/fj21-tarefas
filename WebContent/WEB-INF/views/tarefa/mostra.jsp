<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/jquery.css" rel="stylesheet">
<script type="text/javascript" src="resources/js/jquery.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui.js"></script>
<title>MOSTRAR</title>
</head>
<body>
	<h3>Alterar tarefa - ${tarefa.id}</h3>
	<form action="alteraTarefa" method="post">
		<input type="hidden" name="id" value="${tarefa.id}" />
		Descrição:<br />
		<textarea name="descricao" cols="100" rows="5">${tarefa.descricao}</textarea>
		<br />
		Finalizado? <input type="checkbox" name="finalizado" value="true" ${tarefa.finalizado? 'checked' : '' }/> <br />
		Data de finalização: <br /><input type="text" id="dataFinalizacao" name="dataFinalizacao" value="<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" />"/>
		<br />
		<input type="submit" value="Alterar"/>
	</form>
	<script type="text/javascript">
		$("#dataFinalizacao").datepicker({dateFormat: 'dd/mm/yy'});
	</script>
</body>
</html>