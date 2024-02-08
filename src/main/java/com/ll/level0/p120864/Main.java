package com.ll.level0.p120864;

//https://school.programmers.co.kr/learn/courses/30/lessons/120864
// 숨어있는 숫자의 덧셈 (2)

import java.util.Arrays;

public class Main {

}
//class Solution {
//    public int solution(String my_string) {
//        int answer = 0;
//        String[] numStr = my_string.replaceAll("[^0-9]", " ").split(" ");
//        numStr = Arrays.stream(numStr)
//                .filter(item -> !item.isEmpty())
//                .toArray(String[]::new);
//        for(String i : numStr){
//            answer += Integer.parseInt(i);
//        }
//        return answer;
//    }
//}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] numStr = my_string.replaceAll("[^0-9]", " ").split(" ");
        for(String str : numStr){
            if(!str.isEmpty()){
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}