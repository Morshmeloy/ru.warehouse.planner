package ru.warehouse.planner;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Conditions {
    double Temperature;
    int Humidity;
    double Size;
    Calendar calendar = new GregorianCalendar();

    public void ConditionsOfWarehouse(double Temperature, int Humidity) {
        double TemperatureOfWarehouse = this.Temperature;
        int HumidityOfWarehouse = this.Humidity;
    }

    public void ConditionsOfProduct(double Temperature, int Humidity, double Size, Calendar calendar) {
        double TemperatureOfProduct = this.Temperature;
        int HumidityOfProduct = this.Humidity;
        double SizeOfProduct = this.Size;
        Calendar calendarOfProduct = this.calendar;

    }
}
