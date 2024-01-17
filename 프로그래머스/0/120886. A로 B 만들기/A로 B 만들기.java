import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] str1 = before.toCharArray();
        char[] str2 = after.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2) ? 1 : 0;
        
    }
}