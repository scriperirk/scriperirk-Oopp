package ru.netology.pervii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void test(){
        Radio radioBox = new Radio();
        radioBox.setRadioStation(0);

        radioBox.currentRadioStation();

        int expected = 15;
        int actual = radioBox.getRadioStation();

        assertEquals(expected,actual);

    }

}