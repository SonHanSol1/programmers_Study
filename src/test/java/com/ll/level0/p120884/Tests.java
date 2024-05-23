package com.ll.level0.p120884;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120884
// 치킨 쿠폰

public class Tests {
    @Test
    @DisplayName("100 => 11")
    void t1() {
        assertThat(new com.ll.level0.p120884.Solution().solution(100)).isEqualTo(11);
    }
    @Test
    @DisplayName("1,081 => 120")
    void t2() {
        assertThat(new com.ll.level0.p120884.Solution().solution(1081)).isEqualTo(120);
    }

}
