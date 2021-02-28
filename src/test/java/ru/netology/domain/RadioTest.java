package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void RadioTest() {
        Radio radio = new Radio();

    }
    @Test
    public void validateZeroValues() {
        Radio radio = new Radio();
        assertEquals( 0, radio.nowPlay);
        assertEquals(0, radio.minPlay);
        assertEquals(0, radio.maxPlay);
        assertFalse(radio.on);
        assertNull(radio.Name);

        System.out.println("hello");

    }

}