import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        ArrayList<Integer> num1 = new ArrayList<>();
        for(int i = sides[1]-sides[0]+1; i<= sides[1]; i++){
            num1.add(i);
        }
        ArrayList<Integer> num2 = new ArrayList<>();
        for(int i = sides[1]+1 ; i<sides[0]+sides[1]; i++){
            num2.add(i);
        }
    
        return num1.size() + num2.size();
    }
}