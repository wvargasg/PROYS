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
  <link rel="stylesheet" href="static/DataTables-1.10.12/dataTables.bootstrap.min.css">
  <link rel="static/jquery//bootstrap.min.css">

  <script src="static/jquery/jquery-3.1.0.min.js"></script>
  <script src="static/jquery/jquery.dataTables.min.js"></script>
  <script src="static/jquery/dataTables.bootstrap.js"></script>
  <script src="static/jquery.bootgrid-1.3.1/jquery.bootgrid.min.js"></script>
  <script src="static/DataTables-1.10.12/dataTables.bootstrap.min.js"></script>
</head>
<body>
<div class="container ">
<br>
   <div id="toolbar" class="btn-group ">
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
        <i class="glyphicon glyphicon-plus"></i> Crear Giro de Negocio
    </button>
   </div>

<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>ID</th>
                <th>Descripcion</th>
                <th>Estado</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
               <th>ID</th>
                <th>Descripcion</th>
                <th>Estado</th>
            </tr>
        </tfoot>
        <tbody>
            <tr>
                <td>1</td>
                <td>Energia</td>
                <td>Activo</td>
            </tr>
            <tr>
                <td>2</td>
                <td>Hidrocarburos</td>
                <td>Activo</td>
            </tr>
            <tr>
                <td>3</td>
                <td>Mineria</td>
                <td>Activo</td>
            </tr>        
         </tbody>
    </table>
</form>
</div>
<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Datos Giro de Negocio
        </div>
        <div class="panel panel-default">
		  <div class="panel-heading">
		   <form class="form-inline" role="form">
			  <div class="form-group col-sm-10" >
			    <label for="ruc">Descripcion:</label>
			    <input type="ruc" class="form-control" id="ruc" autofocus>
			  </div>
			  <div class="form-group col-sm-5">
			    <label for="nombre">Estado:</label>
		         <select id="disabledSelect" class="form-control">
		          <option>Activo</option>
		          <option>Inactivo</option>
		        </select>
			  </div>
			</form>
		 </div>
		 <div class="panel-heading">
			 <form class="form-inline" role="form">
			    <button type="button" class="btn btn-primary" data-dismiss="modal">Grabar</button>
			 </form>
		 </div>
		</div>
       </div>
    </div>
  </div>
<br>
<script>
$(document).ready(function() {
    $('#example').DataTable({
  	  "language": {
  	    "url": "static/DataTables-1.10.12/Spanish.json"
  	  }
  	});
} );
 </script>
</html>