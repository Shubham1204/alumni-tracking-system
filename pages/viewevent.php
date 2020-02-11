
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard
    </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
    <style type="text/css">
        body{ font: 14px sans-serif; text-align: center; }
    </style>
</head>
<body>
   <h1>
   <?php

include "../controller/config.php"; 


$sql = "select eventname,description,email,contact,date,time,venue from event_mst";
$result = mysqli_query($db,$sql) or die("Bad query $sql");
// echo "Successful";
?>
<h1>Show roles</h1>
	<table class='table table-bordered'>
			<thead class='thead-dark'>
				<tr>
                    <th>Event Name</th>
                    <th>Description</th>
					<th>Email</th>
                    <th>Contact No.</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>Venue</th>
				</tr>
			</thead>
			<tbody>
                <?php
while($row = mysqli_fetch_assoc($result)){
// echo "{$row['username']} {$row['uid']}";
// }
// if(mysqli_fetch_assoc($result)){
    ?>
    <tr>
    <td><?php echo "{$row['eventname']}" ?></td>
    <td><?php echo "{$row['description']}" ?></td>
    <td><?php echo "{$row['email']}" ?></td>
    <td><?php echo "{$row['contact']}" ?></td>
    <td><?php echo "{$row['date']}" ?></td>
    <td><?php echo "{$row['time']}" ?></td>
    <td><?php echo "{$row['venue']}" ?></td>
    </tr>
    <!-- echo "{$row['eventname']}  {$row['description']} {$row['email']} {$row['contact']} {$row['date']} {$row['time']} {$row['venue']}<br>"; -->
<!-- //    echo ' <input type="text" name="cllg" id="cllg" value='{$row['username']}'>'; -->
<!-- // } else{ -->
    <!-- // echo "cllg list empty"; -->
    <?php
}
?>
</tbody>
</table>
<?php 
// Close connection
mysqli_close($db);
?></h1>

</body>
</html>