function solution(seoul) {
    // 인덱스 위치를 찾음
    for(let i=0; i<seoul.length; i++) {
        // console.log(seoul[i])
        if(seoul[i] === 'Kim') {
           return `김서방은 ${i}에 있다`;
        }
    }
}

 // string 형 배열 seoul
console.log(solution(['Jane', 'Kim']))
console.log(solution(['Kim','Jane']))
console.log(solution(['Jane','Dev', 'Hi','Kim']))
