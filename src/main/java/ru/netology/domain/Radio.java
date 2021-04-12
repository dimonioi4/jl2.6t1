package ru.netology.domain;

public class Radio {
    int NowPlay;
    int maxStation = 9;
    int minStation = 0;
    int NowVolume;
    int maxVolume = 10;
    int minVolume = 0;

    public Radio() {
    }

    public Radio(int NowPlay) {
        this.NowPlay = NowPlay;
    }

    public Radio(int minVolume, int maxVolume, int NowVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.NowVolume = NowVolume;
    }

    public int getNowPlay() {

        return NowPlay;
    }

    public void setNowPlay() {
        if ((NowPlay > maxStation) || (NowPlay < minStation)) {
            return;
        } else
            this.NowPlay = NowPlay;
    }

    public void nextStation() {
        if ((NowPlay < maxStation) && (NowPlay >= minStation)) {
            this.NowPlay = NowPlay + 1;
        } else {
            this.NowPlay = 0;
        }
    }

    public void prevStation() {
        if ((NowPlay <= maxStation) && (NowPlay > minStation)) {
            this.NowPlay = NowPlay - 1;
        } else {
            this.NowPlay = maxStation;
        }
    }

    public int getNowVolume() {

        return NowVolume;
    }

    public void setNowVolume(int NowVolume) {
        if ((NowVolume > maxVolume) || (NowVolume < minVolume)) {
            return;
        } else this.NowVolume = NowVolume;
    }

    public void increaseVolume() {
        if ((NowVolume < maxVolume) && (NowVolume >= minVolume)) {
            this.NowVolume = NowVolume + 1;
        } else return;
    }

    public void decreaseVolume()  {
        if ((NowVolume <= maxVolume) && (NowVolume > minVolume)) {
            this.NowVolume = getNowVolume() - 1;
        } else return;
    }


}
