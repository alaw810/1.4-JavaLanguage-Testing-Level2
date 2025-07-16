package com.alaw810.ex3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayEqualityTest {

    @Test
    void arraysShouldBeIdentical() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = {1, 2, 3, 4, 5};

        assertThat(actual).containsExactly(expected);
    }
}
