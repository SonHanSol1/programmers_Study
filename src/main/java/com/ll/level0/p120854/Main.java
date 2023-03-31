package com.ll.level0.p120854;

// https://school.programmers.co.kr/learn/courses/30/lessons/120854
// 배열 원소의 길이

public class Main {
}

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i =0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
/*
import java.util.Arrays;

class Solution {
    public int[] solution(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}
 */