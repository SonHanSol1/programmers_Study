package com.ll.level0.p120838;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120838
// 모스부호 (1)

public class Tests {
    @Test
    @DisplayName("\".... . .-.. .-.. ---\" => \"hello\"")
    void t1() {
        assertThat(new Solution().solution(".... . .-.. .-.. ---")).isEqualTo("hello");
    }
    @Test
    @DisplayName("\".--. -.-- - .... --- -.\" => \"python\"")
    void t2() {
        assertThat(new Solution().solution(".--. -.-- - .... --- -.")).isEqualTo("python");
    }

}
