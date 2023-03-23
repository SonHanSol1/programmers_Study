package com.ll.level0.p120821;
//https://school.programmers.co.kr/learn/courses/30/lessons/120821
// 배열 뒤집기

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("[149, 180, 192, 170] => [170,192,180,149]")
    void t1() {
        assertThat(new com.ll.level0.p120821.Solution().solution(new int[]{149, 180, 192, 170})).isEqualTo(new int[]{170,192,180,149});
    }
}
