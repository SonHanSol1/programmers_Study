package com.ll.level0.p120869;

//https://school.programmers.co.kr/learn/courses/30/lessons/120869
// 외계어 사전

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

}
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String works : dic) {
            int count = 0;
            for (String spellStr : spell) {
                if (works.contains(spellStr)) {
                    count++;
                }
                if(count==spell.length){
                    return 1;
                }
            }
        }
        return answer;
    }
}
//class Solution {
//    public int solution(String[] spell, String[] dic) {
//        int answer = 2;
//
//
//        for(String dicS : dic) {
//
//            boolean isRight = true;
//            for(String spellS : spell) {
//                if(dicS.indexOf(spellS) == -1) {
//                    isRight = false;
//                    break;
//                }
//            }
//
//            if(isRight) {
//                answer = 1;
//                break;
//            }
//        }
//
//        return answer;
//    }
//}
