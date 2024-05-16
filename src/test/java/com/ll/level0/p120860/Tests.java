package com.ll.level0.p120860;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120860
// 직사각형 넓이 구하기

public class Tests {
    @Test
    @DisplayName("[[1, 1], [2, 1], [2, 2], [1, 2]] => 1")
    void t1() {
        assertThat(new com.ll.level0.p120860.Solution().solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}})).isEqualTo(1);
    }
    @Test
    @DisplayName("[[-1, -1], [1, 1], [1, -1], [-1, 1]] => 4")
    void t2() {
        assertThat(new com.ll.level0.p120860.Solution().solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}})).isEqualTo(4);
    }

}
