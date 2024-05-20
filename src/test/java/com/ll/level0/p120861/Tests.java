package com.ll.level0.p120861;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120861
// 캐릭터의 좌표

public class Tests {
    @Test
    @DisplayName("[[\"left\", \"right\", \"up\", \"right\", \"right\"], [11, 11] => [2, 1]")
    void t1() {
        assertThat(new com.ll.level0.p120861.Solution().solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})).isEqualTo(new int[]{2, 1});
    }
    @Test
    @DisplayName("[\"down\", \"down\", \"down\", \"down\", \"down\"]\t, [7, 9] => [0, -4]")
    void t2() {
        assertThat(new com.ll.level0.p120861.Solution().solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})).isEqualTo(new int[]{0, -4});
    }
    @Test
    @DisplayName("[\"right\", \"right\", \"right\", \"right\", \"right\", \"left\"], [9, 5] =>  [3, 0]")
    void t3() {
        assertThat(new com.ll.level0.p120861.Solution().solution(new String[]{"right", "right", "right", "right", "right", "left"}, new int[]{9, 5})).isEqualTo(new int[]{3, 0});
    }

}
