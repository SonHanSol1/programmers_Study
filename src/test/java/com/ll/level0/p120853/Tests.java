package com.ll.level0.p120853;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120853
// 컨트롤 제트

public class Tests {
    @Test
    @DisplayName("\"1 2 Z 3\" => 4")
    void t1() {
        assertThat(new Solution().solution("1 2 Z 3")).isEqualTo(4);
    }
    @Test
    @DisplayName("\"10 20 30 40\" => 100")
    void t2() {
        assertThat(new Solution().solution("10 20 30 40"	)).isEqualTo(100);
    }

}
