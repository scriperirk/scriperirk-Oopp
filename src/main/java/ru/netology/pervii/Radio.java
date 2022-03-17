package ru.netology.pervii;

public class Radio {

    private int radioStation;
    //увеличение на 1
    public int getRadioStationNext() {
        return radioStation;
    }

    public void currentRadioStationNext() {
        setRadioStationNext(radioStation);
    }

    public void setRadioStationNext(int newRadioStation) {
        if (newRadioStation < 10) {
            this.radioStation = newRadioStation + 1;
            return;
        } else {
            this.radioStation = 0;
            return;
        }
    }
    //уменьшение на 1
    public int getRadioStationPrev() {
        return radioStation;
    }

    public void currentRadioStationPrev() {
        setRadioStationPrev(radioStation);
    }
    public void setRadioStationPrev(int newRadioStation) {
        if (newRadioStation < 10 && newRadioStation > 0) {
            this.radioStation = newRadioStation - 1;
            return;
        } else {
            this.radioStation = 9;
            return;
        }
    }
}
