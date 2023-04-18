package com.ll.level0.p120837;

//https://school.programmers.co.kr/learn/courses/30/lessons/120837
// 개미 군단

public class Main {

}
class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp != 0){
            if(5 <= hp){
                answer = hp / 5;
                hp = hp % 5;
            }
            if(5 > hp && 3 <= hp){
                answer += (hp / 3);
                hp = hp % 3;
            }
            else{
                answer += (hp / 1);
                hp = hp % 1;
            }
        }
        return answer;
    }
}


//class Solution {
//    public int solution(int hp) {
//        int answer = hp / 5;
//        hp %= 5;
//
//        answer += hp / 3;
//        hp %= 3;
//
//        answer += hp / 1;
//
//        return answer;
//    }
//}
