package com.ll.level0.p120824;

// https://school.programmers.co.kr/learn/courses/30/lessons/120824
// 짝수 홀수 개수


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[1, 2, 3, 4, 5] => [2, 3]")
    void t1() {
        assertThat(new com.ll.level0.p120824.Solution().solution(new int[] {1, 2, 3, 4, 5})).isEqualTo(new int[] {2,3});
    }
}
