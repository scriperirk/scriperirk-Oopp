package ru.netology.pervii;

public class Radio {

    private int radioStation;

    //увеличение на 1
    public int getRadioStationNext() {
        return radioStation;
    }

    public void increaseNext() {
        setRadioStationNext(radioStation + 1);
    }

    public void setRadioStationNext(int newRadioStation) {
        if (newRadioStation >= 0 && newRadioStation < 10) {
            this.radioStation = newRadioStation;
            return;
        }
        if (newRadioStation >= 0 && newRadioStation < 11) {
            this.radioStation = 0;
            return;
        }
    }

    //уменьшение на 1
    public int getRadioStationPrev() {
        return radioStation;
    }

    public void increasePrev() {
        setRadioStationPrev(radioStation - 1);
    }

    public void setRadioStationPrev(int newRadioStation) {
        if (newRadioStation >= 0 && newRadioStation < 10) {
            this.radioStation = newRadioStation;
            return;
        }
        if (newRadioStation < 0) {
            this.radioStation = 9;
            return;
        }
    }
}