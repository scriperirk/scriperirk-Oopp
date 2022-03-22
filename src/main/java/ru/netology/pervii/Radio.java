package ru.netology.pervii;

public class Radio {

    private int radioStation;
    //private int radioVolume;

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
        if (radioStation >= 0 && radioStation < 11) {
            this.radioStation = 0;
        }
    }

//    //уменьшение Станций
//    public int getRadioStationPrev() {
//        return radioStation;
//    }
//
//    public void increasePrev() {
//        setRadioStationPrev(radioStation - 1);
//    }
//
//    public void setRadioStationPrev(int newRadioStation) {
//        if (newRadioStation >= 0 && newRadioStation < 10) {
//            this.radioStation = newRadioStation;
//            return;
//        }
//        if (newRadioStation < 0) {
//            this.radioStation = 9;
//        }
//    }
//
//    //увеличение Громкости
//    public int getRadioVolumeNext() {
//        return radioVolume;
//    }
//
//    public void increaseVolumeNext() {
//        setRadioVolumeNext(radioVolume + 1);
//    }
//
//    public void setRadioVolumeNext(int newRadioVolume) {
//        if (newRadioVolume >= 0 && newRadioVolume < 11) {
//            this.radioVolume = newRadioVolume;
//            return;
//        }
//        if (newRadioVolume > 10) {
//            this.radioVolume = 10;
//        }
//    }
//
//    //уменьшение Громкости
//    public int getRadioVolumePrev() {
//        return radioVolume;
//    }
//
//    public void increaseVolumePrev() {
//        setRadioVolumePrev(radioVolume - 1);
//    }
//
//    public void setRadioVolumePrev(int newRadioVolume) {
//        if (newRadioVolume >= 0 && newRadioVolume < 11) {
//            this.radioVolume = newRadioVolume;
//            return;
//        }
//        if (newRadioVolume < 0) {
//            this.radioVolume = 0;
//        }
//    }
}