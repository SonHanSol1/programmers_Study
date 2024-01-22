package com.ll.level0.p120846;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120846
// 합성수 찾기

public class Tests {
    @Test
    @DisplayName("10=> 5")
    void t1() {
        assertThat(new com.ll.level0.p120846.Solution().solution(10)).isEqualTo(5);
    }
    @Test
    @DisplayName("15 => 8")
    void t2() {
        assertThat(new com.ll.level0.p120846.Solution().solution(15)).isEqualTo(8);
    }

}
