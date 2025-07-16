package com.alaw810.ex6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class ExceptionThrowerTest {

    @Test
    void shouldThrowArrayIndexOutOfBoundsException() {
        ExceptionThrower thrower = new ExceptionThrower();

        assertThatThrownBy(() -> thrower.triggerException())
                .isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }

}
