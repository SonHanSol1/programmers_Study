package com.ll.level0.p120840;

//https://school.programmers.co.kr/learn/courses/30/lessons/120840
// 구슬을 나누는 경우의 수

import javax.naming.Binding;
import java.math.BigInteger;

public class Main {

}
//class Solution {
//    public int solution(int balls, int share) {
//        int answer = 0;
//        BigInteger ballsFactorial = BigInteger.valueOf(1);
//        BigInteger shareFactorial = BigInteger.valueOf(1);
//        BigInteger minFactorial = BigInteger.valueOf(1);
//        for(int i = 1; i <= balls; i++){
//            ballsFactorial = ballsFactorial.multiply(BigInteger.valueOf(i));
//        }
//        for(int j = 1; j <= share; j++){
//            shareFactorial = shareFactorial.multiply(BigInteger.valueOf(j));
//        }
//        for(int k = 1; k <= balls-share; k++){
//            minFactorial = minFactorial.multiply(BigInteger.valueOf(k));
//        }
//        BigInteger temp = ballsFactorial.divide(minFactorial.multiply(shareFactorial));
//        answer = temp.intValue();
//        return answer;
//    }
//}
class Solution {
    public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
}
//class Solution {
//    public long solution(int balls, int share) {
//        long answer = 0;
//
//        int d = (balls - share) > share ? share : balls - share;
//        if (d == 0) return 1;
//
//        return solution(balls - 1, d - 1) * balls / d;
//    }
//
//}