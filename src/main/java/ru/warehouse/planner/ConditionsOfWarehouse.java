package ru.warehouse.planner;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class ConditionsOfWarehouse{
    private double TemperatureOfWarehouse;
    private int HumidityOfWarehouse;
    private double LengthOfWarehouse;
    private double WidthOfWarehouse;
    private double HeightOfWarehouse;

    public double getTemperatureOfWarehouse() {
        return TemperatureOfWarehouse;
    }

    public void setTemperatureOfWarehouse(double temperatureOfWarehouse) {
        TemperatureOfWarehouse = temperatureOfWarehouse;
    }

    public int getHumidityOfWarehouse() {
        return HumidityOfWarehouse;
    }

    public void setHumidityOfWarehouse(int humidityOfWarehouse) {
        HumidityOfWarehouse = humidityOfWarehouse;
    }

    public double getHeightOfWarehouse() {
        return HeightOfWarehouse;
    }

    public void setHeightOfWarehouse(double heightOfWarehouse) {
        HeightOfWarehouse = heightOfWarehouse;
    }

    public double getWidthOfWarehouse() {
        return WidthOfWarehouse;
    }

    public void setWidthOfWarehouse(double widthOfWarehouse) {
        WidthOfWarehouse = widthOfWarehouse;
    }

    public double getLengthOfWarehouse() {
        return LengthOfWarehouse;
    }

    public void setLengthOfWarehouse(double lengthOfWarehouse) {
        LengthOfWarehouse = lengthOfWarehouse;
    }

//здесь ещё нужно добавить входы выходы
    //виртуальный план складского помещения
    //    public void ConditionsOfWarehouse(double TemperatureOfWarehouse, int HumidityOfWarehouse,double length, double width, double hight) {
    //        this.TemperatureOfWarehouse = TemperatureOfWarehouse;
    //        this.HumidityOfWarehouse = HumidityOfWarehouse;
    //        SizeOfWarehouse = length * width * hight;  SizeOfWarehouse=this.SizeOfWarehouse;
    //
    //    }

    }
