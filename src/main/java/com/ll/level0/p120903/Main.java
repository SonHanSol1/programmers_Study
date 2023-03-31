package com.ll.level0.p120903;

// https://school.programmers.co.kr/learn/courses/30/lessons/120903
// 배열의 유사도

public class Main {
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String i : s1){
            for(String y : s2){
                if(i.equals(y)){
                    ++answer;
                }
            }
        }
        return answer;
    }
}

/*
// set 공부 필요
import java.util.HashSet;
import java.util.List;
class Solution {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> set = new HashSet<>(List.of(s1));
        for (String s : s2) {
            if(set.contains(s)){
                answer++;
            }
        }
        return answer;
    }
}
 */