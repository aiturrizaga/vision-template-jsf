package com.vision.controller;

import lombok.Data;

@Data
public class Car {

    public Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice, boolean randomSoldState) {
        this.randomId = randomId;
        this.randomBrand = randomBrand;
        this.randomYear = randomYear;
        this.randomColor = randomColor;
        this.randomPrice = randomPrice;
        this.randomSoldState = randomSoldState;
    }

    private String randomId;
    private String randomBrand;
    private int randomYear;
    private String randomColor;
    private int randomPrice;
    private boolean randomSoldState;
}
