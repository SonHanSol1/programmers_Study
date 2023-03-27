package com.ll.level0.p120847;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120847
// 최댓값 만들기 (1)

public class Main {

}
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }
}

/*
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}

 */