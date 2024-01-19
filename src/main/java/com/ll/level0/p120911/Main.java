package com.ll.level0.p120911;

//https://school.programmers.co.kr/learn/courses/30/lessons/120911
// 문자열 정렬하기 (2)

import java.util.Arrays;

public class Main {

}
// TODO: my_string 소문자로 변경, char 배열로 변경
// TODO: 알파벳 순으로 변경
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArrays = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArrays);
        answer = new String(charArrays);
        return answer;
    }
}