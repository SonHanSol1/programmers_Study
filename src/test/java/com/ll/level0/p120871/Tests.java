package com.ll.level0.p120871;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120871
// 저주의 숫자 3

public class Tests {
    @Test
    @DisplayName("15 => 25")
    void t1() {
        assertThat(new com.ll.level0.p120871.Solution().solution(15)).isEqualTo(25);
    }
    @Test
    @DisplayName("40 => 76")
    void t2() {
        assertThat(new com.ll.level0.p120871.Solution().solution(40)).isEqualTo(76);
    }
    @Test
    @DisplayName("73 => 140")
    void t3() {
        assertThat(new com.ll.level0.p120871.Solution().solution(73)).isEqualTo(140);
    }

}
