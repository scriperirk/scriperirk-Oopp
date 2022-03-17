package ru.netology.pervii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    //нажимаем next (0)
    @Test
    public void testNextOne(){
        Radio radioBox = new Radio();

        radioBox.setRadioStationNext(0);
        //radioBox.currentRadioStationNext();

        int expected = 0;
        int actual = radioBox.getRadioStationNext();

        assertEquals(expected,actual);

    }

    //нажимаем next (1)
    @Test
    public void testNextTwo(){
        Radio radioBox = new Radio();

        radioBox.setRadioStationNext(1);
        //radioBox.currentRadioStationNext();

        int expected = 2;
        int actual = radioBox.getRadioStationNext();

        assertEquals(expected,actual);

    }

    //нажимаем next (9)
    @Test
    public void testNextThree(){
        Radio radioBox = new Radio();

        radioBox.setRadioStationNext(9);
        //radioBox.currentRadioStationNext();

        int expected = 9;
        int actual = radioBox.getRadioStationNext();

        assertEquals(expected,actual);

    }

    //нажимаем next (10)
    @Test
    public void testNextFour(){
        Radio radioBox = new Radio();

        radioBox.setRadioStationNext(10);
        //radioBox.currentRadioStationNext();

        int expected = 0;
        int actual = radioBox.getRadioStationNext();

        assertEquals(expected,actual);

    }







    @Test //нажимаем prev
    public void testPrev(){
        Radio radioBox = new Radio();

        radioBox.setRadioStationPrev(0);
        //radioBox.currentRadioStationPrev();

        int expected = 9;
        int actual = radioBox.getRadioStationPrev();

        assertEquals(expected,actual);

    }

}