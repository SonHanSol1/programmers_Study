package com.ll.level0.p120848;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120848
// 팩토리얼
public class Tests {
    @Test
    @DisplayName("3628800 => 10")
    void t1() {
        assertThat(new com.ll.level0.p120848.Solution().solution(3628800)).isEqualTo(10);
    }
    @Test
    @DisplayName("7 => 3")
    void t2() {
        assertThat(new com.ll.level0.p120848.Solution().solution(7)).isEqualTo(3);
    }
    @Test
    @DisplayName("2 => 2")
    void t3() {
        assertThat(new com.ll.level0.p120848.Solution().solution(2)).isEqualTo(2);
    }
    @Test
    @DisplayName("1 => 1")
    void t4() {
        assertThat(new com.ll.level0.p120848.Solution().solution(1)).isEqualTo(1);
    }

}
