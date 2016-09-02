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
        <i class="glyphicon glyphicon-plus"></i> Crear Contacto
    </button>
   </div>

<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>Id</th>
                <th>Ape_Paterno</th>
                <th>Ape_Materno</th>
                <th>Nombres</th>
                <th>Direccion</th>
                <th>Telefono</th>
                <th>Genero</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>Id</th>
                <th>Ape_Paterno</th>
                <th>Ape_Materno</th>
                <th>Nombres</th>
                <th>Direccion</th>
                <th>Telefono</th>
                <th>Genero</th>
            </tr>
        </tfoot>
        <tbody>
            <tr>
                <td>Tiger Nixon</td>
                <td>System Architect</td>
                <td>Edinburgh</td>
                <td>61</td>
                <td>2011/04/25</td>
                <td>$320,800</td>
                <td>2011/04/25</td>
            </tr>
            <tr>
                <td>Garrett Winters</td>
                <td>Accountant</td>
                <td>Tokyo</td>
                <td>63</td>
                <td>2011/07/25</td>
                <td>$170,750</td>
                 <td>2011/07/25</td>
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
          <h4 class="modal-title">Datos Del Contacto
        </div>
        <div class="panel panel-default">
		  <div class="panel-heading">
		   <form class="form-inline" role="form">
			  <div class="form-group">
			    <label for="ruc">Ape_Paterno:</label>
			    <input type="ruc" class="form-control" id="ape_pat" autofocus>
			  </div>
			  <div class="form-group">
			    <label for="nombre">Ape_Materno:</label>
			    <input type="nombre" class="form-control" id="ape_mat">
			  </div>
			  <div class="form-group">
			    <label for="nombre">Nombres:</label>
			    <input type="nombre" class="form-control" id="nombre">
			  </div>
			</form>
		 </div>
		 <div class="panel-heading">
		   <form class="form-inline" role="form">
			  <div class="form-group">
			    <label for="ruc">Dirección:</label>
			    <input type="ruc" class="form-control" id="dir">
			  </div>
			  <div class="form-group">
			    <label for="nombre">Telefono:</label>
			    <input type="nombre" class="form-control" id="tel">
			  </div>
			  <div class="form-group">
			    <label for="geenero">Genero:</label>
		         <select id="genSelect" class="form-control">
		          <option>Masculino</option>
		          <option>Femenino</option>
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