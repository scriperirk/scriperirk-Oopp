package ru.netology.pervii;

public class Radio {

    private int radioStation;
    //увеличение на 1
    public int getRadioStationNext() {
        return radioStation;
    }


    public void setRadioStationNext(int newRadioStation) {
        if (newRadioStation < 9) {
            this.radioStation = newRadioStation + 1;
        } else {
            this.radioStation = 0;
        }
    }

    //уменьшение на 1
    public int getRadioStationPrev() {
        return radioStation;
    }

    public void setRadioStationPrev(int newRadioStation) {
        if (newRadioStation <= 0) {
            this.radioStation = 9;
        } else if(newRadioStation<10) {
            this.radioStation = newRadioStation - 1;
        }
    }
}
