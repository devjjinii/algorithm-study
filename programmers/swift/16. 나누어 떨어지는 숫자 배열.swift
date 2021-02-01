func solution(_ arr:[Int], _ divisor:Int) -> [Int] {
    
    let check = arr.filter { ($0)%divisor == 0 }
    print(check) //	[5, 10]
    
    return check.count == 0 ? [-1] : check.sorted()
}



// let cast = ["Vivien", "Marlon", "Kim", "Karl"]
// let lowercaseNames = cast.map { $0.lowercased() }
// // 'lowercaseNames' == ["vivien", "marlon", "kim", "karl"]
// let letterCounts = cast.map { $0.count }
// // 'letterCounts' == [6, 6, 3, 4

// let cast = ["Vivien", "Marlon", "Kim", "Karl"]
// let shortNames = cast.filter { $0.count < 5 }
// print(shortNames)
// // Prints "["Kim", "Karl"]"
