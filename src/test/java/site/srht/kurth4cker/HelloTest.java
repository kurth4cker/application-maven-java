// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    void bye() {
        String got;

        got = Hello.bye();
        assertEquals("bye world", got);

        got = Hello.bye("kurth4cker");
        assertEquals("bye kurth4cker", got);

        assertEquals(Hello.bye(), Hello.bye("world"));
    }

    @Test
    void greeting() {
        String got;

        got = Hello.greeting();
        assertEquals("hello world", got);

        got = Hello.greeting("kurth4cker");
        assertEquals("hello kurth4cker", got);

        assertEquals(Hello.greeting(), Hello.greeting("world"));
    }
}
