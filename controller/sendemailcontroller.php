<?php

include "config.php"; 

// Escape user inputs for security
// $last_name = mysqli_real_escape_string($db, $_REQUEST['last_name']);
$emailsubject = mysqli_real_escape_string($db, $_REQUEST['emailsubject']);
$emaildesc = mysqli_real_escape_string($db, $_REQUEST['emaildesc']);
$semail = mysqli_real_escape_string($db, $_REQUEST['semail']);
$remail = mysqli_real_escape_string($db, $_REQUEST['remail']);
 
// Attempt insert query execution
$sql = "insert into email_mst (emailsubject,description,semail,remail) values ('{$emailsubject}','{$emaildesc}','{$semail}','{$remail}')";
// $sql = "inert into user_role_mapping ()";
$result = mysqli_query($db,$sql) or die("Bad query $sql");
if($result){
    echo "Records added successfully.";
    // session_start();
    
    // if(isset($_SESSION["username"])){
    // header( "location: ../dashboard.php");
    // }
    // exit;
    // }
    // else{
        
        // }
        // echo "Record successfully  {$row['username']}";
    }
     else{
        echo "ERROR: Could not able to execute $sql. " . mysqli_error($db);
    }

 
// Close connection
mysqli_close($db);
?>