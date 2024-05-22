package com.ll.level0.p120882;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120882
// 등수 매기기

public class Tests {
    @Test
    @DisplayName("[[80, 70], [90, 50], [40, 70], [50, 80]] => [1, 2, 4, 3]")
    void t1() {
        assertThat(new com.ll.level0.p120882.Solution().solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})).isEqualTo(new int[] {1, 2, 4, 3});
    }
    @Test
    @DisplayName("[0, 2, 3, 4], 1 => 0")
    void t2() {
        assertThat(new com.ll.level0.p120882.Solution().solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})).isEqualTo(new int[]{4, 4, 6, 2, 2, 1, 7});
    }

}
