package com.ll.level0.p120905;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120905
// n의 배수 고르기

public class Tests {
    @Test
    @DisplayName("3, [4, 5, 6, 7, 8, 9, 10, 11, 12] => [6, 9, 12]")
    void t1() {
        assertThat(new com.ll.level0.p120905.Solution().solution(
                3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}
        )).isEqualTo(
                new int[] {6, 9, 12}
        );
    }
}
