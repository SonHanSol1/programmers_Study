package com.ll.level0.p120886;

//https://school.programmers.co.kr/learn/courses/30/lessons/120886
// A로 B 만들기

import java.util.Arrays;

public class Main {

}
//class Solution {
//    public int solution(String before, String after) {
//        int answer = 0;
//        for(int i = 0; i < after.length(); i++)
//        {
//            if(before.indexOf(after.charAt(i)) != -1)
//            {
//                before = before.replaceFirst(after.charAt(i)+"", "");
//                answer = 1;
//            }
//            else
//            {
//                return 0;
//            }
//        }
//        return answer;
//    }
//class Solution {
//    public int solution(String before, String after) {
//        int answer = 0;
//        char[] a = before.toCharArray();
//        char[] b = after.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//        answer = new String(a).equals(new String(b)) ? 1:0;
//        return answer;
//    }
//}
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
       for(int i = 0; i < before.length(); i++)
       {
           after = after.replaceFirst(before.substring(i,i+1),"");
       }
       answer = after.isEmpty() ? 1:0;
        return answer;
    }
}