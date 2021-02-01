func solution(_ s:String) -> String {
    
    if s.count % 2 == 0 {
        return String(Array(s)[(s.count/2)-1...(s.count/2)])
    } else {
        return String(Array(s)[s.count/2])
    }
}

// let s = "Swift"
// let i = s.index(s.startIndex, offsetBy: 4)
// print(s[i]) // Prints "t"

// let a = "abcd"
// a[a.index(a.startIndex, offsetBy: 1)]
// 문자열 a의 첫글자로부터 1만큼 떨어져 있는 문자
