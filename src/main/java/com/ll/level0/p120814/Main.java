package com.ll.level0.p120814;
//https://school.programmers.co.kr/learn/courses/30/lessons/120814
//피자 나눠 먹기(1)
public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n > 7) {
            answer = n/7;
            if(n%7 != 0) {
                answer += 1;
            }
            return answer;
        }
        return 1;
    }
}

/*
// 다른 사람의 풀이
class Solution {
    public int solution(int n) {
        return (n + 6) / 7;
    }
}
 */