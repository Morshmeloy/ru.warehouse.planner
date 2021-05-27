package ru.warehouse.planner;

import java.util.Calendar;
import java.util.GregorianCalendar;

// надо поправить
public class ConditionsOfWarehouse{
    private double TemperatureOfWarehouse;
    private int HumidityOfWarehouse;
    private double SizeOfWarehouse;
//здесь ещё нужно добавить входы выходы
    //виртуальный план складского помещения
    public void ConditionsOfWarehouse(double TemperatureOfWarehouse, int HumidityOfWarehouse,double length, double width, double hight) {
        this.TemperatureOfWarehouse = TemperatureOfWarehouse;
        this.HumidityOfWarehouse = HumidityOfWarehouse;
        SizeOfWarehouse = length * width * hight;  SizeOfWarehouse=this.SizeOfWarehouse;

    }

    }
