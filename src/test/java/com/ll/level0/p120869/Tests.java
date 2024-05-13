package com.ll.level0.p120869;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120869
// 외계어 사전

public class Tests {
    @Test
    @DisplayName("[\"p\", \"o\", \"s\"], [\"sod\", \"eocd\", \"qixm\", \"adio\", \"soo\"] => 2")
    void t1() {
        assertThat(new com.ll.level0.p120869.Solution().solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"})).isEqualTo(2);
    }
    @Test
    @DisplayName("[\"z\", \"d\", \"x\"], [\"def\", \"dww\", \"dzx\", \"loveaw\"] => 1")
    void t2() {
        assertThat(new com.ll.level0.p120869.Solution().solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"})).isEqualTo(1);
    }
    @Test
    @DisplayName("[\"p\", \"o\", \"s\"], [\"sod\", \"eocd\", \"qixm\", \"apio\", \"soo\"] => 2")
    void t3() {
        assertThat(new com.ll.level0.p120869.Solution().solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "apio", "soo"})).isEqualTo(2);
    }

}

