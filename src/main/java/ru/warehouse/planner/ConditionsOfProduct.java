package ru.warehouse.planner;

import java.util.ArrayList;
import java.util.Calendar;

public class ConditionsOfProduct{

    private double TemperatureOfProduct;
    private int HumidityOfProduct;
    private double LengthOfProduct;
    private double WidthOfProduct;
    private double HeightofProduct;
    private String NameOfProduct;
    private Calendar contentEndings;
    private Calendar contentStart;
    private int weightOfProduct;
    private String TypeOfProduct;

    public double getTemperatureOfProduct() {
        return TemperatureOfProduct;
    }

    public void setTemperatureOfProduct(double temperatureOfProduct) {
        TemperatureOfProduct = temperatureOfProduct;
    }

    public int getHumidityOfProduct() {
        return HumidityOfProduct;
    }

    public void setHumidityOfProduct(int humidityOfProduct) {
        HumidityOfProduct = humidityOfProduct;
    }

    public String getNameOfProduct() {
        return NameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        NameOfProduct = nameOfProduct;
    }

    public Calendar getContentEndings() {
        return contentEndings;
    }

    public void setContentEndings(Calendar contentEndings) {
        this.contentEndings = contentEndings;
    }

    public Calendar getContentStart() {
        return contentStart;
    }

    public void setContentStart(Calendar contentStart) {
        this.contentStart = contentStart;
    }

    public int getWeightOfProduct() {
        return weightOfProduct;
    }

    public void setWeightOfProduct(int weightOfProduct) {
        this.weightOfProduct = weightOfProduct;
    }

    public String getTypeOfProduct() {
        return TypeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        TypeOfProduct = typeOfProduct;
    }

    public double getLengthOfProduct() {
        return LengthOfProduct;
    }

    public void setLengthOfProduct(double lengthOfProduct) {
        LengthOfProduct = lengthOfProduct;
    }

    public double getWidthOfProduct() {
        return WidthOfProduct;
    }

    public void setWidthOfProduct(double widthOfProduct) {
        WidthOfProduct = widthOfProduct;
    }

    public double getHeightofProduct() {
        return HeightofProduct;
    }

    public void setHeightofProduct(double heightofProduct) {
        HeightofProduct = heightofProduct;
    }
}

