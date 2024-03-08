package com.ll.level0.p120852;

//https://school.programmers.co.kr/learn/courses/30/lessons/120852
// 소인수분해

import java.util.*;

public class Main {

}
//class Solution {
//    public int[] solution(int n) {
//        int[] answer = {};
//        Set<Integer> set = new HashSet<>();
//        int j = 2;
//        while(n!=1){
//            if(n%j==0) {
//                set.add(j);
//                n /= j;
//            } else{
//                j++;
//            }
//        }
//        answer = new int[set.size()];
//        Iterator<Integer> it = set.iterator();
//        for(int i = 0; i< answer.length; i++){
//            answer[i] = it.next();
//        }
//        Arrays.sort(answer);
//        return answer;
//    }
//}

class Solution {
    public int[] solution(int n) {
        LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
        int[] answer;
        int i = 2;
        while (n != 0 && i <= n) {
            if (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        answer = primeNumbers.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
