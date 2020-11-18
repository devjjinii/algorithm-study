function solution(s) {

    if((s.length === 4 || s.length === 6) && !isNaN(s)) {
           // 11번 테스트 -.-;
        if(s.includes('e')) {
            return false;
        }
        return true;
    } 
    return false;
}

/**
 * isNAN(value)
 * >>> 'Not a Number'
 * 
 * 파라미터가 숫자가 아닐 경우 true
 * 파라미터가 숫자일 경우 false !!!  
*/



console.log(typeof 233e+113) // 숫자니까 true
console.log(typeof a1234)  // undefined


/////// 문자열이 숫자인지 ////////

let s = 'a1234'  // 문자+숫자
let ss = '123456' // 숫자
let sss = '1e+3333' // 지수 숫자

console.log(isNaN(s)) // 숫자가 아니여서 true
console.log(isNaN(ss)) // 숫자여서 false
console.log(isNaN(sss)) // 숫자여서 false

//////////////////////////////
