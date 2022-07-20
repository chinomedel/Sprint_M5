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
			<h2 class="titulo-pagina-h2">Listado de Capacitaciones</h2>
			<br>
			<main>
				<table class="table" id="capacitacion">
				  <thead class="">
				    <tr>
				      <th>#</th>
				      <th>First</th>
				      <th>Last</th>
				      <th>Handle</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th>1</th>
				      <td>Mark</td>
				      <td>Otto</td>
				      <td>@mdo</td>
				    </tr>
				    <tr>
				      <th>2</th>
				      <td>Jacob</td>
				      <td>Thornton</td>
				      <td>@fat</td>
				    </tr>
				    <tr>
				      <th>3</th>
				      <td>Larry the Bird</td>
				      <td>Medel</td>
				      <td>@twitter</td>
				    </tr>
				    
				    
				  </tbody>
				</table>
			</main>
			
		</section>
	        
	
	</div>
	<!-- Jquery, datTable css, dataTable js -->
	<script	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
	<link href="//cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css"
		rel="stylesheet" />
	
	<script src="//cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
	
	<script>
		$(document).ready( function () {
		    $('#capacitacion').DataTable();
		} );
	</script>
	<!-- JavaScript Bundle with Popper -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
			crossorigin="anonymous"></script>
			
	
</body>
</html>