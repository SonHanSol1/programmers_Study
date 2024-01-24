package com.ll.level0.p120888;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120888
// 중복된 문자 제거
public class Tests {
    @Test
    @DisplayName("\"people\" => \"peol\"")
    void t1() {
        assertThat(new com.ll.level0.p120888.Solution().solution("people")).isEqualTo("peol");
    }
    @Test
    @DisplayName("\"We are the world\" => \"We arthwold\"")
    void t2() {
        assertThat(new com.ll.level0.p120888.Solution().solution("We are the world")).isEqualTo("We arthwold");
    }

}
