class Solution {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[^0-9]","");
        String[] result = str.split("");
        int sum = 0;
        for(int i  = 0; i<result.length ; i++){
            sum += Integer.parseInt(result[i]);
        }
        
        return sum;
    }
}