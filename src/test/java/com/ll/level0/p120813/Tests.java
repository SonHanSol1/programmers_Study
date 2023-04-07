package com.ll.level0.p120813;

// https://school.programmers.co.kr/learn/courses/30/lessons/120813
// 짝수는 싫어요

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10 => [1,3,5,7,9]")
    void t1() {
        assertThat(new com.ll.level0.p120813.Solution().solution(10)).isEqualTo(new int[]{1,3,5,7,9});
    }
}
