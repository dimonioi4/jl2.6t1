package ru.netology.domain;

public class Radio {
    private String name;
    private int maxStation = 9;
    private int minStation = 0;
    private int nowPlay;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int nowVolume;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getNowPlay() {
        return nowPlay;
    }

    public void setNowPlay(int nowPlay) {
        if (nowPlay > maxStation) {
            return;
        }
        if (nowPlay < minStation) {
            return;
        }
        this.nowPlay = nowPlay;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getNowVolume() {
        return nowVolume;
    }

    public void setNowVolume(int nowVolume) {
        if (nowVolume > maxVolume) {
            return;
        }
        if (nowVolume < minVolume) {
            return;
        }
        this.nowVolume = nowVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Переключение станций
    public int nextStation() {
        nowPlay = nowPlay < maxStation ? nowPlay + 1 : minStation;
        return nowPlay;
    }

    public int prevStation() {
        nowPlay = nowPlay> minStation ? nowPlay -1 : maxStation;
        return nowPlay;
    }
    // Переключение громкости
    public int increaseVolume() {
        if (nowVolume < maxVolume) {
        nowVolume++;
    }
     return nowVolume;
    }

    public int decreaseVolume() {
        if (nowVolume > minVolume) {
        nowVolume--;
    }
    return nowVolume;
    }
}