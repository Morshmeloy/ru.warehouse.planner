package ru.warehouse.planner;

public class Text {
    public static void NumberOfPoints() {
        System.out.println("Введите количество точек необходимых для постройки Помещения ");
    }

    public static void TextForPoint(int numberOfPoint) {
        System.out.println("Введите координаты для " + numberOfPoint);
    }
    public static void WhatIsHightOfWarehouse(){
        System.out.println("Введите высоту складского помешения");
    }
    public static void WhatIsTemperatureOfWarehouse() {
        System.out.println("Какая сейчас температура на складу ?");
    }

    public static void WhatIsHumidityInWarehouse() {
        System.out.println("Какая сейчас влажность на складу ?");
    }

    public static void WhatIsTemperatureForProduct() {
        System.out.println("Какая температура необходима товару ?");
    }

    public static void WhatIsHumidityForProduct() {
        System.out.println("Какая влажность необхадима для товара ?");
    }

    public static void WhatIsTheSizeOfProduct() {
        System.out.println("Введите ширину,длину,высоту товара");
    }

    public static void WhatIsData() {
        System.out.println("Напише срок хранения ");
    }
}
