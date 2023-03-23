package com.ll.level0.p120585;
//https://school.programmers.co.kr/learn/courses/30/lessons/120585
// 머쓱이보다 키 큰 사람


import java.util.Arrays;

public class Main {
}
class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array)
                .filter(e -> e > height)
                .count();
    }
}