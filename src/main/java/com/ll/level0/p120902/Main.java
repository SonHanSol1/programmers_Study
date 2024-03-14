package com.ll.level0.p120902;

//https://school.programmers.co.kr/learn/courses/30/lessons/120902
// 문자열 계산하기

import java.util.Arrays;

public class Main {

}
//class Solution {
//    public int solution(String my_string) {
//        int answer = 0;
//        String[] str = my_string.split(" ");
//        for(int i = 0; i < str.length; i++){
//            if(str[i].equals("+")){
//                str[i+1] = String.valueOf(Integer.parseInt(str[i-1]) + Integer.parseInt(str[i+1]));
//                answer = Integer.parseInt(str[i+1]);
//            } else if(str[i].equals("-")){
//                str[i+1] = String.valueOf(Integer.parseInt(str[i-1]) - Integer.parseInt(str[i+1]));
//                answer = Integer.parseInt(str[i+1]);
//            }
//        }
//        return answer;
//    }
//}

//class Solution {
//    public int solution(String my_string) {
//        int answer = 0;
//        boolean sign = true;
//        String[] arr = my_string.split(" ");
//        for(int i = 0; i < arr.length; i++){
//            if(i%2==0){
//                answer += sign ? Integer.parseInt(arr[i]) : -Integer.parseInt(arr[i]);
//            } else{
//                sign = arr[i].equals("+");
//            }
//        }
//        return answer;
//    }
//}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        int sign = 1;
        for(String s : str){
            if(s.equals("+") || s.equals("-")){
                sign = s.equals("-") ? -1 : 1;
            } else{
                answer += Integer.parseInt(s) * sign;
            }
        }
        return answer;
    }

}
