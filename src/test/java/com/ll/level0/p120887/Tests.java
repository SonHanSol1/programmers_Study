package com.ll.level0.p120887;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120583
// 중복된 숫자 개수
public class Tests {
    @Test
    @DisplayName("1, 13, 1 => 6")
    void t1() {
        assertThat(new com.ll.level0.p120887.Solution().solution(1, 13,1)).isEqualTo(6);
    }
    @Test
    @DisplayName("10, 50, 5 => 5")
    void t2() {
        assertThat(new com.ll.level0.p120887.Solution().solution(10,50,5)).isEqualTo(5);
    }
    @Test
    @DisplayName("3, 10, 2 => 0")
    void t3() {
        assertThat(new com.ll.level0.p120887.Solution().solution(3,10,2)).isEqualTo(0);
    }
    @Test
    @DisplayName("3, 10, 2 => 0")
    void t4() {
        assertThat(new com.ll.level0.p120887.Solution().solution(1, 100000, 1)).isEqualTo(60002);
    }

}
