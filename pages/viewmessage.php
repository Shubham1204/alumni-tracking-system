<?php 
session_start();
    
if(isset($_SESSION['email'])){
}
// exit;
// }
else{
    header( "location: notlogin.html");
    
    }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard
    </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="../css/email.css">
</head>
<body>
<?php include"header.php" ?>
   <h1>
   <?php

include "../controller/config.php"; 


$sql = "select messagesubject,description,scontact,rcontact from message_mst";
$result = mysqli_query($db,$sql) or die("Bad query $sql");
// echo "Successful";?>
<center><h1>Show Messages</h1></center>
<table class="body-wrap">
    <tr>
        <td></td>
        <td class="container" width="600">
            <div class="content">

                <?php
while($row = mysqli_fetch_assoc($result)){
    ?>

<table class="main" width="100%" cellpadding="0" cellspacing="0">
                    <tr>
                        <td class="content-wrap">
<table  cellpadding="0" cellspacing="0">
<tr>
                                    <td>
                                        <img class="img-fluid" src="../images/header.jpg"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="content-block">
                                        <h3>Subject: <?php echo "{$row['messagesubject']}" ?></h3>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="content-block">
                                    <?php echo "{$row['description']}" ?>  </td>
                                </tr>
                                <tr>
                                    <td class="content-block">
                                    To: <?php echo "{$row['rcontact']}" ?>  <br>
                                    <br>  
                                    From: <?php echo "{$row['scontact']}" ?> </td>
                                </tr>
                             
</table>
</td>
                    </tr>
                </table>

   
    <?php
}
 ?>
 
                </div>
        </td>
        <td></td>
    </tr>
</table>
<?php 
// Close connection
mysqli_close($db);
?></h1>

</body>
</html>