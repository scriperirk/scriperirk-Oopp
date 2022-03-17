package ru.netology.pervii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

/////next

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

        int expected = 0;
        int actual = radioBox.getRadioStationNext();

        assertEquals(expected,actual);

    }
/////next

/////prev

    @Test //нажимаем prev 0
    public void testPrevOne(){
        Radio radioBox = new Radio();

        radioBox.setRadioStationPrev(0);

        int expected = 9;
        int actual = radioBox.getRadioStationPrev();

        assertEquals(expected,actual);

    }

    @Test //нажимаем prev 1
    public void testPrevTwo(){
        Radio radioBox = new Radio();

        radioBox.setRadioStationPrev(1);

        int expected = 0;
        int actual = radioBox.getRadioStationPrev();

        assertEquals(expected,actual);

    }

    @Test //нажимаем prev 9
    public void testPrevThree(){
        Radio radioBox = new Radio();

        radioBox.setRadioStationPrev(9);
        //radioBox.currentRadioStationPrev();

        int expected = 8;
        int actual = radioBox.getRadioStationPrev();

        assertEquals(expected,actual);

    }

    @Test //нажимаем prev 8
    public void testPrevFour(){
        Radio radioBox = new Radio();

        radioBox.setRadioStationPrev(8);
        //radioBox.currentRadioStationPrev();

        int expected = 7;
        int actual = radioBox.getRadioStationPrev();

        assertEquals(expected,actual);

    }
}