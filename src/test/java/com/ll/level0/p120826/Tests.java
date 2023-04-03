package com.ll.level0.p120826;

// https://school.programmers.co.kr/learn/courses/30/lessons/120826
// 특정 문자 제거하기

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("abcdef, f => abcde")
    void t1() {
        assertThat(new com.ll.level0.p120826.Solution().solution("abcdef", "f")).isEqualTo("abcde");
    }
}
