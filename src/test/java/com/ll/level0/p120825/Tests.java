package com.ll.level0.p120825;

// https://school.programmers.co.kr/learn/courses/30/lessons/120825
// 문자 반복 출력하기

import com.ll.level0.p120825.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("hello, 3 => hhheeellllllooo")
    void t1() {
        assertThat(new Solution().solution("hello", 3)).isEqualTo("hhheeellllllooo");
    }
}
