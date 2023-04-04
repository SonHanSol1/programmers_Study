package com.ll.level0.p120836;

// https://school.programmers.co.kr/learn/courses/30/lessons/120822
// 문자열 뒤집기

import com.ll.level0.p120836.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("20 => 6")
    void t1() {
        assertThat(new Solution().solution(20)).isEqualTo(6);
    }
}
