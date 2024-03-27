package com.ll.level0.p120583;

//https://school.programmers.co.kr/learn/courses/30/lessons/120583
// 중복된 숫자 개수

public class Main {

}
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int num : array){
            if(num == n){
                answer++;
            }
        }
        return answer;
    }
}

/*
// 일반 for
        for(int i = 0; i < array.length; i++){
            if(array[i]==n){
                answer++;
            }
        }

// 스트림 사용
import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
                .filter(e -> e == n)
                .count();
    }
}
 */