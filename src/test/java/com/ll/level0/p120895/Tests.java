package com.ll.level0.p120895;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120583
// 인덱스 바꾸기
public class Tests {
    @Test
    @DisplayName("\"hello\", 1, 2 => \"hlelo\"")
    void t1() {
        assertThat(new com.ll.level0.p120895.Solution().solution(
                "hello", 1, 2
        )).isEqualTo(
                "hlelo"
        );
    }
}
