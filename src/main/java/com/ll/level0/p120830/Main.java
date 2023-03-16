package com.ll.level0.p120830;
//https://school.programmers.co.kr/learn/courses/30/lessons/120830
public class Main {
    public static void main(String[] args){

    }
}
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int discount= 0;
        if(n >= 10)
        {
            discount = n/10;
            k = k - discount;
        }

        return answer = n * 12000 + k * 2000;
    }
}