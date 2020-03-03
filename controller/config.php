<?php
/* Database credentials. Assuming you are running MySQL
server with default setting (user 'root' with no password) */
define('DB_SERVER', 'localhost');
define('DB_USERNAME', 'root');
define('DB_PASSWORD', '');
define('DB_NAME', 'alumni_tracking_system');
// define('DB_SERVER', 'sql209.epizy.com');
// define('DB_USERNAME', 'epiz_25110741');
// define('DB_PASSWORD', '2coolsanju');
// define('DB_NAME', 'epiz_25110741_alumni');
// echo "inside config";

/* Attempt to connect to MySQL database */
$db = mysqli_connect(DB_SERVER, DB_USERNAME, DB_PASSWORD, DB_NAME);
// Check connection
if($db === false){
    die("ERROR: Could not connect. " . mysqli_connect_error());
}
?>