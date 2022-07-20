	<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
<%@ include file="head.jsp" %>
	<body>
	<div class="container">
		<header>
		<%@ include file="nav.jsp" %>
		</header>
		<br>
	        <main>
	        <div class="contacto">
	            <section id="formulario" class="row">
	                <div class="col">
	                    <div class="row titulo-pagina-h2">
	                        <h2>Formulario Contacto</h2>
	                    </div>
	                </div>
	                <div class="row">
	                    <div clas="col">
	                        <form action="${pageContext.request.contextPath}/ContactoServlet" method="post">
	                            <div class="lineaFormulario">
	                                <label for="nombre">Nombre:</label>
	                                <input name="nombre" id="nombre" type="text" class="form-control">
	                            </div>
	                            <div class="formulario">
	                                <label for="email" class="form-label">Correo:</label>
	                                <input name="email" id="email" type="email" class="form-control" id="exampleFormControlInput1"
	                                    placeholder="nombre@ejemplo.com">
	                            </div>
	                            <div class="mb-3">
	                                <label for="mensaje" class="form-label">Mensaje:</label>
	                                <textarea name="mensaje" id="mensaje" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
	                            </div>
	                            <button type="submit" class="col btn btn-primary">Enviar</button> 
	                            <button class="btn btn-secondary" type="reset">Borrar</button>
	                        </form>
	                    </div>
	                </div>
	                <script>
	
	
	                </script>
	            </section>
	            </div>
	        </main>	
	
	</div>
	<!-- JavaScript Bundle with Popper -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
			crossorigin="anonymous"></script>
	</body>
	<br>
	        <footer>
	            <p class="text-muted text-center">Empresa de Asesorías en Prevención de Riesgos | 2022</p>
	        </footer>
	</html>