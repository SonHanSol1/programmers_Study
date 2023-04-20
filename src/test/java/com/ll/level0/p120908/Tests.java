package com.ll.level0.p120908;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120908
// 문자열안에 문자열
public class Tests {
    @Test
    @DisplayName("ab6CDE443fgh22iJKlmn1o, 6CD => 1")
    void t1() {
        assertThat(new com.ll.level0.p120908.Solution().solution("ab6CDE443fgh22iJKlmn1o", "6CD")).isEqualTo(1);
    }

    @Test
    @DisplayName("ab6CDE443fgh22iJKlmn1o, fsq => 2")
    void t2() {
        assertThat(new com.ll.level0.p120908.Solution().solution("ab6CDE443fgh22iJKlmn1o", "fsq")).isEqualTo(2);
    }
}
