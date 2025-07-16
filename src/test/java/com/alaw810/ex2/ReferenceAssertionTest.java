package com.alaw810.ex2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReferenceAssertionTest {

    @Test
    void shouldBeSameReference() {
        Person sharedPerson = new Person("Adrià");

        Person person1 = sharedPerson;
        Person person2 = sharedPerson;

        assertThat(person1).isSameAs(person2);
    }

    @Test
    void shouldBeDifferentReference() {
        Person person1 = new Person("Adrià");
        Person person2 = new Person("Adrià");

        assertThat(person1).isNotSameAs(person2);
    }
}
