// a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
// a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
// a와 b의 대소관계는 정해져있지 않습니다.

// a와 b사이에 속한 모든 정수의 합
function solution(a,b) {
    let answer = 0;

    if(a<=b) { // 같을때도
        for(let i=a; i<=b; i++) {
            answer = answer + i;
        }
    }
    if(a>b) {
        for(let i=b; i<=a; i++) {
            answer = answer + i;
        }
    }

    return answer;

    // return (a+b)*(Math.abs(b-a)+1)/2; 다른 사람 코드
    // abs 절대값 반환
}

console.log(solution(10,5));