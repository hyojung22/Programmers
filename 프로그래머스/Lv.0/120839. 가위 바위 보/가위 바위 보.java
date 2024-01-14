class Solution {
    public String solution(String rsp) {
        char[] arr = rsp.toCharArray();
        String result = "";
        for(char answer : arr) {
            if(answer == '2'){
                result += '0';
            } else if(answer == '0') {
                result += '5';
            } else {
                result += '2';
            }
        }
        return result;
    }
}