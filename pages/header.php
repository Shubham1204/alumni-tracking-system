<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!-- <link rel="manifest" href="manifest.json" /> -->
 
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
      <div class="container-fluid">
        <a class="navbar-brand display-1" href="../index.html">Alumni Tracking System</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="../index.php">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="addevent.php">Add Event</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="addnotice.php">Add Notice</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="sendemail.php">Send Email</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="sendmessage.php">Send Messages</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="viewevent.php">View Event</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="viewemail.php">View Email</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="viewmessage.php">View Message</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="viewnotice.php">View Notices</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="viewuser.php">View Users</a>
            </li>

           
            <?php 
// session_start();
    
if(isset($_SESSION['email'])){
	?>
            <li class="nav-item">
              <a class="nav-link" href="logout.php">LogOut</a>
            </li>
            <?php
}
else{
?>
 <li class="nav-item">
              <a class="nav-link" href="login.php">Sign in</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="register.php">Register</a>
            </li>
            <?php
}
?>
          </ul>
        </div>
      </div>
    </nav>
    <script src="../navbar/jquery/jquery.slim.min.js"></script>
    <script src="../navbar/bootstrap/js/bootstrap.bundle.min.js"></script>
  
</body>
</html>
