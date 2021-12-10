package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private final Radio radio = new Radio();


    @Test
    public void setIncreaseVolume() {
        radio.setMaxCurrentVolume(10);
        radio.setMinCurrentVolume(0);
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void setDecreaseVolume() {
        radio.setMaxCurrentVolume(10);
        radio.setMinCurrentVolume(0);
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

}