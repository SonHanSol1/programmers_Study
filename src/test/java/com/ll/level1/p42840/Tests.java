package com.ll.level1.p42840;

import com.ll.level1.p42840.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/42840
// 모의고사
// 완전탐색

public class Tests {
    @Test
    @DisplayName("[1,2,3,4,5] => 1")
    void t1() {
        assertThat(new Solution().solution(new int[]{1,2,3,4,5})).isEqualTo(1);
    }

}
