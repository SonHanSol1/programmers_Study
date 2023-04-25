package com.ll.level0.p120893;

//https://school.programmers.co.kr/learn/courses/30/lessons/120893
// 대문자와 소문자

public class Main {

}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char ch;
        for (int i = 0; i < my_string.length(); i++){
            ch = my_string.charAt(i);
            if (65 <= ch && ch <= 90) {
                answer += (char)(ch + 32);
            }
            else {
                answer += (char)(ch - 32);
            }
        }
        return answer;
    }
}

/*
class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
               answer += Character.toLowerCase(my_string.charAt(i));
            } else {
               answer += Character.toUpperCase(my_string.charAt(i));
            }
        }

        return answer;
    }
}
 */