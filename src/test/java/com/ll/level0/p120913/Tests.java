package com.ll.level0.p120913;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//https://school.programmers.co.kr/learn/courses/30/lessons/120913
// 잘라서 배열로 저장하기

public class Tests {
    @Test
    @DisplayName("\"abc1Addfggg4556b\", 6 => [\"abc1Ad\", \"dfggg4\", \"556b\"]")
    void t1() {
        assertThat(new com.ll.level0.p120913.Solution().solution("abc1Addfggg4556b"	, 6)).isEqualTo(new String[]{"abc1Ad", "dfggg4", "556b"});
    }
    @Test
    @DisplayName("\"abcdef123\", 3=> [\"abc\", \"def\", \"123\"]")
    void t2() {
        assertThat(new com.ll.level0.p120913.Solution().solution("abcdef123", 3)).isEqualTo(new String[]{"abc", "def", "123"});
    }

}
