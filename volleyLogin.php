<?php

//if($_SERVER['REQUEST_METHOD']=='POST'){
$username = "gg"
require_once('dbConnect.php');
//$sql = "SELECT * FROM user WHERE username = '$username'";
$result = mysqli_query($con,$username);
$check = mysqli_fetch_array($result);
if(isset($check)){
        echo $username;
		
		
		
		
		
} else {
        echo 'not in the db';
}
// get the corresponding primary key, user_id

//$matchingPrimaryKey = $mysqli->insert_id($username);




//close the dayabase?
?>

