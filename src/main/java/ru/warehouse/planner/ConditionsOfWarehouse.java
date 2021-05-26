package ru.warehouse.planner;

import java.util.Calendar;
import java.util.GregorianCalendar;

// надо поправить
public class ConditionsOfWarehouse{
  static   double TemperatureOfWarehouse;
  static   int HumidityOfWarehouse;
  static   double SizeOfWarehouse;
//здесь ещё нужно добавить входы выходы
    //виртуальный план складского помещения
    public void ConditionsOfWarehouse(double TemperatureOfWarehouse, int HumidityOfWarehouse,double length, double width, double hight) {
        TemperatureOfWarehouse = this.TemperatureOfWarehouse;
        HumidityOfWarehouse = this.HumidityOfWarehouse;
        SizeOfWarehouse = length * width * hight;  SizeOfWarehouse=this.SizeOfWarehouse;

    }

    }
