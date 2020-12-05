/**정수 배열 numbers가 주어집니다. 
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 
 * 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요. */

function solution(numbers){
    const answer = [];

    for(let i=0; i<numbers.length-1; i++) {
        for(let j=i+1; j<numbers.length; j++) {
            if(answer.indexOf(numbers[i] + numbers[j]) == -1) {    
                answer.push(numbers[i] + numbers[j]);
            }
        }
    }

        // const answer = [...new Set(temp)] : 다른사람 코드
    answer.sort((a,b) => a-b);
    return answer;
};

console.log(solution([4,6,1,2,8]));

// indexOf() : https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String/indexOf
// indexOf() 메서드는 호출한 String 객체에서 주어진 값과 일치하는 첫 번째 인덱스를 반환합니다. 
// 일치하는 값이 없으면 -1을 반환합니다. 

// 자바스크립트 오름차순 sort
// 자료구조 Set
