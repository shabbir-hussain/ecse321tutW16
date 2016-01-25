<!-- <html>
	<body>
	Welcome <?php echo $_GET["firstname"]."  ".$_GET["lastname"]; ?> to ECSE321 tutorial 4<br>
	</body>
</html> -->

<!-- or you can use this -->
<?
	echo "<html>
			<body>
				Welcome ". $_GET["firstname"]." ".$_GET["lastname"]." to ECSE321 tutorial 4
			</body>
		  </html>"
?>
