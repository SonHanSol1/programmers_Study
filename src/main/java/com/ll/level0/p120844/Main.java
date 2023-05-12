package com.ll.level0.p120844;

// https://school.programmers.co.kr/learn/courses/30/lessons/120844
// 배열 회전시키기

public class Main {

}
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        // 오른쪽으로 회전할때
        if(direction.equals("right")){
            for(int i = 0; i<numbers.length-1; i++){
                // numbers의 마지막을 첫번쨰로 옮긴다
                answer[0] = numbers[numbers.length-1];
                answer[i+1] = numbers[i];
            }
        }
        // 왼쪽 회전할때
        else{
            for(int i = numbers.length-1; i>0; i--){
                // numbers의 첫번째를 마지막으로 옮긴다
                answer[numbers.length-1] = numbers[0];
                answer[i-1] = numbers[i];
            }
        }
        return answer;
    }
}
/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

 */