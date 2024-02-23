package com.ll.level0.p120896;

//https://school.programmers.co.kr/learn/courses/30/lessons/120896
// 한 번만 등장한 문자

import java.util.*;

public class Main {

}
//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        int j = 1;
//        char[] chS = s.toCharArray();
//        Arrays.sort(chS);
//        String str = new String(chS);
//        for(int i = 0; i <= str.length(); i++){
//            if(str.charAt(j-1)==str.charAt(j)){
//                str = str.replaceAll(String.valueOf(str.charAt(j)), "");
//                j = 1;
//            }
//            else if(j+1 < str.length()){
//                j++;
//            }
//        }
//        answer = str;
//        return answer;
//    }
//}
//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        String[] str = s.split("");
//        Arrays.sort(str);
//        for(String i : str){
//            int count = 0;
//            for(String j : str){
//                if(i.equals(j)){
//                    count++;
//                }
//            }
//            if(count==1){
//                answer += i;
//            }
//        }
//        return answer;
//    }
//}
class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> charMap = new HashMap();
        for(char c : chars){
            charMap.put(c, charMap.getOrDefault(c, 0) +1);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : charMap.keySet()){
            if( charMap.get(c) == 1){
                sb.append(c);
            }
        }
        char[] charArr = sb.toString().toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
