package com.ll.level0.p120837;

//https://school.programmers.co.kr/learn/courses/30/lessons/120837
// 개미 군단

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("23 => 5")
    void t1() {
        assertThat(new com.ll.level0.p120837.Solution().solution(23)).isEqualTo(5);
    }
}
