package com.ll.level0.p120897;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120897
// 약수 구하기

public class Tests {
    @Test
    @DisplayName("24 => [1, 2, 3, 4, 6, 8, 12, 24]")
    void t1() {
        assertThat(new Solution().solution(24)).isEqualTo(new int[] {1, 2, 3, 4, 6, 8, 12, 24});
    }

    @Test
    @DisplayName("29 => [1, 29]")
    void t2() {
        assertThat(new Solution().solution(29)).isEqualTo(new int[] {1, 29});
    }


}
