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
    <link rel="stylesheet" href="../css/about.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css">
    <link rel="stylesheet" href="../css/blog.css">
</head>
<body>
<?php include"header.php" ?>

<?php
include "../controller/config.php"; 


$sql = "select eventname,description,email,contact,date,time,venue from event_mst";
$result = mysqli_query($db,$sql) or die("Bad query $sql");
// echo "Successful";
?>
<h1>Show Events</h1>
<section class="blog_area section-padding mt-5">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 mb-5 mb-lg-0">
                    <div class="blog_left_sidebar">
                <?php
while($row = mysqli_fetch_assoc($result)){
// echo "{$row['username']} {$row['uid']}";
// }
// if(mysqli_fetch_assoc($result)){
    ?>
   <article class="blog_item">
                            <div class="blog_item_img">
                                <img class="card-img rounded-0" src="../images/m3.jpg" alt="">
                                <a href="#" class="blog_item_date pb-5">
                                    <!-- <h1></h1> -->
                                    <p><?php echo "{$row['date']}" ?></p>
                                    <h1></h1>
                                </a>
                            </div>

                            <div class="blog_details">
                                <p class="d-inline-block">
                                    <h2><?php echo "{$row['eventname']}" ?></h2>
                                </p>
                                <p><?php echo "{$row['description']}" ?></p>
                                <ul class="blog-info-link">
                                    <li>Email: <?php echo "{$row['email']}" ?></li>
                                    <li>Contact: <?php echo "{$row['contact']}" ?></li>
                                    <li>Time: <?php echo "{$row['time']}" ?></li>
                                    <li>Venue: <?php echo "{$row['venue']}" ?></li>
                                </ul>
                            </div>
                        </article>
    <?php
}
?>
                     
                     </div>
                </div>
            </div>
        </div>
</section>
<?php 
// Close connection
mysqli_close($db);
?></h1>

</body>
</html>