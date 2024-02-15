package com.ll.level0.p120835;

//https://school.programmers.co.kr/learn/courses/30/lessons/120835
// 진료 순서 정하기

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

}
//class Solution {
//    public int[] solution(int[] emergency) {
//        int[] answer = {};
//        answer = new int[emergency.length];
//        for(int i = 0; i < emergency.length; i++){
//            for(int j = 0; j < emergency.length; j++){
//                if(emergency[i] <= emergency[j]){
//                    answer[i]++;
//                }
//            }
//        }
//        return answer;
//    }
//}
class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] emergencySort = Arrays.copyOfRange(emergency, 0, emergency.length);
        Arrays.sort(emergencySort);
        int size = emergency.length;
        for(int i = 0; i<emergencySort.length; i++){
            int e = emergencySort[i];
            map.put(e, size-i);
        }
        for(int i = 0; i<emergency.length; i++){
            emergency[i] = map.get(emergency[i]);
        }
        return emergency;
    }
}
