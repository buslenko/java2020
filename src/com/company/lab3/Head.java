package com.company.lab3;

public class Head {
    private String hairColor;
    private String eyesColor;

    public Head(String hairColor, String eyesColor){
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }
}
