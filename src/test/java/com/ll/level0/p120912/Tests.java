package com.ll.level0.p120912;

import com.ll.level0.p120912.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120912
// 7의 개수

public class Tests {
    @Test
    @DisplayName("[7, 77, 17] => 2")
    void t1() {
        assertThat(new Solution().solution(new int[]{7, 77, 17})).isEqualTo(4);
    }
    @Test
    @DisplayName("[10, 29] => 0")
    void t2() {
        assertThat(new Solution().solution(new int[]{10, 29})).isEqualTo(0);
    }

}
