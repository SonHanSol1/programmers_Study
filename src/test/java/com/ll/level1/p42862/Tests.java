package com.ll.level1.p42862;

import com.ll.level1.p42862.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/42862
// 체육복
// 탐욕법

public class Tests {
    @Test
    @DisplayName("3, [3], [1] => 2")
    void t1() {
        assertThat(new Solution().solution(3, new int[]{3}, new int[]{1})).isEqualTo(2);
    }
    @Test
    @DisplayName("5, [2, 4], [1, 3, 5] => 5")
    void t2() {
        assertThat(new Solution().solution(5, new int[]{2,4}, new int[]{1, 3, 5})).isEqualTo(5);
    }


}
