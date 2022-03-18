package ru.netology.pervii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
//радиостанции
    @Test
    public void testNextOne() {
        Radio radioBox = new Radio();

        radioBox.setRadioStationNext(0);
        radioBox.increaseNext();

        int expected = 1;
        int actual = radioBox.getRadioStationNext();

        assertEquals(expected, actual);

    }

    @Test
    public void testNextTwo() {
        Radio radioBox = new Radio();

        radioBox.setRadioStationNext(1);
        radioBox.increaseNext();

        int expected = 2;
        int actual = radioBox.getRadioStationNext();

        assertEquals(expected, actual);

    }

    @Test
    public void testNextThree() {
        Radio radioBox = new Radio();

        radioBox.setRadioStationNext(8);
        radioBox.increaseNext();

        int expected = 9;
        int actual = radioBox.getRadioStationNext();

        assertEquals(expected, actual);

    }

    @Test
    public void testNextFour() {
        Radio radioBox = new Radio();

        radioBox.setRadioStationNext(9);
        radioBox.increaseNext();

        int expected = 0;
        int actual = radioBox.getRadioStationNext();

        assertEquals(expected, actual);

    }

    @Test
    public void testPrevOne() {
        Radio radioBox = new Radio();

        radioBox.setRadioStationPrev(9);
        radioBox.increasePrev();

        int expected = 8;
        int actual = radioBox.getRadioStationPrev();

        assertEquals(expected, actual);

    }

    @Test
    public void testPrevTwo() {
        Radio radioBox = new Radio();

        radioBox.setRadioStationPrev(8);
        radioBox.increasePrev();

        int expected = 7;
        int actual = radioBox.getRadioStationPrev();

        assertEquals(expected, actual);

    }

    @Test
    public void testPrevThree() {
        Radio radioBox = new Radio();

        radioBox.setRadioStationPrev(1);
        radioBox.increasePrev();

        int expected = 0;
        int actual = radioBox.getRadioStationPrev();

        assertEquals(expected, actual);

    }

    @Test
    public void testPrevFour() {
        Radio radioBox = new Radio();

        radioBox.setRadioStationPrev(0);
        radioBox.increasePrev();

        int expected = 9;
        int actual = radioBox.getRadioStationPrev();

        assertEquals(expected, actual);

    }
//громкость
    @Test
    public void testVolumeNextOne() {
        Radio radioBox = new Radio();

        radioBox.setRadioVolumeNext(10);
        radioBox.increaseVolumeNext();

        int expected = 10;
        int actual = radioBox.getRadioVolumeNext();

        assertEquals(expected, actual);

    }

    @Test
    public void testVolumeNextTwo() {
        Radio radioBox = new Radio();

        radioBox.setRadioVolumeNext(9);
        radioBox.increaseVolumeNext();

        int expected = 10;
        int actual = radioBox.getRadioVolumeNext();

        assertEquals(expected, actual);

    }

    @Test
    public void testVolumeNextThree() {
        Radio radioBox = new Radio();

        radioBox.setRadioVolumeNext(0);
        radioBox.increaseVolumeNext();

        int expected = 1;
        int actual = radioBox.getRadioVolumeNext();

        assertEquals(expected, actual);

    }

    @Test
    public void testVolumeNextFour() {
        Radio radioBox = new Radio();

        radioBox.setRadioVolumeNext(1);
        radioBox.increaseVolumeNext();

        int expected = 2;
        int actual = radioBox.getRadioVolumeNext();

        assertEquals(expected, actual);

    }

    @Test
    public void testVolumePrevOne() {
        Radio radioBox = new Radio();

        radioBox.setRadioVolumePrev(10);
        radioBox.increaseVolumePrev();

        int expected = 9;
        int actual = radioBox.getRadioVolumePrev();

        assertEquals(expected, actual);

    }

    @Test
    public void testVolumePrevTwo() {
        Radio radioBox = new Radio();

        radioBox.setRadioVolumePrev(9);
        radioBox.increaseVolumePrev();

        int expected = 8;
        int actual = radioBox.getRadioVolumePrev();

        assertEquals(expected, actual);

    }

    @Test
    public void testVolumePrevThree() {
        Radio radioBox = new Radio();

        radioBox.setRadioVolumePrev(1);
        radioBox.increaseVolumePrev();

        int expected = 0;
        int actual = radioBox.getRadioVolumePrev();

        assertEquals(expected, actual);

    }

    @Test
    public void testVolumePrevFour() {
        Radio radioBox = new Radio();

        radioBox.setRadioVolumePrev(0);
        radioBox.increaseVolumePrev();

        int expected = 0;
        int actual = radioBox.getRadioVolumePrev();

        assertEquals(expected, actual);

    }
}