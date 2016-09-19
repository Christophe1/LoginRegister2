<?php

if($_Server['REQUEST_METHOD']=='POST'){
$username = $_POST['username'];
require_once('dbConnect.php');
$sql = "INSERT INTO user (username) VALUES ('$username')";
if(mysqli_query($con,$sql)){
	echo "Successfully Registered";
} else {
	echo "Could not register";
}

}else{
	echo 'error';
}
?>