
<style>
#whcolor{
	color:white;
}

</style>

  <nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-sm-3 col-md-2 mr-0 pr-4" href="#">Alumni Tracking System</a>
  <h4 id="whcolor">Welcome <%=request.getAttribute("role") %> <%=request.getAttribute("uid") %></h4>
  <ul class="navbar-nav px-3">


    <li class="nav-item text-nowrap">
    
      <a class="nav-link" id="whcolor" href="logout">Log out</a>
    </li>
  </ul>
</nav>