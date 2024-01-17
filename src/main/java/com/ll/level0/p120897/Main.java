package com.ll.level0.p120897;

// https://school.programmers.co.kr/learn/courses/30/lessons/120897
// 약수 구하기

import java.util.stream.IntStream;

public class Main {

}
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        /*
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++)
        {
            if(n%i==0)
            {
                list.add(i);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
                answer[i] += list.get(i);
        }

        return answer;
         */
        return IntStream.rangeClosed(1,n).filter(i -> n%i == 0).toArray();
        /*
        1. IntStream.rangeClosed(1,n): 1 ~ n까지 정수 스트림 생성
        2. filter(i -> n%i == 0) : 스트림 각 요소를 n%i==0인지 확인
        3. toArray() : filter로 걸러낸 것을 배열로 생성
         */
    }
}