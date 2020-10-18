<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix = "x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simulación 1 - Alvaro Alvarez</title>
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Anton">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Cookie">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="resources/css/Footer-with-social-media-icons.css">
    <link rel="stylesheet" href="resources/css/KD_Header.css">
    <link rel="stylesheet" href="resources/css/KD_Header-1.css">
    <link rel="stylesheet" href="resources/css/KD_Header-2.css">
    <link rel="stylesheet" href="resources/css/Lista-Productos-Canito.css">
    <link rel="stylesheet" href="resources/css/Responsive-Form-1.css">
    <link rel="stylesheet" href="resources/css/Responsive-Form.css">
    <link rel="stylesheet" href="resources/css/Single-Page-Contact-Us-Form.css">
    <link rel="stylesheet" href="resources/css/styles.css">
</head>
<body>
    <nav class="navbar navbar-light navbar-expand-md custom-header">
        <div class="container-fluid">
            <div><a class="navbar-brand" href="#"><img class="rounded-circle img-fluid" style="width: 43px;margin: -26px;margin-right: -27px;margin-top: -44px;margin-left: -33px;margin-bottom: -31px;" src="resources/img/KD-White.png" width="auto" height="auto"><span class="text-center" style="margin: 10px 0px 0px 15px;margin-left: 17px;font-family: Anton, sans-serif;color: rgb(253,250,254);font-size: 36px;padding: 0px;margin-right: 0px;margin-bottom: 0px;margin-top: 0px;min-width: 0px;max-width: 0px;height: 0px;text-align: left;">&nbsp; &nbsp;Alvaro Alvarez</span>  </a>
                <button
                    class="navbar-toggler" data-toggle="collapse"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            </div>
        </div>
    </nav>
    <div style="margin: 30px;padding: 10px;">
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <h1 class="d-md-flex justify-content-md-center" style="width: 343px;font-family: Anton, sans-serif;">Listado Ayudas</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12"><table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>Ciudad</th>
                <th>Motivo</th>
                <th>Monto</th>
            </tr>
        </thead>
        <tbody>
           <c:forEach items="${JListAyudas}" var="ayus">
				<tr>
					<td><c:out value="${ayus.getBeneficiarios().getCiudades().getNombreciudad()}"/></td>
					<td><c:out value="${ayus.getMotivo()}"/></td>
					<td><c:out value="${ayus.getMonto()}"/></td>	
				</tr>
			</c:forEach> 
        </tbody>
    </table></div>
            </div>
        </div>
    </div>
    <div class="container">
        <div>
            <form:form method="POST" modelAttribute="ayuda" action="agregaAyuda">
                <div class="form-group">
                            <h2 class="text-center" style="font-family: Anton, sans-serif;margin-top: 16px;">Agregar Ayuda</h2>
                        </div>
                <div class="form-group">
                    <div id="formdiv">
                        <div class="form-row" style="margin-right:0px;margin-left:0px;padding-top:24px;">
                            <div class="col-md-8 offset-md-1">
                                <p style="margin-left:2%;font-family:Roboto, sans-serif;font-size:24px;"><strong>Beneficiario</strong></p>
                            </div>
                            <div class="col-md-10 offset-md-1">
                                <form:select path="beneficiarios.beneficiarioid" class="form-control" style="margin-left:0px;font-family:Roboto, sans-serif;" required="required">
                                            <form:option value="${JListBeneficiarios}" label="---Seleccionar---"/>
                                            <form:options items="${JListBeneficiarios}" itemLabel="nombre" itemValue="beneficiarioid"/>
                                </form:select>
                            </div>
                        </div>
                        <div class="form-row" style="margin-right:0px;margin-left:0px;padding-top:24px;margin-top:-16px;">
                            <div class="col-md-8 offset-md-1">
                                <p style="margin-left:2%;font-family:Roboto, sans-serif;font-size:24px;"><strong>Motivo</strong></p>
                            </div>
                            <div class="col-md-10 offset-md-1"><form:input path="motivo" class="form-control" type="text" style="font-family:Roboto, sans-serif;" name="motivo" required="required"/></div>
                        </div>
                        <div class="form-row" style="margin-right:0px;margin-left:0px;padding-top:24px;">
                            <div class="col-md-8 offset-md-1">
                                <p style="margin-left:2%;font-family:Roboto, sans-serif;font-size:24px;"><strong>Monto</strong></p>
                            </div>
                            <div class="col-md-10 offset-md-1"><form:input path="monto" class="form-control" type="number" style="font-family:Roboto, sans-serif;" name="monto" required="required"/></div>
                        </div>
                        <div class="form-row" style="margin-right:0px;margin-left:0px;padding-top:24px;">
                            <div class="col-12 col-md-4 offset-md-4 d-md-flex align-items-md-center"><button class="btn btn-light btn-lg" style="margin-left: 16px;align-items: center; border: 2px solid skyblue" type="submit">Agregar </button></div>
                        </div>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
    <div></div>
    <footer id="footerpad" style="margin: 0px;margin-top: 13px;color: #798fa5;opacity: 0.77;filter: blur(0px) brightness(92%) grayscale(0%) saturate(99%);border-color: #e9ac09;">
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-lg-8 mx-auto">
                    <ul class="list-inline text-center">
                        <li class="list-inline-item"><a href="#"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x"></i><i class="fa fa-facebook fa-stack-1x fa-inverse"></i></span></a></li>
                        <li class="list-inline-item"><a href="#"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x"></i><i class="fa fa-twitter fa-stack-1x fa-inverse"></i></span></a></li>
                        <li class="list-inline-item"><a href="#"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x"></i><i class="fa fa-instagram fa-stack-1x fa-inverse"></i></span></a></li>
                        <li class="list-inline-item"><a href="#"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x"></i><i class="fa fa-pinterest fa-stack-1x fa-inverse"></i></span></a></li>
                    </ul><p class="copyright text-muted text-center">Copyright &copy; Alvaro Alvarez 2020 | Web Design by Designer</p></div>
            </div>
        </div>
    </footer>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
</body>

</html>