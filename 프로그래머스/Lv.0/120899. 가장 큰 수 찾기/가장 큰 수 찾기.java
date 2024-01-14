class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int num = array[0];
        for(int i = 1; i<array.length; i++ ){
            if(num > array[i]){
                // num은 그대로 두고 인덱스만 업데이트
                answer[0] = num;
                answer[1] = i-1;
            } else {
                // num을 업데이트하고 인덱스도 함께 업데이트
                num = array[i];
                answer[0] = num;
                answer[1] = i;
            }
        }
        return answer;
    }
}