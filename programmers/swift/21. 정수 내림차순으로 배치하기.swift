func solution(_ n:Int64) -> Int64 {
    return Int64(String(String(n).sorted(by: >)))!
}





let students: Set = ["Kofi", "Abena", "Peter", "Kweku", "Akosua"]
let descendingStudents = students.sorted(by: >)  // 내림차순 정렬
print(descendingStudents)
// Prints "["Peter", "Kweku", "Kofi", "Akosua", "Abena"]"

print(students.sorted())
// Prints "["Abena", "Akosua", "Kofi", "Kweku", "Peter"]"
print(students.sorted(by: <))
// Prints "["Abena", "Akosua", "Kofi", "Kweku", "Peter"]"
