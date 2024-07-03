package com.ll.level0.p120880;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120880
// 특이한 정렬

public class Tests {
    @Test
    @DisplayName("[1, 2, 3, 4, 5, 6], 4 => [4, 5, 3, 6, 2, 1]")
    void t1() {
        assertThat(new com.ll.level0.p120880.Solution().solution(new int[]{1, 2, 3, 4, 5, 6}, 4)).isEqualTo(new int[]{4, 5, 3, 6, 2, 1});
    }
    @Test
    @DisplayName("[10000,20,36,47,40,6,10,7000]\t, 30 => [36, 40, 20, 47, 10, 6, 7000, 10000]")
    void t2() {
        assertThat(new com.ll.level0.p120880.Solution().solution(new int[]{10000,20,36,47,40,6,10,7000}, 30)).isEqualTo(new int[]{36, 40, 20, 47, 10, 6, 7000, 10000});
    }

}
