package com.ll.level0.p120909;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120909
// 제곱수 판별하기

public class Tests {
    @Test
    @DisplayName("144 => 1")
    void t1() {
        assertThat(new com.ll.level0.p120909.Solution().solution(144)).isEqualTo(1);
    }
}
