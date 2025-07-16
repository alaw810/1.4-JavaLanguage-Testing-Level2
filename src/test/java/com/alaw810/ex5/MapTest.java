package com.alaw810.ex5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapTest {

    @Test
    void shouldContainSpecificKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Adrià", 32);
        map.put("Olga", 29);

        assertThat(map).containsKey("Olga");
    }
}
