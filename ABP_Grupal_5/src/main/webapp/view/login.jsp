<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="head.jsp" %>

<body>
<div class="container-fluid">
	<header>
	<%@ include file="navSinLogin.jsp" %>
	
	</header>
<section class="vh-100" style="background-color: #17706E;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-xl-10">
        <div class="card" style="border-radius: 1rem;">
          <div class="row g-0">
            <div class="col-md-6 col-lg-5 d-none d-md-block">
              <!--<img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img1.webp"
                alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />-->
                <img src="https://nelsonmedel.cl/fullStackJava/prevensionista.jpg"
                alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
            </div>
            <div class="col-md-6 col-lg-7 d-flex align-items-center">
              <div class="card-body p-4 p-lg-5 text-black">

                <form action="${pageContext.request.contextPath}/login" method="post" class="needs-validation">

                  <div class="d-flex align-items-center mb-3 pb-1">
                    <i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i>
                    <span class="h1 fw-bold mb-0">Bienvenido</span>
                  </div>

                  <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Acceso a la Plataforma</h5>

                  <div class="form-outline mb-4">
                    <input type="text" id="userName" name="userName" class="form-control form-control-lg" required>
                    <div class="valid-feedback">
				      Validado correctamente
				    </div>
                    <label class="form-label" for="userName" >Nombre Usuario</label>
                  </div>

                  <div class="form-outline mb-4">
                    <input type="password" id="clave" name="clave" class="form-control form-control-lg" required>
                    <label class="form-label" for="clave">Contraseña</label>
                  </div>

                  <div class="pt-1 mb-4">
                    <button class="btn btn-dark btn-lg btn-block" type="submit">Iniciar Sesión</button>
                  </div>

                  <!-- <a class="small text-muted" href="#!">¿Olvidó su contraseña?</a>-->
                  <!-- 
                  <p class="mb-5 pb-lg-2" style="color: #393f81;">Registrate <a href="#!"
                      style="color: #393f81;">aquí</a></p>
                  <a href="#!" class="small text-muted">Terms of use.</a>
                  <a href="#!" class="small text-muted">Privacy policy</a>
                   -->
                </form>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

</div>
<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
	
	<script src="https://nelsonmedel.cl/fullStackJava/funcionMenu.js"></script>

</body>

<br>
        <footer>
            <p class="text-muted text-center">Empresa de Asesorías en Prevención de Riesgos | 2022</p>
        </footer>

</html>