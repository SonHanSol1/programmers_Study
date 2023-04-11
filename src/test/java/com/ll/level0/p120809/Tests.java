package com.ll.level0.p120809;

// https://school.programmers.co.kr/learn/courses/30/lessons/120809
// 배열 두배 만들기

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[1, 2, 3, 4, 5] => [2, 4, 6, 8, 10]")
    void t1() {
        assertThat(new com.ll.level0.p120809.Solution().solution(new int[] {1, 2, 3, 4, 5})).isEqualTo(new int[]{2, 4, 6, 8, 10});
    }
}
