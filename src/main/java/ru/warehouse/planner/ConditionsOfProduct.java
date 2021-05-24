package ru.warehouse.planner;

import java.util.ArrayList;
import java.util.Calendar;

public class ConditionsOfProduct{

    static double TemperatureOfProduct;
    static int HumidityOfProduct;
    static double SizeOfProduct;
    static String NameOfProduct;
    static Calendar contentEndings;
    static Calendar contentStart;
    static int weightOfProduct;
    static String TypeOfProduct;
    public void ConditionsOfProduct(String name,double Temperature, int Humidity, double length, double width, double hight,int yearEnd,int mouthEnd,int dayEnd,int yearStart,int mounthStart,int dayStart,int weightOfProduct,String TypeOfProduct) {
        NameOfProduct = this.NameOfProduct;
        TemperatureOfProduct = this.TemperatureOfProduct;
        HumidityOfProduct = this.HumidityOfProduct;
        SizeOfProduct=length*width*hight;
        SizeOfProduct = this.SizeOfProduct;
        contentStart.set(yearStart,mounthStart,dayStart);
        contentStart=this.contentStart;
        contentEndings.set(yearEnd,mouthEnd,dayEnd);
        contentEndings=this.contentEndings;
        weightOfProduct=this.weightOfProduct;
        switch (TypeOfProduct){
            case("Продукты питания"):{TypeOfProduct="Продукты питания";TypeOfProduct=this.TypeOfProduct;break;}
            case ("Химические товары"):{TypeOfProduct="Химические товары";TypeOfProduct=this.TypeOfProduct;break;}
            case ("Электроника"):{TypeOfProduct="Электроника";TypeOfProduct=this.TypeOfProduct;break;}
            default:{TypeOfProduct="Не определённое";TypeOfProduct=this.TypeOfProduct;}
        }

    }
}
