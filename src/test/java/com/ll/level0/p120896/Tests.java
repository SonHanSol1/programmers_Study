package com.ll.level0.p120896;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120583
// 한 번만 등장한 문자

public class Tests {
    @Test
    @DisplayName("\"abcabcadc\" => \"d\"")
    void t1() {
        assertThat(new com.ll.level0.p120896.Solution().solution("abcabcadc")).isEqualTo("d");
    }
    @Test
    @DisplayName("\"abdc\" => \"abcd\"")
    void t2() {
        assertThat(new com.ll.level0.p120896.Solution().solution("abdc")).isEqualTo("abcd");
    }
    @Test
    @DisplayName("\"hello\" => \"eho\"")
    void t3() {
        assertThat(new com.ll.level0.p120896.Solution().solution("hello")).isEqualTo("eho");
    }
    @Test
    @DisplayName("\"aabbcc\" => \"\"")
    void t4() {
        assertThat(new com.ll.level0.p120896.Solution().solution("aabbcc")).isEqualTo("");
    }

}
