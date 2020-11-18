function solution(n) {
    let answer = '';

    // 홀수일때 짝수일때
    for(let i=0; i<n; i++){
        answer += i%2 == 0 ? "수" : "박";
    } 

    return answer;
}

console.log(solution(5))
console.log(solution(2))
console.log(solution(3))
