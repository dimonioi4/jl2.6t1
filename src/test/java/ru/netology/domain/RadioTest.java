package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouSldRadioStationMin() {
        Radio radio = new Radio(0);
        assertEquals(0, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationMax() {
        Radio radio = new Radio(9);
        assertEquals(9, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationMiddle() {
        Radio radio = new Radio(5);
        assertEquals(5, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationOverMax() {
        Radio radio = new Radio(9);
        radio.setNowPlay ();
        assertEquals(9, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationOver() {
        Radio radio = new Radio(9);
        radio.setNowPlay();
        assertEquals(9, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationOverMin() {
        Radio radio = new Radio(0);
        radio.setNowPlay();
        assertEquals(0, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStation() {
        Radio radio = new Radio ();
        assertEquals(0, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationNext1() {
        Radio radio = new Radio(5);
        radio.nextStation();
        assertEquals(6, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationNext2() {
        Radio radio = new Radio(0);
        radio.nextStation();
        assertEquals(1, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationNext3() {
        Radio radio = new Radio(9);
        radio.nextStation();
        assertEquals(0, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationNext4() {
        Radio radio = new Radio(8);
        radio.nextStation();
        assertEquals(9, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationNext5() {
        Radio radio = new Radio(10);
        radio.nextStation();
        assertEquals(0, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationNext6() {
        Radio radio = new Radio(-1);
        radio.nextStation();
        assertEquals(0, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationPrev1() {
        Radio radio = new Radio(5);
        radio.prevStation();
        assertEquals(4, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationPrev2() {
        Radio radio = new Radio(0);
        radio.prevStation();
        assertEquals(9, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationPrev3() {
        Radio radio = new Radio(9);
        radio.prevStation();
        assertEquals(8, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationPrev4() {
        Radio radio = new Radio(10);
        radio.prevStation();
        assertEquals(9, radio.getNowPlay());
    }

    @Test
    public void shouldRadioStationPrev5() {
        Radio radio = new Radio(-1);
        radio.prevStation();
        assertEquals(9, radio.getNowPlay());
    }

    @Test
    public void shouldVolumeUp1() {
        Radio radio = new Radio(0, 10, 5);
        radio.increaseVolume();
        assertEquals(6, radio.getNowVolume());
    }

    @Test
    public void shouldVolumeUp2() {
        Radio radio = new Radio(0, 10, 0);
        radio.increaseVolume();
        assertEquals(1, radio.getNowVolume());
    }

    @Test
    public void shouldVolumeUp3() {
        Radio radio = new Radio(0, 10, 10);
        radio.increaseVolume();
        assertEquals(10, radio.getNowVolume());
    }

    @Test
    public void shouldVolumeUp4() {
        Radio radio = new Radio(0, 10, -1);
        radio.increaseVolume();
        assertEquals(-1, radio.getNowVolume());
    }

    @Test
    public void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getNowVolume());
    }

    @Test
    public void shouldVolumeDown1() {
        Radio radio = new Radio(0, 10, 5);
        radio.decreaseVolume();
        assertEquals(4, radio.getNowVolume());
    }

    @Test
    public void shouldVolumeDown2() {
        Radio radio = new Radio(0, 10, 0);
        radio.decreaseVolume();
        assertEquals(0, radio.getNowVolume());
    }

    @Test
    public void shouldVolumeDown3() {
        Radio radio = new Radio(0, 10, 10);
        radio.decreaseVolume();
        assertEquals(9, radio.getNowVolume());
    }

    @Test
    public void shouldVolumeDown4() {
        Radio radio = new Radio(0, 10, -1);
        radio.decreaseVolume();
        assertEquals(-1, radio.getNowVolume());
    }

    @Test
    public void shouldVolumeDown5() {
        Radio radio = new Radio(0, 10, 11);
        radio.decreaseVolume();
        assertEquals(11, radio.getNowVolume());
    }



    @Test
    public void shouldSetNowVolume() {
        Radio radio = new Radio();
        radio.setNowPlay();
        assertEquals(0, radio.getNowVolume());
    }

    @Test
    public void shouldSetNowVolume2() {
        Radio radio = new Radio();
        radio.setNowVolume(11);
        assertEquals(0, radio.getNowVolume());
    }

    @Test
    public void shouldSetNowVolume3() {
        Radio radio = new Radio();
        radio.setNowVolume(-1);
        assertEquals(0, radio.getNowVolume());
    }



}
