package com.ll.level0.p120835;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120835
// 진료 순서 정하기

public class Tests {
    @Test
    @DisplayName("[3, 76, 24] => [3, 1, 2]")
    void t1() {
        assertThat(new Solution().solution(new int[]{3, 76, 24})).isEqualTo(new int[]{3, 1, 2});
    }
    @Test
    @DisplayName("[1, 2, 3, 4, 5, 6, 7] => [7, 6, 5, 4, 3, 2, 1]")
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7})).isEqualTo(new int[]{7, 6, 5, 4, 3, 2, 1});
    }

}
