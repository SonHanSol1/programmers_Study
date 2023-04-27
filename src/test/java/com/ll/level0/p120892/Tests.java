package com.ll.level0.p120892;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120892
// 암호 해독
public class Tests {
    @Test
    @DisplayName("dfjardstddetckdaccccdegk, 4 => attack")
    void t1() {
        assertThat(new com.ll.level0.p120892.Solution().solution("dfjardstddetckdaccccdegk", 4)).isEqualTo("attack");
    }
}
