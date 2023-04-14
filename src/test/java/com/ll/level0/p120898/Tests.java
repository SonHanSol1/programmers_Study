package com.ll.level0.p120898;

// https://school.programmers.co.kr/learn/courses/30/lessons/120898
// 편지

import com.ll.level0.p120898.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("happy birthday! => 30")
    void t1() {
        assertThat(new Solution().solution("happy birthday!")).isEqualTo(30);
    }
}
