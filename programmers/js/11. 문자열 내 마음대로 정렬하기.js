function solution(strings, n) {
   
    return strings.sort((a,b) => {
      
        if(a[n] == b[n]) {
            return a.localeCompare(b);
        } else {
            return a[n].localeCompare(b[n])
        }
    })
}


console.log(solution(["sun","bed","car"], 1))

// 오름차순 a-b
// 내림차순 b-a


/**
 * referenceStr.localeCompare(compareString)
 * 참조 문자열이 정렬 순서에서 앞 또는 뒤에 오는지 또는 주어진 문자열과 같은지를 숫자로 반환
 * referenceStr이 compareString보다 앞에 있으면 -1, 뒤에 있으면 1, 같으면 0 반환


 * 'a'.localeCompare('b') // -1 , 
 * 'b'.localeCompare('a') // 1
 * 'c'.localeCompare('c') // 0
 * 
 * */ 