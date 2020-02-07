<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList,com.shubham.ats.dto.userDTO,com.shubham.ats.dto.rightsDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
        
        /* .hide{
        	display: none;
        } */
      }
    </style>
   <!--  <script>
    function addseller(){
    	document.getElementById("addseller").classList.toggle('hide');
    }
    function addrole(){
    	document.getElementById("addrole").classList.toggle('hide');
    }
    function showtask(){
    	document.getElementById("showtask").classList.toggle('hide');
    }
    function task(){
    	document.getElementById("task").classList.toggle('hide');
    }
    function showrole(){
    	document.getElementById("showrole").classList.toggle('hide');
    }
    </script> -->
    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("sessionuserid")==null){
	response.sendRedirect("index.jsp");	
}%>

  <%@include file="header.jsp" %>

<div class="container-fluid">
  <div class="row">
    <nav class="col-md-2 d-none d-md-block bg-light sidebar">
      <div class="sidebar-fixed">
        <ul class="nav flex-column">
        <%ArrayList<rightsDTO> userlinklist = (ArrayList<rightsDTO>)request.getAttribute("userdata");
	if(userlinklist!=null){
		for(rightsDTO obj : userlinklist){
			%>
          <li class="nav-item">
            <a class="nav-link active" href="<%=obj.getScreenname() %>" onclick="<%=obj.getScreenname() %>()">
         	<%=obj.getRightname() %></a>
          </li>
          <%}
			}%>
        </ul>
      </div>
    </nav>

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Dashboard</h1>
      </div>
   <%--    <%@ include file="showrole.jsp" %> --%>
<%--       <div class="hide" id="showtask">
      	<%@include file="showtask.jsp" %>
      </div>
	<div class="hide" id="addseller">
		<%@ include file="addseller.jsp" %>
	</div>
	<div class="hide" id="addrole">
		<%@ include file="addrole.jsp" %>
	</div>
	<div class="hide" id="showrole">
		<%@ include file="showrole.jsp" %>
	</div>
	<div class="hide" id="task">
		<%@ include file="task.jsp" %>
	</div> --%>
    </main>
  </div>
</div>
	<%@include file="footer.jsp" %>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="/docs/4.3/assets/js/vendor/jquery-slim.min.js"><\/script>')</script><script src="/docs/4.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.min.js"></script>
        <script src="dashboard.js"></script>
</body>
</html>