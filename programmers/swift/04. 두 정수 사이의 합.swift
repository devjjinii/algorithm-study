func solution(_ a:Int, _ b:Int) -> Int64 {  //// Int64
    var answer : Int = 0
    
    for i in a < b ? a...b : b...a {
        answer += i
    }
        
    return Int64(answer)
}


// let numbers = [1, 2, 3, 4]
// let numberSum = numbers.reduce(0, { x, y in
//     x + y
// })
// numberSum == 10

/*
* reduce: 내부의 값들을 결합
*/

// for-in
let numberArray = [1,2,3,4,5]
var sum = 0
for number in numberArray{
  sum += number
}
print(sum) // 15

// reduce
let numberArray = [1,2,3,4,5]
let sum = numberArray.reduce(0){ $0 + $1 }
let subract = numberArray.reduce(0){ $0 - $1 }
print(sum) // 15
print(subract) // -15
