package com.ll.level0.p120841;
//https://school.programmers.co.kr/learn/courses/30/lessons/120841
// 점의 위치 구하기

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("[2, 4] => 1")
    void t1() {
        assertThat(new Solution().solution(new int[]{2, 4})).isEqualTo(1);
    }
    @Test
    @DisplayName("[-7, 9] => 2")
    void t2() {
        assertThat(new Solution().solution(new int[]{-7, 9})).isEqualTo(2);
    }
    @Test
    @DisplayName("[-10, -2] => 3")
    void t3() {
        assertThat(new Solution().solution(new int[]{-10, -2})).isEqualTo(3);
    }
    @Test
    @DisplayName("[10, -22] => 4")
    void t4() {
        assertThat(new Solution().solution(new int[]{10, -22})).isEqualTo(4);
    }

}
