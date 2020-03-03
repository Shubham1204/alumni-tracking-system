<?php
// Starting session
session_start();
 
// Removing session data
if(isset($_SESSION["email"])){
    unset($_SESSION["email"]);
    unset($_SESSION["rolename"]);
    if(true){
    header( "location: ../logout.html");
    
}
else{
    header( "location: ../index.php");
}
}
?>