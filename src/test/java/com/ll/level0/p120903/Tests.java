package com.ll.level0.p120903;

// https://school.programmers.co.kr/learn/courses/30/lessons/120903
// 배열의 유사도


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("['a', 'b', 'c'], ['com', 'b', 'd', 'p','c'] => 2")
    void t1() {
        assertThat(new com.ll.level0.p120903.Solution().solution(new String[] {"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"})).isEqualTo(2);
    }
}
