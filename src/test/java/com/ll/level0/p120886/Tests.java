package com.ll.level0.p120886;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120886
// A로 B 만들기
public class Tests {
    @Test
    @DisplayName("\"olleh\",\"hello\" => 1")
    void t1() {
        assertThat(new com.ll.level0.p120886.Solution().solution("olleh","hello")).isEqualTo(1);
    }
    @Test
    @DisplayName("\"allpe\"\t\"apple\"\t => 0")
    void t2() {
        assertThat(new com.ll.level0.p120886.Solution().solution("allpe","apple"	)).isEqualTo(0);
    }

}
