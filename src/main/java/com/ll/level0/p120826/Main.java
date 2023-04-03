package com.ll.level0.p120826;

// https://school.programmers.co.kr/learn/courses/30/lessons/120826
// 특정 문자 제거하기

import java.util.ArrayList;

public class Main {
}
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
       answer = my_string.replace(letter, "");
        return answer;
    }
}