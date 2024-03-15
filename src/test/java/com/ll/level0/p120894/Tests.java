package com.ll.level0.p120894;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120894
// 영어가 싫어요

public class Tests {
    @Test
    @DisplayName("\"onetwothreefourfivesixseveneightnine\" => 123456789")
    void t1() {
        assertThat(new com.ll.level0.p120894.Solution().solution("onetwothreefourfivesixseveneightnine")).isEqualTo(123456789);
    }
    @Test
    @DisplayName("\"onefourzerosixseven\" => 14067")
    void t2() {
        assertThat(new com.ll.level0.p120894.Solution().solution("onefourzerosixseven")).isEqualTo(14067);
    }

}
