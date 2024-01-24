package com.ll.level0.p120888;

//https://school.programmers.co.kr/learn/courses/30/lessons/120888
// 중복된 문자 제거

import java.util.*;
import java.util.stream.IntStream;

public class Main {

}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        /*
         - indexOf() : 괄호 안에 값과 일치하는 값이 존재하는 위치를 구한다.
         - charAt() : 괄호 안에 있는 위치의 문자 추출
         1. my_string.indexOf(my_string.charAt(i))==i
         2. my_string.charAt(i) : i 위치의 문자를 추출한다
         3. my_string.indexOf : 여기서 charAt가 추출한 문자의 위치를 탐색
         4. 그렇기에 중복 되는 문자가 없으면 indexOf와 i의 수가 동일해야한다.
         5. false의 경우는 중복되는 문자의 경우 이미 탐색한 앞쪽의 indexOf 값이 나온다

         다른 활용법
        1. set 사용: 중복 불가한 성격을 활용
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
        return String.join("", set);

        2. stream 사용
        return Arrays.stream(myString.split("")).distinct().collect(Collectors.joining())
         */

        for(int i = 0; i<my_string.length(); i++)
        {
            if(my_string.indexOf(my_string.charAt(i))==i)
            {
                answer += my_string.charAt(i);
            }
        }
        return answer;

    }
}