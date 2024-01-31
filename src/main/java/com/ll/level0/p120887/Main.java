package com.ll.level0.p120887;

//https://school.programmers.co.kr/learn/courses/30/lessons/120887
// k의 개수

public class Main {

}
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int num = i; num <= j; num++) {
            str += num;
        }
        answer = str.length() - str.replace(k+"","").length();
        return answer;
    }
}
//class Solution {
//    public int solution(int i, int j, int k) {
//        int answer = 0;
//        for(int x = i; x<=j; x++)
//        {
//            String iStr = Integer.toString(x);
//            String kStr = Integer.toString(k);
//            char[] xChar = iStr.toCharArray();
//            char[] kChar = kStr.toCharArray();
//
//            for(char c : xChar)
//            {
//                if(c == kChar[0])
//                {
//                    answer++;
//                }
//            }
//
//        }
//        return answer;
//    }
//}
//class Solution {
//    public int solution(int i, int j, int k) {
//        String str = "";
//        for(int a = i; a <= j; a++) {
//            str += a+"";
//        }
//        return str.length() - str.replace(k+"", "").length();
//    }
//}
//class Solution {
//    public int solution(int i, int j, int k) {
//        int answer = 0;
//
//        for (int num = i; num <= j; num++){
//            int tmp = num;
//            while (tmp != 0){
//                if (tmp % 10 == k)
//                    answer++;
//                tmp /= 10;
//            }
//        }
//        return answer;
//    }
//}