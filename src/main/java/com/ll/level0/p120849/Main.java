package com.ll.level0.p120849;

// https://school.programmers.co.kr/learn/courses/30/lessons/120849
// 모음 제거

public class Main {
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String filter[] = {"a", "e", "i", "o", "u"};
        for(String i  : filter){
            answer = my_string.replaceAll(i, "");
            my_string = answer;

        }
        return answer;
    }
}

/*
class Solution {
    public String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}
 */