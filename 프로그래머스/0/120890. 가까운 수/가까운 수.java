import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        // 배열 오름차순 정렬
        Arrays.sort(array);

        // 원소와 정수 n을 뺀 절대값 ArrayList에 저장
        List<Integer> a = new ArrayList<>();

        for(int i = 0; i<array.length; i++){
            a.add(Math.abs(array[i] - n));
        }

        System.out.println(a);

        // 최소값인 인덱스 구하기
        int min = a.get(0);
        int idx = 0;

        for(int i = 1; i<a.size(); i++){
            if(a.get(i) < min){
                min = a.get(i);
                idx = i;
            }
        }
        answer =  array[idx];
        return answer;
    }
}

/*
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        for(int i = 1; i<array.length; i++){
            if(Math.abs(n - answer) > Math.abs(n - array[i])){
                answer = array[i];
            }
        }
        return answer;
    }
}
*/