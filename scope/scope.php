
<?php
$a = 5; // global scope
function myTest()
{
	$a = 7;
echo $a; // local scope
}
echo $a;
myTest(); ?>