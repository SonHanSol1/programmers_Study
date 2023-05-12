package com.ll.level0.p120844;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120844
// 배열 회전시키기

public class Tests {
    @Test
    @DisplayName("[1, 2, 3], \"right\" => [3, 1, 2]")
    void t1() {
        assertThat(new com.ll.level0.p120844.Solution().solution(
                new int[]{1, 2, 3}, "right"
        )).isEqualTo(
                new int[] {3, 1, 2}
        );
    }
    @Test
    @DisplayName("[1, 2, 3], \"left\" => [2, 3, 1]")
    void t2() {
        assertThat(new com.ll.level0.p120844.Solution().solution(
                new int[]{1, 2, 3}, "left"
        )).isEqualTo(
                new int[] {2, 3, 1}
        );
    }
}
