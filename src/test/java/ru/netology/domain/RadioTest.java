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


    @Test
    public void shouldRadioStationMax() {
        assertEquals(9, radio.getMaxStation());
    }



    @Test
    public void shouldRadioStationOverMax() {
        radio.setMaxStation(10);
        assertEquals(10, radio.getMaxStation());
    }


    @Test
    public void shouldRadioStationOverMin() {
        radio.setNowPlay(-3);
        assertEquals(0, radio.getMinStation());
    }




    @Test
    public void shouldVolumeDown() {
        radio.getNowVolume();
        assertEquals(0, radio.getNowVolume());
    }




    @Test
    public void shouldSetNowVolume() {
        radio.setNowVolume(5);
        assertEquals(5, radio.getNowVolume());
    }


    @Test
    public void shouldSetNowVolumeNegative() {
        radio.setNowVolume(-1);
        assertEquals(0, radio.getNowVolume());
    }


}
