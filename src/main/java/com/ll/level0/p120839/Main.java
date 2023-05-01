package com.ll.level0.p120839;

//https://school.programmers.co.kr/learn/courses/30/lessons/120839
// 가위 바위 보

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

}
class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i <rsp.length(); i++){
            switch (rsp.charAt(i)) {
                case '2' -> answer += "0";
                case '0' -> answer += "5";
                default -> answer += "2";
            }
        }
        return answer;
    }
}

/*
class Solution {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split(""))
                .map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2")
                .collect(Collectors.joining());
    }
}
 */