<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList,com.shubham.ats.dto.userDTO,com.shubham.ats.dto.rightsDTO,com.shubham.ats.dto.userDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel ="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <!-- Custom styles for this template -->
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
      
      .overflowdiv{
      overflow:auto;
      
      }
    </style>
</head>
<body>
<% if(session.getAttribute("sessionuserid")==null){
	response.sendRedirect("login.jsp");	
}%>

  <%@include file="header.jsp" %>

<div class="container-fluid">
  <div class="row">
    <nav class="col-md-2 d-none d-md-block bg-light sidebar">
      <div class="sidebar-sticky">
        <ul class="nav flex-column">
        <%ArrayList<rightsDTO> linklist = (ArrayList<rightsDTO>)request.getAttribute("userdata");
	if(linklist!=null){
		for(rightsDTO obj : linklist){
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
        <h1 class="h2">Existing Colleges</h1>
      </div>
<div class='w-100 float-right pr-2'>
	<h1 class='text-center btn btn-outline-success w-100 display-1'>Show colleges</h1>
	<table class='table table-bordered'>
			<thead class='thead-dark'>
				<tr>
					<th>User ID</th>
					<th>Email</th>
					<th>Contact</th>
				</tr>
			</thead>
			<tbody>
				<%
				ArrayList<userDTO> userlist = (ArrayList<userDTO>)request.getAttribute("usersdata");
				
					if(userlist!=null){
						for(userDTO obj : userlist){
							/* if(rolerightlist.iterator().next().getRolename()==obj.getRolename()){ */
								%>
								<tr>
								<td><%=obj.getUserid() %></td>
								<td><%=obj.getEmail() %></td>
								<td><%=obj.getContact() %></td>
								</tr>
								<% 
							}
						}
					else if(userlist==null){
						%>
						<tr>
						<td></td>
						<td class='text-center'><h2>List is Empty</h2></td>
						<td></td>
						</tr>
						<%
					}
				%>
			</tbody>
		</table>
</div>
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
<!-- </body>
</html> -->