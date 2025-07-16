package com.alaw810.ex4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FruitListTest {

    @Test
    void shouldMaintainInsertionOrder() {
        Fruit banana = new Fruit("Banana");
        Fruit watermelon = new Fruit("Watermelon");
        Fruit apple = new Fruit("Apple");

        List<Fruit> fruits = List.of(banana, watermelon, apple);

        assertThat(fruits).containsExactly(banana, watermelon, apple);
    }

    @Test
    void shouldContainFruitsRegardlessOfOrder() {
        Fruit banana = new Fruit("Banana");
        Fruit watermelon = new Fruit("Watermelon");
        Fruit apple = new Fruit("Apple");

        List<Fruit> fruits = List.of(banana, watermelon, apple);

        assertThat(fruits).containsExactlyInAnyOrder(apple, banana, watermelon);
    }

    @Test
    void shouldContainOnlyOnce() {
        Fruit banana = new Fruit("Banana");
        Fruit watermelon = new Fruit("Watermelon");
        Fruit apple = new Fruit("Apple");

        List<Fruit> fruits = List.of(banana, watermelon, apple);

        assertThat(fruits).containsOnlyOnce(watermelon);
    }

    @Test
    void shouldNotContainAbsentFruit() {
        Fruit banana = new Fruit("Banana");
        Fruit watermelon = new Fruit("Watermelon");
        Fruit apple = new Fruit("Apple");

        List<Fruit> fruits = List.of(banana, watermelon);

        assertThat(fruits).doesNotContain(apple);
    }

}
