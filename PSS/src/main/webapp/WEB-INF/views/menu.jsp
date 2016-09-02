<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PSS</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="static/jquery/jquery-3.1.0.min.js"></script>
  <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
 <style>
    /* Remove the navbar's default margin-bottom and rounded borders */
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none;
    }
  }
  </style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <!-- a class="navbar-brand" href="#"><img src="static/img/titulo.jpg" alt="Image"></a-->
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class=""><a href="#"><span class="glyphicon glyphicon-home"></span> INICIO</a></li>
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-check"></span> MANTENEDORES
        <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Giro de Negocio</a></li>
            <li><a href="#">Tipo de Contacto</a></li>
            <li><a href="#">Tipo de Documento</a></li>
            <li><a href="#">Tipo de Moneda</a></li>
            <li><a href="#">Disponibilidad</a></li>
            <li><a href="#">Estado Civil</a></li>
            <li><a href="#">Ubigeo</a></li>
            <li><a href="#">Tipo de Teléfono</a></li>
            <li><a href="#">Estado Requerimiento</a></li>
            <li><a href="#">Prioridad</a></li>
            <li><a href="#">Estado Postulante</a></li>
            <li><a href="#">Grado Instruccion</a></li>
            <li><a href="#">Tipo COntratacion</a></li>
            <li><a href="#">Conocimiento</a></li>
            <li><a href="#">Competencia</a></li>
            <li><a href="#">Niveles</a></li>
          </ul>
        </li>
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-cog"></span> CONFIGURACION
        <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#" id="cfg-prf">Perfiles</a></li>
            <li><a href="#">Usuarios</a></li>
            <li><a href="#">Módulos</a></li>
            <li><a href="#">Páginas</a></li>
            <li><a href="#">Permisos</a></li>
          </ul>
        </li>
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-check"></span> RECLUTAMIENTO
        <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Postulantes</a></li>
            <li><a href="#">Empleados</a></li>
          </ul>
        </li>
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-list-alt"></span> COMERCIAL
        <span class="caret"></span></a>
          <ul class="dropdown-menu">
          	<li><a href="#" id="cte">Clientes</a></li>
            <li><a href="#">Servicio</a></li>
            <li><a href="#" id="cto">Contacto</a></li>
            <li><a href="#">Requerimiento</a></li>
          </ul>
        </li>
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-credit-card"></span> REPORTES
        <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Avanzado</a></li>
            <li><a href="#">Simple</a></li>
            
          </ul>
        </li>
        </ul>
      <ul class="nav navbar-nav navbar-right">
        <!--li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li-->
        <li><a href="<c:url value='/sitio' />"><span class="glyphicon glyphicon-log-in"></span> Salir</a></li>
      </ul>
    </div>
  </div>
</nav>  
<div class="container" id="central">

</div><br>

<footer class="container-fluid text-center">
  <p> <img src="static/img/pss.jpg" alt="Image"></p>
</footer>
<script type="text/javascript">
$(document).ready(function() {
    $('#cte').click(function(){
        $("#central").load('<c:url value='/Cliente' />');
    });
    $('#gn').click(function(){
        $("#central").load('<c:url value='/Giro' />');
    });
    $('#cto').click(function(){
    	$("#central").load('<c:url value='/Contacto' />');
    });
    $('#cfg-prf').click(function(){
    	$("#central").load('<c:url value='/Perfiles' />');
    });
});

</script>
</body>
</html>