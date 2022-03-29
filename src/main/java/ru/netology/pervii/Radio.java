package ru.netology.pervii;

public class Radio {

    public int radioStation;
    public int radioVolume;

    //увеличение Станций
    public int getRadioStationNext() {
        return radioStation;
    }

    public void increaseNext() {
        setRadioStationNext(radioStation  + 1);
    }

    public void setRadioStationNext(int radioStation) {
         if (radioStation >= 0 && radioStation < 10) {
            this.radioStation = radioStation;
            return;
        }
        if (radioStation >= 10) {
            this.radioStation = 0;
        }
    }

    //уменьшение Станций
    public int getRadioStationPrev() {
        return radioStation;
    }

    public void increasePrev() {
        setRadioStationPrev(radioStation - 1);
    }

    public void setRadioStationPrev(int radioStation) {
        if (radioStation >= 0 && radioStation < 10) {
            this.radioStation = radioStation;
            return;
        }
        if (radioStation < 0) {
            this.radioStation = 9;
        }
    }

    //увеличение Громкости
    public int getRadioVolumeNext() {
        return radioVolume;
    }

    public void increaseVolumeNext() {
        setRadioVolumeNext(radioVolume + 1);
    }

    public void setRadioVolumeNext(int radioStation) {
        if (radioStation >= 0 && radioStation < 10) {
            this.radioVolume = radioStation;
            return;
        }
        if (radioStation >= 10) {
            this.radioVolume = 10;
        }
    }

    //уменьшение Громкости
    public int getRadioVolumePrev() {
        return radioVolume;
    }

    public void increaseVolumePrev() {
        setRadioVolumePrev(radioVolume - 1);
    }

    public void setRadioVolumePrev(int radioVolume) {
        if (radioVolume >= 0 && radioVolume < 10) {
            this.radioVolume = radioVolume;
            return;
        }
        if (radioVolume < 0) {
            this.radioVolume = 0;
        }
    }
}