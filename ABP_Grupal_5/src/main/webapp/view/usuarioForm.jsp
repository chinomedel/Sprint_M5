<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="head.jsp" %>
<body onload="mostrar()">
	<div class="container">
		<header>
		<%@ include file="nav.jsp" %>
		</header>
		<br>
		
		
		<section>
		<c:if test="${opcion == 'editar'}">
			<h2 class="titulo-pagina-h2">Editar Usuario</h2>
		</c:if>
		<c:if test="${opcion == 'crear'}">
			<h2 class="titulo-pagina-h2">Crear Usuario</h2>
		</c:if>
		<br>
			<div class="contendor-form-usuario">
				<form class="row g-3" action="${pageContext.request.contextPath}/ListarUsuarios?opcion=${opcion}" method="post">
				  <div class="col-12 col-md-4">
				    <label for="userName" class="form-label">Nombre de Usuario</label>
				    <input type="text" class="form-control" id="userName" name="userName" value="${usuario.getUserName()}" required>
				  </div>
				  <div class="col-12 col-md-4">
				    <label for="clave" class="form-label">Clave</label>
				    <input type="password" class="form-control" id="clave" name="clave" value="${usuario.getClave()}" required>
				  </div>
				  <div class="col-12 col-md-4">
				    <label for="run" class="form-label">Run</label>
				    <input type="number" class="form-control" id="run" name="run" placeholder="Ej: 11666777" value="${usuario.getRun()}" required>
				  </div>
				  <div class="col-12 col-md-4">
				    <label for="fechaNacimiento" class="form-label">Fecha de nacimiento</label>
				    <input type="date" class="form-control" id="fechaNacimiento" placeholder="" name="fechaNacimiento" value="${usuario.getFechaNacimiento()}">
				  </div>
				  <div class="col-12 col-md-4">
				    <label for="tipoUsuario" class="form-label">Tipo de Usuario</label>
				    <select onchange="mostrar()" class="form-select" name="tipoUsuario" id="tipoUsuario">
				    		<c:if test="${usuario.getTipoUsuario()== null}">
				    			<option selected="selected">Cliente</option>
				    			<option>Administrativo</option>
				    			<option>Profesional</option>
				    		</c:if>
				    		<c:if test="${usuario.getTipoUsuario()== 1}">
				    			<option selected="selected">Cliente</option>
				    			<option>Administrativo</option>
				    			<option>Profesional</option>
				    		</c:if>
				    		<c:if test="${usuario.getTipoUsuario()== 2}">
				    			<option>Cliente</option>
				    			<option selected="selected">Administrativo</option>
				    			<option>Profesional</option>
				    		</c:if>
				    		<c:if test="${usuario.getTipoUsuario()==3}">
				    			<option>Cliente</option>
				    			<option>Administrativo</option>
				    			<option selected="selected">Profesional</option>
				    		</c:if>
				    		
				    </select>	
				  </div>
				  <div class="col-12 col-md-4">
				    <label for="edadUsuario" class="form-label">Edad</label>
				    <input type="number" class="form-control" id="edadUsuario" name="edadUsuario" value="${usuario.getEdadUsuario()}">
				  <br>
				  </div>
				  

				  <div class="col-12 escondido" id="uno">
				  	<h5>Datos tipo usuario Cliente</h3>
				  	<div class="row">
					  <div class="col-12 col-md-4">
					    <label for="rutCliente" class="form-label">Rut Cliente</label>
					    <input type="number" class="form-control" id="rutCliente" name="rutCliente" value="${Cliente.getRutCliente()}">
					  </div>
					  <div class="col-12 col-md-4">
					    <label for="nombres" class="form-label">Nombres</label>
					    <input type="text" class="form-control" id="nombres" name="nombres" value="${Cliente.getNombres()}">
					  </div>
					  <div class="col-12 col-md-4">
					    <label for="apellidos" class="form-label">Apellidos</label>
					    <input type="text" class="form-control" id="apellidos" name="apellidos" value="${Cliente.getApellidos()}">
					  </div>
					  <div class="col-12 col-md-4">
					    <label for="telefono" class="form-label">Teléfono</label>
					    <input type="text" class="form-control" id="telefono" name="telefono" value="${Cliente.getTelefono()}">
					  </div>
					  <div class="col-12 col-md-4">
					    <label for="afp" class="form-label">AFP</label>
					    <input type="text" class="form-control" id="afp" name="afp" value="${Cliente.getAfp()}">
					  </div>
					  <div class="col-12 col-md-4">
					    <label for="sistemaSalud" class="form-label">Salud</label>
					    <input type="text" class="form-control" id="sistemaSalud" name="sistemaSalud" value="${Cliente.getSistemaSalud()}">
					  </div>
					  <div class="col-12 col-md-4">
					    <label for="direccion" class="form-label">Dirección</label>
					    <input type="text" class="form-control" id="direccion" name="direccion" value="${Cliente.getDireccion()}">
					  </div>
					  <div class="col-12 col-md-4">
					    <label for="comuna" class="form-label">Comuna</label>
					    <input type="text" class="form-control" id="comuna" name="comuna" value="${Cliente.getComuna()}">
					  </div>
					  </div>
				  </div>
				  <div class="col-12 col-md-12 escondido" id="dos">
				  <h5>Datos tipo usuario Administrativo</h3>
				  	<div class="row">
				  		<div class="col-12 col-md-4">
					  		<label for="area" class="form-label">Área</label>
						    <input type="text" class="form-control" id="area" name="area" value="${Administrativo.getArea()}">
				  		</div>
				  		<div class="col-12 col-md-4">
					  		<label for="experienciaPrevia" class="form-label">Experiencia previa</label>
						    <input type="text" class="form-control" id="experienciaPrevia" name="experienciaPrevia" value="${Administrativo.getExperienciaPrevia()}">
				  		</div>
				  	 	
					    
				  	</div>
				  </div>
				  <div class="col-12 col-md-12 escondido" id="tres">
				  <h5>Datos tipo usuario Profesional</h3>
				  	<div class="row">
					    <div class="col-12 col-md-4">
					  		<label for="titulo" class="form-label">Título</label>
						    <input type="text" class="form-control" id="titulo" name="titulo" value="${Profesional.getTitulo()}">
				  		</div>
				  		<div class="col-12 col-md-4">
					  		<label for="fechaDeIngreso" class="form-label">Fecha Ingreso</label>
						    <input type="date" class="form-control" id="fechaDeIngreso" name="fechaDeIngreso" value="${Profesional.getFechaDeIngreso()}">
				  		</div>
				  	</div>
				  </div>
				  
				  

				  <div class="col-12">
				    <button type="submit" class="btn btn-primary">Enviar</button>
				  </div>
				</form>
			</div>
		</section>
	
	
	</div>

<!-- JavaScript Bundle with Popper -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
			crossorigin="anonymous"></script>
			
		<script>
		function mostrar(){
			var idSelect = document.getElementById("tipoUsuario").value;
			if(idSelect == "Cliente"){
				document.getElementById("uno").style.display = "block";
				document.getElementById("dos").style.display = "none";
				document.getElementById("tres").style.display = "none";
			}else if(idSelect == "Administrativo"){
				document.getElementById("uno").style.display = "none";
				document.getElementById("dos").style.display = "Block";
				document.getElementById("tres").style.display = "none";
			}else if(idSelect == "Profesional"){
				document.getElementById("uno").style.display = "none";
				document.getElementById("dos").style.display = "none";
				document.getElementById("tres").style.display = "block";
			}

		}
	
		
		</script>
</body>
</html>