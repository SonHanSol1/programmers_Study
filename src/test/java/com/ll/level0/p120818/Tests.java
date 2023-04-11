package com.ll.level0.p120818;

// https://school.programmers.co.kr/learn/courses/30/lessons/120818
// 옷가게 할인 받기

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("150,000 => 142,500")
    void t1() {
        assertThat(new com.ll.level0.p120818.Solution().solution(150000)).isEqualTo(142500);
    }
}
