function solution(arr) {
    let answer = [];
    let temp = arr[0];
    answer.push(temp);

    for(let i=1; i<arr.length; i++) {
        if(temp != arr[i]) {
            temp = arr[i];
            answer.push(temp);
        }
    }
    return answer;
    // 다른 사람: return arr.filter((val,index) => val != arr[index+1]);
}

let intArr = [2,2,3,1,5,5,7];
console.log(solution(intArr));