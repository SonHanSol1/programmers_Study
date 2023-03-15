package com.ll.level0.p120817;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        int[] numbers={1,2,3,4,5,6,7,8,9,10};
//        double answer = 0;
//        for(int i =0; i < numbers.length; i++){
//            answer = answer + numbers[i];
//        }
//        System.out.println(answer/numbers.length);
    }
}

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i =0; i < numbers.length; i++){
            answer = answer + numbers[i];
        }
        return answer/numbers.length;
    }
}