package com.ll.level0.p120815;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120815
// 피자 나눠 먹기(2)
public class Tests {
    @Test
    @DisplayName("6 => 1")
    void t1() {
        assertThat(new Solution().solution(6)).isEqualTo(1);
    }

    @Test
    @DisplayName("10 => 5")
    void t2() {
        assertThat(new Solution().solution(10)).isEqualTo(5);
    }


}
