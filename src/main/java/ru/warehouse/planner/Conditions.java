package ru.warehouse.planner;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Conditions {
    double Temperature;
    int Humidity;
    double Size;
    Calendar data = new GregorianCalendar();

    public void ConditionsOfWarehouse(double Temperature, int Humidity) {
        double TemperatureOfWarehouse = this.Temperature;
        int HumidityOfWarehouse = this.Humidity;
    }

    public void Size(double length, double width, double hight) {
        Size = length * width * hight;
    }

    public void Data(int year, int mounth, int day) {
        data = Calendar.getInstance();
    }

    public void ConditionsOfProduct(double Temperature, int Humidity, double Size, Calendar data) {
        double TemperatureOfProduct = this.Temperature;
        int HumidityOfProduct = this.Humidity;
        double SizeOfProduct = this.Size;
        Calendar Data = this.data;

    }
}
