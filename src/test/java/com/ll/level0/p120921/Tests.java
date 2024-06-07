package com.ll.level0.p120921;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120921
// 문자열 밀기
public class Tests {
    @Test
    @DisplayName("\"hello\", \"ohell\"\t => 1")
    void t1() {
        assertThat(new com.ll.level0.p120921.Solution().solution("hello", "ohell"	)).isEqualTo(1);
    }
    @Test
    @DisplayName("\"apple\", \"elppa\"\t => -1")
    void t2() {
        assertThat(new com.ll.level0.p120921.Solution().solution("apple", "elppa")).isEqualTo(-1);
    }

}
