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
	        <div class="ccapacitacion">
	            <section id="formulario" class="row">
	                <div class="col">
	                    <div class="row">
	                        <h2 class="titulo-pagina-h2">Formulario Crear Capacitación</h2>
	                    </div>
	                </div>
	                <div class="row">
	                    <div clas="col">
	                        <form>
	                            <div class="lineaFormulario">
	                                <label for="rutCliente">Rut Cliente:</label>
	                                <input name="rutCliente" id="rutCliente" type="text" class="form-control" placeholder="Ej: 12345678">
	                            </div>
	                            <div class="formulario">
	                                <label for="diaCapacitacion">Día:</label>
	                                <input name="diaCapacitacion" id="diaCapacitacion" type="text" class="form-control" placeholder="Ej: lunes, martes, etc.">
	                            </div>
	                            <div class="formulario">
	                                <label for="horaCapacitacion">Hora:</label>
	                                <input name="horaCapacitacion" id="horaCapacitacion" class="form-control" placeholder="Formato hh:mm"></input>
	                            </div>
	                           <div class="formulario">
	                                <label for="lugarCapacitacion">Lugar:</label>
	                                <input name="lugarCapacitacion" id="lugarCapacitacion" class="form-control" placeholder="Ej: Comuna Valparaiso"></input>
	                            </div>
	                           <div class="formulario">
	                                <label for="duracionCapacitacion">Duración:</label>
	                                <input name="duracionCapacitacion" id="duracionCapacitacion" class="form-control" placeholder="Ej: 60 minutos"></input>
	                            </div>
	                           <div class="formulario">
	                                <label for="cantidadAsistentes">Cantidad de Asistentes:</label>
	                                <input name="cantidadAsistentes" id="cantidadAsistentes" class="form-control" placeholder=" N° de asistentes"></input>
	                            </div>
	                            <Br>
	                            <button type="button" class="col btn btn-primary" onclick="javascript:enviarFormulario()">Enviar</button> 
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