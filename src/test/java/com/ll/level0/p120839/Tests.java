package com.ll.level0.p120839;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120839
// 가위 바위 보

public class Tests {
    @Test
    @DisplayName(" '2' => '0' ")
    void t1() {
        assertThat(new com.ll.level0.p120839.Solution().solution("2")).isEqualTo("0");
    }
    @Test
    @DisplayName(" \"205\" => \"052\" ")
    void t2() {
        assertThat(new com.ll.level0.p120839.Solution().solution("205")).isEqualTo("052");
    }

}
