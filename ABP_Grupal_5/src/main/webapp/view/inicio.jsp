<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="head.jsp" %>

<body>
<div class="container-fluid">
	<header>
		<div class="logo">
			<h1>
				<a href="#">
					<i class="fas fa-cubes fa-1x me-3" style="color: #ff6219;"></i>
					<!-- <img class="logo-movil" src="img/Logo-Estudio-Romy-3.png" alt="">-->
				</a>
			</h1>
		</div>
		<%@ include file="navSinLogin.jsp" %>
	</header>
	<section class="carrusel">
		<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="true">
		  <div class="carousel-indicators">
		    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
		    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
		    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
		  </div>
		  <div class="carousel-inner">
		    <div class="carousel-item active">
		      <img src="https://hablemosdeempresas.com/wp-content/uploads/sites/2/2020/05/cursos-riesgos-laborales-min-1100x733.jpeg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="https://at3w.com/wp-content/uploads/2022/04/seguridad-trabajo_Portada_750x461_ES.jpg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="https://nelsonmedel.cl/fullStackJava/prevensionista.jpg" class="d-block w-100" alt="...">
		    </div>
		  </div>
		  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
		    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Previous</span>
		  </button>
		  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
		    <span class="carousel-control-next-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Next</span>
		  </button>
		</div>
	</section>
	<section class="seccion-inicio">
		<h2>Bienvenido al sistema de información de <br>Prevensión de riesgos</h2>
		<h3>Inicia sesión para acceder a las funcionalidades.</h3>
		<a href="${pageContext.request.contextPath}/login" class="btn btn-primary customPrimary">Iniciar Sesión</a>
	</section>
	
	<section class="seccion-noticias" id="seccion-noticia">
		<h2 style="text-align:center;">Sección Noticias</h2>
		<br>
		<div class="row">
			<div class="col-12 col-md-6">
				<h3>Título Noticia</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras dignissim mauris tortor, 
				non imperdiet quam interdum tincidunt. Suspendisse nec tellus turpis. Vivamus mauris sem, 
				laoreet sed gravida sed, elementum vitae arcu. Etiam sapien lorem, rhoncus in gravida in, 
				finibus mattis purus. Curabitur lacinia elementum tortor in tristique. Cras id libero pretium, 
				mollis arcu nec, fermentum ante. Pellentesque elementum in massa eget luctus. 
				Donec vulputate urna at odio ultrices, in imperdiet sapien hendrerit. Mauris mattis felis nec porta tempor. 
				Maecenas et fermentum diam. Sed ullamcorper at ipsum a porta.</p>
				<p>Cras ante turpis, tincidunt quis lacus ut, euismod posuere sem. In laoreet orci eget est feugiat, 
				eu semper augue facilisis. Aliquam feugiat rutrum sem nec pharetra. Quisque aliquet dui sapien,
				 in elementum massa mollis id. Fusce id dignissim arcu. Sed sagittis sollicitudin mollis. 
				 Curabitur egestas orci ut aliquet convallis. Sed volutpat, turpis quis congue varius, urna augue 
				 eleifend libero, id aliquet sem tortor in lectus.
				</p>

			</div>
			<div class="col-12 col-md-6">
				<div class="cont-img-noticia"><img src="https://hablemosdeempresas.com/wp-content/uploads/sites/2/2020/05/cursos-riesgos-laborales-min-1100x733.jpeg" alt=""></div>
			</div>
		</div>	
	</section>
	<!-- 
	<section>
	
		<div class="table-responsive contenedor-tabla-inicio">
			<h1>Tabla de usuario</h1>
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
						<td>
						
						<c:if test="${usuario.getTipoUsuario() == 1}">
							<c:out value="Cliente"></c:out>
						</c:if>
						<c:if test="${usuario.getTipoUsuario() == 2}">
							<c:out value="Administrativo"></c:out>
						</c:if>
						<c:if test="${usuario.getTipoUsuario() == 3}">
							<c:out value="Profesional"></c:out>
						</c:if>
						
						</td>
						<td><c:out value="${usuario.getEstado()}"></c:out></td>
				    </tr>
			  	</c:forEach>
			    
			  </tbody>
			 </table>
		
		</div>
	</section>
	-->
	
</div>
 <footer>
    <p class="text-muted text-center">Empresa de Asesorías en Prevención de Riesgos | 2022</p>
 </footer>



<script	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
	<link href="//cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css"
		rel="stylesheet" />
	
	<script src="//cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
		
	<script src="https://nelsonmedel.cl/fullStackJava/formatoTablas.js"></script>
	<script src="https://nelsonmedel.cl/fullStackJava/funcionMenu.js"></script>

	

<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
		

</body>

<br>
        

</html>