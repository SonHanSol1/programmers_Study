package com.ll.level0.p120846;

//https://school.programmers.co.kr/learn/courses/30/lessons/120846
// 합성수 찾기

public class Main {

}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++)
        {
            int composite = 0;
            for(int j = 1; j<=i; j++)
            {
                if(i%j==0)
                {
                    composite++;
                }
            }
            if(composite >= 3)
            {
                answer++;
            }
        }
        return answer;
    }
}
// 아라토스테네스의 체 활용(기존 코드 복잡도 O(n^2) -> O(n log log n)
class Solution1 {
    public int solution(int n) {
        // n+1 크기의 boolean 배열을 생성하고 모두 false(소수라고 가정)로 초기화
        boolean[] isComposite = new boolean[n + 1];

        // 2부터 √n까지 반복
        for (int i = 2; i * i <= n; i++) {
            // i가 소수인 경우
            if (!isComposite[i]) {
                // i의 배수를 모두 합성수로 표시
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        // 합성수의 개수를 세는 변수
        int answer = 0;

        // 4부터 n까지 반복
        for (int i = 4; i <= n; i++) {
            // i가 합성수인 경우
            if (isComposite[i]) {
                // 합성수의 개수를 증가
                answer++;
            }
        }

        // 합성수의 개수를 반환
        return answer;
    }
}

