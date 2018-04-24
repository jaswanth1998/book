// Named function
function add(x, y) {
    return x + y;
}

// Anonymous function
let myAdd = function(x, y) { return x + y; };


function add1(x: number, y: number): number {
    return x + y;
}

let myAdd1 = function(x: number, y: number): number { return x + y; };
let myAdd3: (x: number, y: number) => number =
    function(x: number, y: number): number { return x + y; };
    let myAdd4: (baseValue: number, increment: number) => number =
    function(x: number, y: number): number { return x + y; };