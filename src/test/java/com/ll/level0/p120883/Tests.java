package com.ll.level0.p120883;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// https://school.programmers.co.kr/learn/courses/30/lessons/120883
// 로그인 성공?

public class Tests {
    @Test
    @DisplayName("id_pw : [[\"meosseugi\", \"1234\"], db : [[\"rardss\", \"123\"], [\"yyoom\", \"1234\"], [\"meosseugi\", \"1234\"]] => \"login\"")
    void t1() {
        assertThat(new com.ll.level0.p120883.Solution().solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}})).isEqualTo("login");
    }
    @Test
    @DisplayName("id_pw : [\"programmer01\", \"15789\"], db : [[\"programmer02\", \"111111\"], [\"programmer00\", \"134\"], [\"programmer01\", \"1145\"]] => \"wrong pw\"")
    void t2() {
        assertThat(new com.ll.level0.p120883.Solution().solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}})).isEqualTo("wrong pw");
    }
    @Test
    @DisplayName("id_pw : [\"rabbit04\", \"98761\"], db : [[\"jaja11\", \"98761\"], [\"krong0313\", \"29440\"], [\"rabbit00\", \"111333\"]] => \"fail\"")
    void t3() {
        assertThat(new com.ll.level0.p120883.Solution().solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}})).isEqualTo("fail");
    }

}
