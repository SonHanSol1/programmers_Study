package com.ll.level0.p120816;
//https://school.programmers.co.kr/learn/courses/30/lessons/120816
// 피자 나눠 먹기 (3)

public class Main {

}
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice!=0)
        {
            answer = n/slice + 1;
        }
        else{
            answer = n/slice;
        }

        return answer;
    }
}

/*
class Solution {
    public int solution(int slice, int n) {
        return n % slice > 0 ? n/slice+1 : n/slice;
    }
}
 */