<?php

include "config.php"; 

// Escape user inputs for security
// $last_name = mysqli_real_escape_string($db, $_REQUEST['last_name']);
$eventname = mysqli_real_escape_string($db, $_REQUEST['eventname']);
$eventdesc = mysqli_real_escape_string($db, $_REQUEST['eventdesc']);
$eventemail = mysqli_real_escape_string($db, $_REQUEST['eventemail']);
$eventdate = mysqli_real_escape_string($db, $_REQUEST['eventdate']);
$eventtime = mysqli_real_escape_string($db, $_REQUEST['eventtime']);
$eventvenue = mysqli_real_escape_string($db, $_REQUEST['eventvenue']);
$eventcontact = mysqli_real_escape_string($db, $_REQUEST['eventcontact']);
 
// Attempt insert query execution
$sql = "insert into event_mst (eventname,description,email,contact,date,time,venue) values ('{$eventname}','{$eventdesc}','{$eventemail}','{$eventcontact}','{$eventdate}','{$eventtime}','{$eventvenue}')";
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