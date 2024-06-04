package com.ll.level0.p120878;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120878
// 유한소수 판별하기

public class Tests {
    @Test
    @DisplayName("7, 20 => 1")
    void t1() {
        assertThat(new com.ll.level0.p120878.Solution().solution(7, 20)).isEqualTo(1);
    }
    @Test
    @DisplayName("11, 22 => 1")
    void t2() {
        assertThat(new com.ll.level0.p120878.Solution().solution(11, 22)).isEqualTo(1);
    }
    @Test
    @DisplayName("12, 21 => 2")
    void t3() {
        assertThat(new com.ll.level0.p120878.Solution().solution(12, 21)).isEqualTo(2);
    }
    @Test
    @DisplayName("3, 9 => 2")
    void t4() {
        assertThat(new com.ll.level0.p120878.Solution().solution(3, 9)).isEqualTo(2);
    }
    @Test
    @DisplayName("3500, 500 => 1")
    void t5() {
        assertThat(new com.ll.level0.p120878.Solution().solution(3500, 500)).isEqualTo(1);
    }
    @Test
    @DisplayName("1, 12 => 2")
    void t6() {
        assertThat(new com.ll.level0.p120878.Solution().solution(1, 12)).isEqualTo(2);
    }

}
