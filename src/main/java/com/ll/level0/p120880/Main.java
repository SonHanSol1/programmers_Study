package com.ll.level0.p120880;

// https://school.programmers.co.kr/learn/courses/30/lessons/120880
// 특이한 정렬

import java.util.*;

public class Main {

}

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer;
        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (Math.abs(numlist[i] - n) <= Math.abs(numlist[j] - n)) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        answer = numlist;
        return answer;
    }
}
