function solution(s){
    //let answer = true;

    let p = s.toUpperCase().split("P").length;
    // console.log(p);
    // console.log(p.length);

    
    let y = s.toUpperCase().split("Y").length;
    // console.log(y);
    // console.log(y.length);


    return p === y;
}

console.log(solution("ySSppyysdppyYp"));
console.log(solution("yoypopp"));