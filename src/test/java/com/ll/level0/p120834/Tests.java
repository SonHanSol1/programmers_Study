package com.ll.level0.p120834;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120834
// 외계행성의 나이

public class Tests {
    @Test
    @DisplayName("23 => \"cd\"")
    void t1() {
        assertThat(new com.ll.level0.p120834.Solution().solution(
                23
        )).isEqualTo(
                "cd"
        );
    }
}
