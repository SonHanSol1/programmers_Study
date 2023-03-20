package com.ll.level0.p120811;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[1,2,7,10,11]=> 7")
    void t1() {
        assertThat(new com.ll.level0.p120811.Solution().solution(new int[]{1, 2, 7, 10, 11})).isEqualTo(7);
    }
    @Test
    @DisplayName("[9,-1,0]=> 0")
    void t2() {
        assertThat(new com.ll.level0.p120811.Solution().solution(new int[]{9, -1, 0})).isEqualTo(0);
    }
}