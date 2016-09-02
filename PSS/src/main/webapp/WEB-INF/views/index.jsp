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
  .modal-header, h4, .close {
      background-color: #337AB7;
      color:white !important;
      text-align: center;
      font-size: 25px;
  }
  .modal-footer {
      background-color: #f9f9f9;
  }
 .btn-circle {
    width: 30px;
    height: 30px;
    text-align: center;
    padding: 6px 0;
    font-size: 12px;
    line-height: 3;
    border-radius: 15px;
  }
  .btn-circle.btn-lg {
    width: 50px;
    height: 50px;
    padding: 10px 16px;
    font-size: 18px;
    line-height: 1.33;
    border-radius: 25px;
  }
  .btn-circle.btn-xl {
    width: 120px;
    height: 120px;
    padding: 10px 16px;
    font-size: 24px;
    line-height: 1.33;
    border-radius: 80px;
  }
  </style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      
      <a class="navbar-brand" href="#"></a>
    </div>
    
  </div>
</nav>
 
<div class="container text-center" class="container ">
<br>
<form class="form-horizontal" role="form" action="<c:url value='/sitio' />" method="post">
  <div class="container">
  <img src="static/img/pss.jpg" alt="Image"><br><br><br><br>
  <!-- Trigger the modal with a button -->
  <!--button type="button" class="btn btn-default btn-lg" id="myBtn">Ingresar</button-->
  <button type="button" class="btn btn-default btn-circle btn-xl" id="myBtn">Ingresar</button>
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog ">
    
      <!-- Modal content-->
      <div class="modal-content" >
        <div class="modal-header  " style="padding:35px 50px;">
          <button type="button " class="close " data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock "></span> Inicio de Sesión</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form">
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span> Usuario</label>
              <input type="text" class="form-control" id="usrname" placeholder="Enter usuario">
            </div>
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Contraseña</label>
              <input type="password" class="form-control" id="psw" placeholder="Enter contraseña">
            </div>
            <div class="checkbox">
              <label><input type="checkbox" value="" checked>Recordar</label>
            </div>
              <button type="submit" class="btn btn-primary btn-block"><span class="glyphicon glyphicon-off"></span> Iniciar sesión</button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-default btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancelar</button>
          <p>No esta registrado? <a href="#">Regístrate</a></p>
          <p>Olvidó la <a href="#">Contraseña?</a></p>
        </div>
      </div>
     </div>
  </div>
</div>
</form>
</div><br>

<footer class="container-fluid text-center">
   <p></p>
</footer>
<script>
  $(document).ready(function(){
    $("#myBtn").click(function(){
        $("#myModal").modal('show');
    });
});
</script>
</html>