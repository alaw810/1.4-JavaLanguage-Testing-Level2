package com.alaw810.ex7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class OptionalTest {

    @Test
    void shouldBeEmpty() {
        Optional<String> emptyValue = Optional.empty();

        assertThat(emptyValue).isEmpty();
    }
}
