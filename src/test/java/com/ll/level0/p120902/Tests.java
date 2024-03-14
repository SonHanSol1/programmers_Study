package com.ll.level0.p120902;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120902
// 문자열 계산하기

public class Tests {
    @Test
    @DisplayName("\"3 + 4\" => 7")
    void t1() {
        assertThat(new com.ll.level0.p120902.Solution().solution("3 + 4")).isEqualTo(7);
    }
    @Test
    @DisplayName("\"10 - 5 - 2\" => 3")
    void t2() {
        assertThat(new com.ll.level0.p120902.Solution().solution("10 - 5 - 2")).isEqualTo(3);
    }

}
