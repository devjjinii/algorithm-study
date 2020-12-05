function solution(s) {
    let answer = '';
    const len = s.length;
    const half = Math.floor(len/2);

    if(len%2 != 0) { // 나머지가 0이 아니라면 (홀수)
        answer = s[half];
    }else {
        answer = s[half-1] + s[half];
    }
    return answer;
}
console.log(solution("데브진"));

// Math.ceil : 올림
// Math.floor : 버림
// Math.round : 반올림