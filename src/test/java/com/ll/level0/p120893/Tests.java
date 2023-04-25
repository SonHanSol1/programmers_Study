package com.ll.level0.p120893;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120893
// 대문자와 소문자

public class Tests {
    @Test
    @DisplayName("cccCCC => CCCccc")
    void t1() {
        assertThat(new com.ll.level0.p120893.Solution().solution("cccCCC")).isEqualTo("CCCccc");
    }
}
