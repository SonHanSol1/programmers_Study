package com.ll.level0.p120906;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    @Test
    @DisplayName("1234 입력되었을 때의 결과는 10")
    void t1() {
        assertThat(new Solution().solution(1234)).isEqualTo(10);
    }

    @Test
    @DisplayName("930211 입력되었을 때의 결과는 16")
    void t2() {
        assertThat(new Solution().solution(930211)).isEqualTo(16);
    }

    @Test
    @DisplayName("543가 입력되었을 때의 결과는 12")
    void t3() {
        assertThat(new Solution().solution(543)).isEqualTo(12);
    }

    @Test
    @DisplayName("180도가 입력되었을 때의 결과는 4")
    void t4() {
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }

    @Test
    @DisplayName("90도가 입력되었을 때의 결과는 2")
    void t5() {
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }
}

