package com.ll.level0.p120853;

//https://school.programmers.co.kr/learn/courses/30/lessons/120853
// 컨트롤 제트

import java.util.Stack;

public class Main {

}
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        String[] str = s.split(" ");
//        for(int i = 0; i < str.length; i++){
//            if(str[i].equals("Z")){
//                str[i-1] = "0";
//                str[i] = "0";
//                i = 0;
//            }
//        }
//        for(int j = 0; j < str.length; j++){
//            answer += Integer.parseInt(str[j]);
//        }
//        return answer;
//    }
//}
class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(String w: s.split(" ")) {
            if(w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for(int i : stack) {
            answer += i;
        }
        return answer;
    }
}