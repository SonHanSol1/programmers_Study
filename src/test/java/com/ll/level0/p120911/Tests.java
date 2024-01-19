package com.ll.level0.p120911;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120911
// 문자열 정렬하기 (2)

public class Tests {
    @Test
    @DisplayName("\"Bcad\" => \"abcd\"")
    void t1() {
        assertThat(new com.ll.level0.p120911.Solution().solution("Bcad")).isEqualTo("abcd");
    }
    @Test
    @DisplayName("\"heLLo\" => \"ehllo\"")
    void t2() {
        assertThat(new com.ll.level0.p120911.Solution().solution("heLLo")).isEqualTo("ehllo");
    }

}
