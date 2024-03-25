package com.ll.level0.p120840;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120840
// 구슬을 나누는 경우의 수
public class Tests {
    @Test
    @DisplayName("3, 2 => 3")
    void t1() {
        assertThat(new com.ll.level0.p120840.Solution().solution(3, 2)).isEqualTo(3);
    }
    @Test
    @DisplayName("5, 3 => 10")
    void t2() {
        assertThat(new com.ll.level0.p120840.Solution().solution(5, 3)).isEqualTo(10);
    }

}
