package com.ll.level0.p120831;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("4 => 6")
    void t1() {
        assertThat(new com.ll.level0.p120831.Solution().solution(4)).isEqualTo(6);
    }
    @Test
    @DisplayName("10 => 30")
    void t2() {
        assertThat(new com.ll.level0.p120831.Solution().solution(10)).isEqualTo(30);
    }
}