<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="head.jsp" %>
<body>
<div class="container">
		<header>
		<%@ include file="nav.jsp" %>
		</header>
		<br>
	<section>
		<h2 class="titulo-pagina-h2">Listado de Usuarios</h2>
		<br>
		<a href="${pageContext.request.contextPath}/ListarUsuarios?opcion=crear" class="btn btn-primary" style="margin-bottom:20px;">Crear usuario</a>
		<br>
		<div class="contenedor-tabla-usuarios table-responsive">
			<table class="table pulenta-tabla" id="">
				<thead>
				    <tr>
					    <th scope="col">Id</th>
					    <th scope="col">Nombre Usuario</th>
					    <th scope="col">Clave</th>
					    <th scope="col">Run</th>
					    <th scope="col">F Nacimiento</th>
					    <th scope="col">Edad</th>
					    <th scope="col">Tipo Usuario</th>
					    <th scope="col">Estado</th>
					    <th scope="col">Acciones</th>
				    </tr>
				  </thead>
				  <tbody>
				  	<c:forEach var="usuario" items="${usuarios}">
					  	<tr>
						    <td><c:out value="${usuario.getId_usuario()}"></c:out></td>
							<td><c:out value="${usuario.getUserName()}"></c:out></td>
							<td><c:out value="${usuario.getClave()}"></c:out></td>
							<td><c:out value="${usuario.getRun()}"></c:out></td>
							<td><c:out value="${usuario.getFechaNacimiento()}"></c:out></td>
							<td><c:out value="${usuario.getEdadUsuario()}"></c:out></td>
							<c:if test="${usuario.getTipoUsuario() == 1}">
								<td><c:out value="Cliente"></c:out></td>
							</c:if>
							<c:if test="${usuario.getTipoUsuario() == 2}">
								<td><c:out value="Administrativo"></c:out></td>
							</c:if>
							<c:if test="${usuario.getTipoUsuario() == 3}">
								<td><c:out value="Profesional"></c:out></td>
							</c:if>
							
							<td><c:out value="${usuario.getEstado()}"></c:out></td>
							<td><a
								href="${pageContext.request.contextPath}/ListarUsuarios?opcion=editar&id=${usuario.getUserName()}&tipoUsuario=${usuario.getTipoUsuario()}"><i
									class="fa-solid fa-pen-to-square"></i></a> | <a
								href="${pageContext.request.contextPath}/ListarUsuarios?opcion=del&id=${usuario.getUserName()}"><i
									class="fa-solid fa-trash"></i></a>
							</td>
					    </tr>
				  	</c:forEach>
				    
				  </tbody>
			</table>
		</div>
	
	</section>

</div>

<!-- Jquery, datTable css, dataTable js -->
	<script	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
	<link href="//cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css"
		rel="stylesheet" />
	
	<script src="//cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
	<script src="https://nelsonmedel.cl/fullStackJava/formatoTablas.js"></script>

	<!-- JavaScript Bundle with Popper -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
			crossorigin="anonymous"></script>
</body>
</html>