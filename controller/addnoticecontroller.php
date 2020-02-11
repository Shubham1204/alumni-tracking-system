<?php

include "config.php"; 

// Escape user inputs for security
// $last_name = mysqli_real_escape_string($db, $_REQUEST['last_name']);
$noticesubject = mysqli_real_escape_string($db, $_REQUEST['noticesubject']);
$noticedesc = mysqli_real_escape_string($db, $_REQUEST['noticedesc']);
$noticeemail = mysqli_real_escape_string($db, $_REQUEST['noticeemail']);
$noticedate = mysqli_real_escape_string($db, $_REQUEST['noticedate']);
$noticecontact = mysqli_real_escape_string($db, $_REQUEST['noticecontact']);
 
// Attempt insert query execution
$sql = "insert into notice_mst (noticesubject,description,email,contact,date) values ('{$noticesubject}','{$noticedesc}','{$noticeemail}','{$noticecontact}','{$noticedate}')";
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