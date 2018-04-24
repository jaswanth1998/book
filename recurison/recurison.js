function factorial(number) {
    if (number <= 0) {
        return 1;
    }
    else {
        return (number * factorial(number - 1)); // function invokes itself
    }
}
;
console.log(factorial(6));
