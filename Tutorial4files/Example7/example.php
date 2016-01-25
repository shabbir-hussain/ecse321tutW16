<?php
	$xml=simplexml_load_file("books.xml") or die("Error: Cannot create object");
	foreach($xml->children() as $books) { 
	    echo $books->title . ", "; 
	    echo $books->author . ", "; 
	    echo $books->year . ", ";
	    echo $books->price . "<br>"; 
	} 
	echo "A second way<br><br>";
	print_r ($xml);
	echo "<br>A third way<br><br>";
	echo $xml->book[0]['category'] . "<br>";
	echo $xml->book[1]->title['lang']; 
?>