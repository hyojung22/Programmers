class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int rest = 0;
        int ticket = 0;

        double i = chicken;
        while (true){
            ticket += (int)(i / 10);
            rest += i % 10;
            i = i / 10;
            System.out.println("티켓 수 : " +ticket);
            System.out.println("남은 쿠폰 수 : " + rest);
            if(i==0){
                break;
            }
        }

        if(rest >= 10){
            rest = rest / 10;
        } else {
            rest = 0;
        }
        answer = (int) (chicken*0.1111111111);
        return answer;
    }
}