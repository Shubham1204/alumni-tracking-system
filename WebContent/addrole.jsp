<%@page import="java.util.ArrayList,com.shubham.ats.dto.userDTO,com.shubham.ats.dto.rightsDTO,com.shubham.ats.dto.roleDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ATS</title>
<link href="css/bootstrap.min.css" rel ="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
 <link href="css/dashboard.css" rel="stylesheet">

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
      
      .mainbody{
       position: fixed;
    overflow: auto;
  }
    </style>
</head>
<body>
<% if(session.getAttribute("sessionuserid")==null){
	response.sendRedirect("index.jsp");	
}%>

  <%@include file="header.jsp" %>

<div class="container-fluid mainbody">
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

    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4 overflow-auto mb-5">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Add Role</h1>
      </div>
<form action="addrole" method="post">
<div class='w-100 float-right pr-2'>
	<h2 class='text-center btn btn-outline-success w-100 display-1'>Add New Role</h2>
		<div class='form-group'>
			<label>Role Name</label>
			<input class='form-control' type='text' name='rolename' placeholder='Enter the Role name'>
		</div>
		<div class='form-group'>
			<label>Decription</label>
			<input class='form-control' type='text' name='desc' placeholder='Enter the Description'>
		</div>
			<h2 class='text-center btn btn-outline-info display-1 w-100'>Rights</h2>
			<div class="rights">
			
			
			<% ArrayList<rightsDTO> rightlist = (ArrayList<rightsDTO>)request.getAttribute("rights");
				
				if(rightlist!=null){
					for(rightsDTO obj : rightlist){
						%>
						<input type="checkbox" name="right" value="<%=obj.getRightname() %>" ><%=obj.getRightname() %>
						<%
						}
				}
			%>
				<!-- <div class="form-check form-check-inline">
			    	<input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
  					<label class="form-check-label" for="inlineCheckbox1">R1</label>
				</div>
				<div class="form-check form-check-inline">
  					<input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
  					<label class="form-check-label" for="inlineCheckbox2">R2</label>
				</div> -->
		</div>
	<div class='form-group'>
			<button type="submit" name="addrole" value="addrole" class='btn btn-primary'>ADD Role</button>
		</div>
</div>
</form>


</div>
 </main>
  </div>
	<%@include file="footer.jsp" %>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="/docs/4.3/assets/js/vendor/jquery-slim.min.js"><\/script>')</script><script src="/docs/4.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.min.js"></script>
        <script src="dashboard.js"></script>
</body>
</html>