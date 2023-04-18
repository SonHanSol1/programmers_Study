package com.ll.level0.p120851;

//https://school.programmers.co.kr/learn/courses/30/lessons/120851
// 숨어있는 숫자의 덧셈 (1)

public class Main {

}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i =0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch >= 48 && ch <= 57){
                answer = answer + (ch - '0');
            }
        }
        return answer;
    }
}
//class Solution {
//    public int solution(String my_string) {
//        int answer = 0;
//        String intStr = my_string.replaceAll("[^0-9]", "");
//        int calc = Integer.parseInt(intStr);
//        while(calc!=0){
//            answer += calc%10;
//            calc = calc/10;
//        }
//        return answer;
//    }
//}
