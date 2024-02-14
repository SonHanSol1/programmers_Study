package com.ll.level0.p120890;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120890
// 가까운 수

public class Tests {
    @Test
    @DisplayName("[3, 10, 28], 20 => 28")
    void t1() {
        assertThat(new com.ll.level0.p120890.Solution().solution(new int[]{3, 10, 28}, 20)).isEqualTo(28);
    }
    @Test
    @DisplayName("[10, 11, 12], 13 => 12")
    void t2() {
        assertThat(new com.ll.level0.p120890.Solution().solution(new int[]{10, 11, 12}, 13)).isEqualTo(12);
    }
    @Test
    @DisplayName("[10, 11, 12, 40, 20, 14, 12, 10, 5, 8, 9, 90], 7 => 8")
    void t3() {
        assertThat(new com.ll.level0.p120890.Solution().solution(new int[]{10, 11, 12, 40, 20, 14, 12, 10, 5, 8, 9, 90}, 7)).isEqualTo(8);
    }
    @Test
    @DisplayName("[10, 11, 10, 10, 10], 10 => 10")
    void t4() {
        assertThat(new com.ll.level0.p120890.Solution().solution(new int[]{10, 11, 10, 10, 10}, 10)).isEqualTo(10);
    }
    @Test
    @DisplayName("[2, 4, 5], 3 => 2")
    void t5() {
        assertThat(new com.ll.level0.p120890.Solution().solution(new int[]{2, 4, 5}, 3)).isEqualTo(2);
    }

}
