package com.ll.level0.p120814;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("7=> 1")
    void t1() {
        assertThat(new com.ll.level0.p120814.Solution().solution(7)).isEqualTo(1);
    }
    @Test
    @DisplayName("1=> 1")
    void t2() {
        assertThat(new com.ll.level0.p120814.Solution().solution(1)).isEqualTo(1);
    }
    @Test
    @DisplayName("15=> 3")
    void t3() {
        assertThat(new com.ll.level0.p120814.Solution().solution(15)).isEqualTo(3);
    }
}
