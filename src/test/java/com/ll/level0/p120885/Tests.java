package com.ll.level0.p120885;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120885
// 이진수 더하기

public class Tests {
    @Test
    @DisplayName("\"10\", \"11\" => \"101\"")
    void t1() {
        assertThat(new com.ll.level0.p120885.Solution().solution("10", "11")).isEqualTo("101");
    }
    @Test
    @DisplayName("\"1001\", \"1111\" => \"11000\"")
    void t2() {
        assertThat(new com.ll.level0.p120885.Solution().solution("1001",	"1111")).isEqualTo("11000");
    }

}
