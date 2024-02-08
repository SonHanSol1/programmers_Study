package com.ll.level0.p120864;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120864
// 숨어있는 숫자의 덧셈 (2)

public class Tests {
    @Test
    @DisplayName("\"aAb1B2cC34oOp\" => 37")
    void t1() {
        assertThat(new com.ll.level0.p120864.Solution().solution("aAb1B2cC34oOp")).isEqualTo(37);
    }
    @Test
    @DisplayName("\"1a2b3c4d123Z\" => 133")
    void t2() {
        assertThat(new com.ll.level0.p120864.Solution().solution("1a2b3c4d123Z")).isEqualTo(133);
    }

}
