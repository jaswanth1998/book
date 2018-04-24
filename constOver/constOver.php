<?php
class Animal
{
    public $name = "No-name animal";
    
    public function __construct($name)
    {
        $this->name = $name;
    }
}

$animal = new Animal("Bob the Dog");
echo $animal->name;
?>

<?php
class Animal1
{
    public $name = "No-name animal";
    
    public function __construct($name)
    {
        echo "I'm alive!";    
        $this->name = $name;
    }
    
    public function __destruct()
    {
        echo "I'm dead now :(";
    }
}

$animal = new Animal1("Bob");
echo "Name of the animal: " . $animal->name;
?>