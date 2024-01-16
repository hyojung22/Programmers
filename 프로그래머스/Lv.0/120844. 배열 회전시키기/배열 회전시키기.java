import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] numbers, String direction) {
        List<Integer> answer = new ArrayList<>();
        int size = numbers.length;
        for(int i = 0; i < size ; i++){
            if(direction.equals("right")){
                answer.add(numbers[(i + size -1 ) % size]);
            } else {
                answer.add(numbers[(i + 1) % size]);
            }
        }
        return answer;
    }
}