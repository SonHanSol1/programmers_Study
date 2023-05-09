package com.ll.level0.p120862;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120862
// 최댓값 만들기 (2)

public class Tests {
    @Test
    @DisplayName("[1, 2, -3, 4, -5] => 15")
    void t1() {
        assertThat(new com.ll.level0.p120862.Solution().solution(new int[]{1, 2, -3, 4, -5})).isEqualTo(15);
    }
    @Test
    @DisplayName("[0, -31, 24, 10, 1, 9] => 240")
    void t2() {
        assertThat(new com.ll.level0.p120862.Solution().solution(new int[]{0, -31, 24, 10, 1, 9})).isEqualTo(240);
    }
}
