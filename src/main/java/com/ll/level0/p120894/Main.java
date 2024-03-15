package com.ll.level0.p120894;

//https://school.programmers.co.kr/learn/courses/30/lessons/120894
// 영어가 싫어요

public class Main {

}
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[][] str = new String[][] {
                {"zero", "0"}, {"one", "1"}, {"two", "2"},
                {"three", "3"}, {"four", "4"}, {"five", "5"},
                {"six", "6"}, {"seven", "7"}, {"eight", "8"}, {"nine","9"}
        };
        for(String[] strings : str){
            numbers = numbers.replaceAll(strings[0], strings[1]);
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}
//class Solution {
//    public long solution(String numbers) {
//
//        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//
//        for (int i = 0; i < numbers_arr.length; i++) {
//            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
//        }
//
//        long answer = Long.parseLong(numbers);
//        return answer;
//    }
//}