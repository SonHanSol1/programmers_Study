package com.ll.level0.p120822;

// https://school.programmers.co.kr/learn/courses/30/lessons/120822
// 문자열 뒤집기

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("jaron => noraj")
    void t1() {
        assertThat(new com.ll.level0.p120822.Solution().solution("jaron")).isEqualTo("noraj");
    }
}
