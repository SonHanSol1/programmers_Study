package com.ll.level0.p120891;

import com.ll.level0.p120891.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120891
// 369게임

public class Tests {
    @Test
    @DisplayName("3 => 1")
    void t1() {
        assertThat(new Solution().solution(3)).isEqualTo(1);
    }
    @Test
    @DisplayName("29423 => 2")
    void t2() {
        assertThat(new Solution().solution(29423)).isEqualTo(2);
    }

    @Test
    @DisplayName("303 => 2")
    void t3() {
        assertThat(new Solution().solution(303)).isEqualTo(2);
    }

}
