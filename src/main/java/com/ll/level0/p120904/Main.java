package com.ll.level0.p120904;

//https://school.programmers.co.kr/learn/courses/30/lessons/120904
// 숫자 찾기

public class Main {

}
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numStr= Integer.toString(num);
        String kStr = Integer.toString(k);
        answer = numStr.indexOf(kStr);
        if(answer>0)
        {
            answer += 1;
        }
        return answer;
//        return ("-" + num).indexOf(String.valueOf(k));
        /*
        num 앞에 문자 "-"를 추가해서 0번째가 아닌 1번째부터 찾게 한다.
        indexOf는 찾는 것이 없으면 -1을 반환하게 되어있다.
         */
    }
}