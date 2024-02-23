package org.example

import kotlin.test.*

class TestSuite {
    @Test
    public fun testA() {
        assertTrue(true)
    }

    @Test
    public fun testB() {
        assertFalse(false)
    }
}
