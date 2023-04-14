package com.ll.level0.p120849;

// https://school.programmers.co.kr/learn/courses/30/lessons/120849
// 모음 제거

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("bus => bs")
    void t1() {
        assertThat(new com.ll.level0.p120849.Solution().solution("bus")).isEqualTo("bs");
    }
}
