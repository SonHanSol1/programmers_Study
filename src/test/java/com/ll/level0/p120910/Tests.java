package com.ll.level0.p120910;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120910
// 세균 증식

public class Tests {
    @Test
    @DisplayName("[2, 10 => 2048")
    void t1() {
        assertThat(new com.ll.level0.p120910.Solution().solution(2,10)).isEqualTo(2048);
    }
}
