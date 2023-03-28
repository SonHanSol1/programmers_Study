package com.ll.level0.p120889;

// https://school.programmers.co.kr/learn/courses/30/lessons/120889
// 삼각형의 완성조건 (1)


import com.ll.level0.p120889.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("5500 => [1, 0]")
    void t1() {
        assertThat(new Solution().solution(new int[] {1,2,3})).isEqualTo(2);
    }
}
