<div class="container-fluid">
<nav class="navbar navbar-expand-lg">
	
		<a class="navbar-brand" href="${pageContext.request.contextPath}/contacto"><i class="fas fa-cubes fa-1x me-3" style="color: #fff;"></i></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon" style="color:#fff"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					aria-current="page" href="${pageContext.request.contextPath}/contacto">Inicio</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/contacto">Contacto</a>
				</li>
				
				<li class="nav-item dropdown">
		          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
		            Usuarios
		          </a>
		          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
		            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ListarUsuarios?opcion=crear">Crear usuario</a></li>
		            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ListarUsuarios?opcion=lista">Ver usuarios</a></li>
		            
		          </ul>
		        </li>
				
				<li class="nav-item dropdown">
		          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
		            Capacitaciones
		          </a>
		          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
		            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ccapacitacion">CrearCapacitación</a></li>
		            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/ListarCapacitaciones">Ver Capacitaciones</a></li>
		            
		          </ul>
		        </li>
				<li class="nav-item"><a class="nav-link" 
					href="${pageContext.request.contextPath}/cerrarSesion">Cerrar sesión</a></li>
			</ul>
		</div>
	</nav>
</div>
