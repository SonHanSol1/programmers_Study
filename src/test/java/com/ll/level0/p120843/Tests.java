package com.ll.level0.p120843;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120843
// 공 던지기

public class Tests {
    @Test
    @DisplayName("[1, 2, 3, 4], 2 => 3")
    void t1() {
        assertThat(new com.ll.level0.p120843.Solution().solution(new int[]{1, 2, 3, 4}, 2)).isEqualTo(3);
    }
    @Test
    @DisplayName("[1, 2, 3, 4, 5, 6], 5 => 3")
    void t2() {
        assertThat(new com.ll.level0.p120843.Solution().solution(new int[]{1, 2, 3, 4, 5, 6}, 5)).isEqualTo(3);
    }
    @Test
    @DisplayName("[1, 2, 3], 5 => 3")
    void t3() {
        assertThat(new com.ll.level0.p120843.Solution().solution(new int[]{1, 2, 3}, 5)).isEqualTo(3);
    }

}
