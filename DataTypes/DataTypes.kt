val firstName: String = "Chike"
val lastName = "Mgbemena" // will still compile
val dateOfBirth = "29th March, 1709"
dateOfBirth = "25th December, 1600" // cannot be changed
 
var car = "Toyota Matrix"
car = "Mercedes-Maybach" // can be changed
var age = 12
age = "12 years old" // Error: type mismatch

val carName = "BMW", streetName = "Oke street" // this won't compile
 
// this will compile
var carName = "BMW"
var streetName = "Oke street"

val country = "Nigeria" // type is inferred by compiler
val code = 234

val myInt = 55
val myLong = 40L
val myFloat = 34.43F
val myDouble = 45.78
val myHexadecimal = 0x0F
val myBinary = 0b010101

val myLong = 19L
val myLongAgain: Long = 40

val stringNumber = "101"
val intValue = stringNumber.toInt()

val intValue = "101".toInt()

val myTrueBoolean = true
val myFalseBoolean = false
 
val x = 1
val y = 3
val w = 4
val z = 6
 
val n = x < z && z > w // n is true

val myString = "This is a String"
val escapeString = "This is a string with new line \n"

val multipleStringLines = """
        This is first line
        This is second line
        This is third line """

val myArray = arrayOf(4, 5, 7, 3)
val myArray = arrayOf(4, 5, 7, 3, "Chike", false)

val myArray3 = arrayOf<Int>(4, 5, 7, 3, "Chike", false) // will not compile
val myArray4 = intArrayOf(4, 5, 7, 3, "Chike", false)  // will not compile


val numbersArray = Array(5, { i -> i * 2 })