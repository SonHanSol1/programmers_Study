package com.ll.level0.p120834;

// https://school.programmers.co.kr/learn/courses/30/lessons/120834
// 외계행성의 나이

import java.util.ArrayList;

public class Main {

}
class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = Integer.toString(age);
        for(int i = 0; i< temp.length(); i++){
            answer += (char)(temp.charAt(i)+49);
        }

        return answer;
    }
}

/*

        String reverse = "";
        while(age!=0){
            int temp = age%10;
            age = age/10;
            switch (temp){
                case 0 -> reverse += "a";
                case 1 -> reverse += "b";
                case 2 -> reverse += "c";
                case 3 -> reverse += "d";
                case 4 -> reverse += "e";
                case 5 -> reverse += "f";
                case 6 -> reverse += "g";
                case 7 -> reverse += "h";
                case 8 -> reverse += "i";
                case 9 -> reverse += "j";
            }
        }
        for(int i = reverse.length()-1; i>=0; i--){
            answer += String.valueOf(reverse.charAt(i));
        }


import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
}

 */