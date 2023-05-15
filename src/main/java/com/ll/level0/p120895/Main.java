package com.ll.level0.p120895;

// https://school.programmers.co.kr/learn/courses/30/lessons/120895
// 인덱스 바꾸기

public class Main {

}
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char temp;
        char[] ch = my_string.toCharArray();

        temp = ch[num1];
        ch[num1] = ch[num2];
        ch[num2] = temp;
        answer = new String(ch);

        return answer;
    }
}

/*
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] ch = my_string.toCharArray();

        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);

        answer = String.valueOf(ch);
        return answer;
    }
}
 */