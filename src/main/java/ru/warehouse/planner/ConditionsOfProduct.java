package ru.warehouse.planner;

import java.util.ArrayList;
import java.util.Calendar;

public class ConditionsOfProduct{

    private double TemperatureOfProduct;
    private int HumidityOfProduct;
    private double SizeOfProduct;
    private String NameOfProduct;
    private Calendar contentEndings;
    private Calendar contentStart;
    private int weightOfProduct;
    private String TypeOfProduct;
    public void ConditionsOfProduct(String name,double Temperature, int Humidity, double length, double width, double hight,int yearEnd,int mouthEnd,int dayEnd,int yearStart,int mounthStart,int dayStart,int weightOfProduct,String TypeOfProduct) {
        this.NameOfProduct = NameOfProduct;
        this.TemperatureOfProduct = TemperatureOfProduct;
        this.HumidityOfProduct = HumidityOfProduct;
        SizeOfProduct=length*width*hight;
        this.SizeOfProduct = SizeOfProduct;
        contentStart.set(yearStart,mounthStart,dayStart);
        this.contentStart=contentStart;
        contentEndings.set(yearEnd,mouthEnd,dayEnd);
        this.contentEndings=contentEndings;
        this.weightOfProduct=weightOfProduct;
        switch (TypeOfProduct){
            case("Продукты питания"):{TypeOfProduct="Продукты питания";TypeOfProduct=this.TypeOfProduct;break;}
            case ("Химические товары"):{TypeOfProduct="Химические товары";TypeOfProduct=this.TypeOfProduct;break;}
            case ("Электроника"):{TypeOfProduct="Электроника";TypeOfProduct=this.TypeOfProduct;break;}
            default:{TypeOfProduct="Не определённое";TypeOfProduct=this.TypeOfProduct;}
        }

    }
}
