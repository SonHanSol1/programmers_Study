package com.ll.level0.p120822;

// https://school.programmers.co.kr/learn/courses/30/lessons/120822
// 문자열 뒤집기

public class Main {
}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length()-1; i >= 0; i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}

/*
import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}
 */