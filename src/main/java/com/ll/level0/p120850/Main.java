package com.ll.level0.p120850;

//https://school.programmers.co.kr/learn/courses/30/lessons/120850
// 문자열 정렬하기(1)

import java.util.Arrays;

public class Main {
}
class Solution{
    public int[] solution(String my_string){
        // "[^0-9]" 0~9를 제외한 나머지 숫자를 남긴다
        my_string = my_string.replaceAll("[^0-9]", "");
        // 숫자만 남은 my_string의 길이를 배열의 크기로 지정
        int[] answer = new int[my_string.length()];
        // answer[0]부터 숫자 추가
        for(int i = 0; i < my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0';
        }
        // 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}

/*
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String temp;
        List<Integer> list = new ArrayList<>();
        temp = my_string.replaceAll("[^0-9]", "");
        for(int i = 0; i < temp.length(); i++){
            list.add((int)temp.charAt(i)-'0');
        }
        answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
 */












