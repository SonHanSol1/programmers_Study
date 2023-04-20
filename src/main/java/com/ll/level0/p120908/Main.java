package com.ll.level0.p120908;

//https://school.programmers.co.kr/learn/courses/30/lessons/120908
// 문자열안에 문자열

public class Main {

}
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if((str1.contains(str2))){
            return 1;
        }
        answer = 2;
        return answer;
    }
}
//class Solution {
//    public int solution(String str1, String str2) {
//        int answer = 0;
//        String temp;
//        char ch;
//        temp = str1.replaceAll(str2, "1");
//        for(int i = 0; i < str1.length(); i++){
//            ch = temp.charAt(i);
//            if(ch == '1'){
//                return 1;
//            }
//        }
//        answer = 2;
//        return answer;
//    }
//}