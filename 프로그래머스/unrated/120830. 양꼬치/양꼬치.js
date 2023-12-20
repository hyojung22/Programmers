function solution(n, k) {
    var a = Math.floor(n / 10)
    var answer = (12000*n) + ((k-a)*2000)
    return answer;
}