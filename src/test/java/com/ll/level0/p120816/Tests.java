package com.ll.level0.p120816;
//https://school.programmers.co.kr/learn/courses/30/lessons/120816
// 피자 나눠 먹기 (3)

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("7, 10 => 2")
    void t1() {
        assertThat(new com.ll.level0.p120816.Solution().solution(7,10)).isEqualTo(2);
    }
    @Test
    @DisplayName("4, 12 => 3")
    void t2() {
        assertThat(new com.ll.level0.p120816.Solution().solution(4,12)).isEqualTo(3);
    }
}
