package com.ll.level0.p120854;

// https://school.programmers.co.kr/learn/courses/30/lessons/120854
// 배열 원소의 길이


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("['We', 'are', 'the', 'world!'] => [2, 3, 3, 6]")
    void t1() {
        assertThat(new com.ll.level0.p120854.Solution().solution(new String[] {"We", "are", "the", "world!"})).isEqualTo(new int[] {2, 3, 3, 6});
    }
}
