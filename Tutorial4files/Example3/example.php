<?php

	#Defining constant variables

	// define("GREETING", "Welcome to ECSE321 Tutorial 4<br>");
	// echo GREETING;
	// $t = date("H"); //gets the current hour
	// if ($t < "20") {
	//     echo "Have a good day!";
	// }
	// else{
	// 	echo "Have a good night";
	// }

	# Loops are the same like Java or C

	// $x = 1; 

	// while($x <= 5) {
	//     echo "The number is: $x <br>";
	//     $x++;
	// } 

	#arrays and for loops

	// $colors = array("red", "green", "blue", "yellow"); 
	// $colors[6]= "grey";
	// foreach ($colors as $value) {
	//     echo "$value <br>";
	// }

	// //adding an element to the array
	// for ($x = 0; $x < count($colors); $x++) {
 //    echo "$colors[$x] <br>";
	// } 
	
	# associative arrays, like a dictionary

	// $age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");
	// echo "Peter is " . $age['Peter'] . " years old. <br>";

	// $age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");

	// foreach($age as $x => $x_value) {
	//     echo "Key=" . $x . ", Value=" . $x_value;
	//     echo "<br>";
	// }

	#defining functions with arguments

	// function familyName($fname) {
 //    	echo "$fname Refsnes.<br>";
	// }

	// familyName("Jani");
	// familyName("Hege");
	// familyName("Stale");
	// familyName("Kai Jim");
	// familyName("Borge");

	#defining functions with arguments that hold a default value

	// function setHeight($minheight = 50) {
	//     echo "The height is : $minheight <br>";
	// }

	// setHeight(350);
	// setHeight(); // will use the default value of 50
	// setHeight(135);
	// setHeight(80);
?>