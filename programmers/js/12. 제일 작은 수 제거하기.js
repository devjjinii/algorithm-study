function solution(arr) {
    const answer = [];

    if(arr.length == 1) {
        answer.push(-1);
        return answer;
        
    } else {
        const min = Math.min(...arr); // 배열에서 최솟값
        // console.log('최솟값 : ', min);
        // console.log('최솟값 인덱스 : ', arr.indexOf(min))
        
        arr.splice(arr.indexOf(min),1);

        return arr;
    }   
}

console.log(solution([-10]));
console.log(solution([6,5,1,2]));
console.log(solution([9,3,6,5,10,22]));


// var a = [0, 1, 2, 3, 4, 5];
// 2번 배열부터 3개 제거.
// var b = a.splice(2, 3);

//console.log(a); //  [0, 1, 5]
//console.log(b); //  [2, 3, 4]
