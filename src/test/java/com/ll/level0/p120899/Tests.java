package com.ll.level0.p120899;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120899
// 가장 큰 수 찾기

public class Tests {
    @Test
    @DisplayName("[1, 8, 3] => [8, 1]")
    void t1() {
        assertThat(new com.ll.level0.p120899.Solution().solution(
                new int[]{1, 8, 3}
        )).isEqualTo(
                new int[]{8, 1}
        );
    }
}
