package com.ll.level0.p120851;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120851
// 숨어있는 숫자의 덧셈 (1)

public class Tests {
    @Test
    @DisplayName("aAb1B2cC34oOp, 1 => 10")
    void t1() {
        assertThat(new com.ll.level0.p120851.Solution().solution("aAb1B2cC34oOp")).isEqualTo(10);
    }
}
