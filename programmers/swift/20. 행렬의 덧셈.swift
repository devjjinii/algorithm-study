func solution(_ arr1:[[Int]], _ arr2:[[Int]]) -> [[Int]] {
    var result = arr1
    for i in 0..<arr1.count { // 배열길이
        for j in 0..<arr1[i].count {
            // print(arr1[i].count)
            result[i][j] += arr2[i][j]
        }
    }
    return result
}

// return zip(arr1, arr2).map{zip($0,$1).map{$0+$1}}

/////////////////////////////

let words = ["one", "two", "three", "four"]
let numbers = 1...4

for (word, number) in zip(words, numbers) {
    print("\(word): \(number)")
}
// Prints "one: 1"
// Prints "two: 2
// Prints "three: 3"
// Prints "four: 4"
