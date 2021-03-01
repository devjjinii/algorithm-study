import Foundation

func solution(_ d:[Int], _ budget:Int) -> Int {
    
    var sum = 0
    var count = 0
    
    for i in d.sorted() {
        sum += i
        if sum <= budget {
            count += 1
        } else {
            break
        }
    } 
    return count
}
