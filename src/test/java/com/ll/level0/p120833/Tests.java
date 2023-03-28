package com.ll.level0.p120833;

//https://school.programmers.co.kr/learn/courses/30/lessons/120833
// 배열 자르기

import com.ll.level0.p120833.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[1, 2, 3, 4, 5], 1, 3 => [2,3,4]")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5},1,3)).isEqualTo(new int[] {2,3,4});
    }
}
