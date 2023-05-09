package com.ll.level0.p120862;

//https://school.programmers.co.kr/learn/courses/30/lessons/120862
// 최댓값 만들기 (2)


import java.util.Arrays;

public class Main {

}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);
        int first = numbers[0] * numbers[1];
        int last = numbers[numbers.length-1] * numbers[numbers.length-2];
        if(first > last){
            answer = first;
        }
        else{
            answer = last;
        }
        //answer = Math.max(start, last);
        return answer;
    }
}
/*
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int edge1 = numbers[0]*numbers[1];
        int edge2 = numbers[numbers.length-2]*numbers[numbers.length-1];

        answer = Math.max(edge1,edge2);
        return answer;
    }
}
 */