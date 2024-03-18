package com.ll.level0.p120868;

import com.ll.level0.p120868.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120868
// 삼각형의 완성조건(2)

public class Tests {
    @Test
    @DisplayName("[1, 2] => 1")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2})).isEqualTo(1);
    }
    @Test
    @DisplayName("[[3, 6] => 5")
    void t2() {
        assertThat(new Solution().solution(new int[]{3, 6})).isEqualTo(5);
    }
    @Test
    @DisplayName("[11, 7] => 13")
    void t3() {
        assertThat(new Solution().solution(new int[]{11, 7})).isEqualTo(13);
    }

}
