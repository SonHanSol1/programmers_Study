package com.ll.level0.p120852;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120583
// 중복된 숫자 개수
public class Tests {
    @Test
    @DisplayName("12 => [2, 3]")
    void t1() {
        assertThat(new com.ll.level0.p120852.Solution().solution(12)).isEqualTo(new int[] {2, 3});
    }
    @Test
    @DisplayName("17 => [17]")
    void t2() {
        assertThat(new com.ll.level0.p120852.Solution().solution(17)).isEqualTo(new int[] {17});
    }

}
