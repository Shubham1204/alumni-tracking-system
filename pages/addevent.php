<?php 
session_start();
    
if(isset($_SESSION['email'])){
}
else{
    header( "location: notlogin.html");   
    }
?>
<html>
    <head>
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge;chrome=1"/>
        <meta name="HandheldFriendly" content="true">
        <title>Send</title>
        <!-- <link rel="stylesheet" href="css/addevent.css" type="text/css" /> -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Play">
        
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="../vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="../vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../css/util.css">
	<link rel="stylesheet" type="text/css" href="../css/sendmessage.css">
<!--===============================================================================================-->
</head>
<body>
	<?php include"header.php" ?>
	<div class="limiter">
		<div class="container-login100" style="background-image: url('../images/bg-01.jpg');">
			<div class="wrap-login100 p-t-30 p-b-50">
				<span class="login100-form-title p-b-41">
					Add Events
				</span>
				<form class="login100-form validate-form p-b-33 p-t-5" action="../controller/addeventcontroller.php" method="post">

					<div class="wrap-input100 validate-input" data-validate = "Enter Event">
						<input class="input100" type="text" name="eventname" placeholder="Event Name">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
					</div>

                    <div class="wrap-input100 validate-input" data-validate = "Enter Description">
						<input class="input100" type="text" name="eventdesc" placeholder="Event Description">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
                    </div>
                    
                    <div class="wrap-input100 validate-input" data-validate = "Enter Date">
						<input class="input100" type="date" name="eventdate" placeholder="Event Date">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
                    </div>

                    <div class="wrap-input100 validate-input" data-validate = "Enter Venue">
						<input class="input100" type="text" name="eventvenue" placeholder="Event Venue">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
                    </div>

                    <div class="wrap-input100 validate-input" data-validate = "Enter Email">
						<input class="input100" type="email" name="eventemail" placeholder="Event Email">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
                    </div>
                    
                    <div class="wrap-input100 validate-input" data-validate = "Enter Contact no.">
						<input class="input100" type="tel" name="eventcontact" placeholder="Event Contact no.">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
                    </div>

                    <div class="wrap-input100 validate-input" data-validate = "Enter Time">
						<input class="input100" type="time" name="eventtime" placeholder="Event Time">
						<span class="focus-input100" data-placeholder="&#xe82a;"></span>
                    </div>
					<div class="container-login100-form-btn m-t-32">
						<button class="login100-form-btn">
							Add
						</button>
					</div>

				</form>
			</div>
		</div>
	</div>
	

	<!-- <div id="dropDownSelect1"></div> -->
	
<!--===============================================================================================-->
	<script src="../vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="../vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="../vendor/bootstrap/js/popper.js"></script>
	<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="../vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="../vendor/daterangepicker/moment.min.js"></script>
	<script src="../vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="../vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="../js/main.js"></script>

</body>
</html>
