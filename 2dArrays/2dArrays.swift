var myArray : [[Int]] = [[1,2,3],[4,5,6],[7,8,9]]

for first in myArray {
    for second in first {
        print("value \(second)")
    }
}