package ru.netology.pervii;

public class Radio {

    private int radioStation;

    public int getRadioStation() {
        return radioStation;
    }

    public void currentRadioStation() {
        if (this.radioStation > this.radioStation + 1){
            setRadioStation(this.radioStation + 1);
        }
        if (this.radioStation > this.radioStation - 1){
            setRadioStation(this.radioStation - 1);
        }
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 10 && radioStation > 0) {
            this.radioStation = radioStation;
        }
        else {
            this.radioStation = 0;
        }

        //if (radioStation > 0) {
        //   this.radioStation = radioStation;
        //}
        //else {
        //    this.radioStation = 9;
        // }
    }


}
