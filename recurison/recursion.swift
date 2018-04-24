func factorial(of num: Int) -> Int {
    if num == 1 {
        return 1
    } else {
        return num * factorial(of:num - 1)
    }
}

let x = 4
let result = factorial(of: x)
print("The factorial of \(x) is \(result)")