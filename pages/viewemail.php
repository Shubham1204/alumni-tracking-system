
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard
    </title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/email.css">
    
</head>
<body>
   <h1>
   <?php

include "../controller/config.php"; 


$sql = "select emailsubject,description,semail,remail from email_mst";
$result = mysqli_query($db,$sql) or die("Bad query $sql");
// echo "Successful";?>
<center><h1>Show Emails</h1></center>
<table class="body-wrap">
    <tr>
        <td></td>
        <td class="container" width="600">
            <div class="content">

                <?php
while($row = mysqli_fetch_assoc($result)){
// echo "{$row['username']} {$row['uid']}";
// }
// if(mysqli_fetch_assoc($result)){
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
                                        <h3>Subject: <?php echo "{$row['emailsubject']}" ?></h3>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="content-block">
                                    <?php echo "{$row['description']}" ?>  </td>
                                </tr>
                                <tr>
                                    <td class="content-block">
                                    To: <?php echo "{$row['remail']}" ?>  <br>
                                    <br>  
                                    From: <?php echo "{$row['semail']}" ?> </td>
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