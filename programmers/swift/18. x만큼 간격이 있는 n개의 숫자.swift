func solution(_ x:Int, _ n:Int) -> [Int64] {
    
    var array = [Int64]()  // == var array : [Int] = []
    for i in 1...n{
        array.append(Int64(x*i))
    }
    
    return array
}


// var numbers = [1, 2, 3, 4, 5]
// numbers.append(100)
// print(numbers)
// Prints "[1, 2, 3, 4, 5, 100]"

// 다른 사람 풀이
func solution(_ x:Int, _ n:Int) -> [Int64] {
    return Array(1...n).map { Int64($0 * x) }
}
