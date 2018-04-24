var list = [4, 5, 6];
for (var i in list) {
    console.log(i); // "0", "1", "2",
}
for (var _i = 0, list_1 = list; _i < list_1.length; _i++) {
    var i = list_1[_i];
    console.log(i); // "4", "5", "6"
}
var pets = (["Cat", "Dog", "Hamster"]);
pets["species"] = "mammals";
for (var pet in pets) {
    console.log(pet); // "species"
}
for (var _a = 0, pets_1 = pets; _a < pets_1.length; _a++) {
    var pet = pets_1[_a];
    console.log(pet); // "Cat", "Dog", "Hamster"
}
