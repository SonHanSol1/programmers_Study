package com.ll.level0.p120821;
//https://school.programmers.co.kr/learn/courses/30/lessons/120821
// 배열 뒤집기

import java.util.Arrays;

public class Main {
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i= num_list.length-1, j =0; i >= 0; i--, j++)
        {
            answer[j] = num_list[i];

        }
        return answer;
    }
}

/*
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i< num_list.length; i++){
            answer[i] = num_list[num_list.length-i-1];
        }
        return answer;
    }
}

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
 */