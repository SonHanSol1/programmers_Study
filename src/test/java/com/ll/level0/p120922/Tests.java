package com.ll.level0.p120922;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120922
// 종이 자르기

public class Tests {
    @Test
    @DisplayName("2, 2 => 3")
    void t1() {
        assertThat(new Solution().solution(2, 2)).isEqualTo(3);
    }
    @Test
    @DisplayName("2, 5 => 9")
    void t2() {
        assertThat(new Solution().solution(2, 5)).isEqualTo(9);
    }

}
