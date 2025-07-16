package com.alaw810.ex1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerAssertionTest {

    @Test
    void integersShouldBeEqual() {
        Integer a = 16;
        Integer b = 16;

        assertThat(a).isEqualTo(b);
    }

    @Test
    void integersShouldNotBeEqual() {
        Integer a = 16;
        Integer b = 17;

        assertThat(a).isNotEqualTo(b);
    }
}