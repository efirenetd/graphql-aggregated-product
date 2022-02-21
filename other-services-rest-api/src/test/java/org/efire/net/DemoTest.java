package org.efire.net;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DemoTest {

    @Test
    void testString() {
        String s = "Jong";
        String s1 = "Jong";
        assertThat(s).isSameAs(s1);
    }

    @Test
    void testStringObject() {
        String s = "Jong";
        String s1 = new String("Jong");
        assertThat(s).isNotSameAs(s1);
    }
}
