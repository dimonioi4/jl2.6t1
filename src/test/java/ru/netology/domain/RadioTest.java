package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();




    @Test
    public void validateChangeNowVolume() {
        radio.setNowVolume(11);
        assertEquals(0, radio.getNowVolume());
    }

    @Test
    public void validateChangeNowPlay() {
        radio.setNowPlay(11);
        assertEquals(0, radio.getNowPlay());
    }
}