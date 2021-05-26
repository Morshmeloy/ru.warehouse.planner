package ru.warehouse.planner;

import java.util.EnumMap;
import java.util.Map;

public class TextPrinter {

    // При каждом вызове любого из методов этого типа будет создаваться новая строка
    // При добавлении нового сообщения требуется изменить набор методов этого типа
    // Дублирование кода

    public enum MessageKey {
        SQUARE,
        WHAT_IS_TEMPERATURE_OF_WAREHOUSE,
        WHAT_IS_HUMIDITY_IN_WAREHOUSE,
        WHAT_IS_TEMPERATURE_FOR_PRODUCT,
        WHAT_IS_THE_SIZE_OF_PRODUCT
    }

    private final static Map<MessageKey, String> messages = new EnumMap<>(MessageKey.class);

    static {
        messages.put(MessageKey.SQUARE, "Введите: длинну высоту и ширину помещения");
        messages.put(MessageKey.WHAT_IS_TEMPERATURE_OF_WAREHOUSE, "Какая сейчас температура на складу ?");
        messages.put(MessageKey.WHAT_IS_HUMIDITY_IN_WAREHOUSE, "Какая сейчас влажность на складу ?");
        messages.put(MessageKey.WHAT_IS_TEMPERATURE_FOR_PRODUCT, "Какая температура необходима товару ?");
        messages.put(MessageKey.WHAT_IS_THE_SIZE_OF_PRODUCT, "Введите ширину,длину,высоту товара");
    }

    public static void print(MessageKey key) {
        System.out.println(messages.get(key));
    }



//    public static void Square() {
//        System.out.println("Введите: длинну высоту и ширину помещения");
//    }
//
//    public static void WhatIsTemperatureOfWarehouse() {
//        System.out.println("Какая сейчас температура на складу ?");
//    }
//
//    public static void WhatIsHumidityInWarehouse() {
//        System.out.println("Какая сейчас влажность на складу ?");
//    }
//
//    public static void WhatIsTemperatureForProduct() {
//        System.out.println("Какая температура необходима товару ?");
//    }
//
//    public static void WhatIsHumidityForProduct() {
//        System.out.println("Какая влажность необхадима для товара ?");
//    }
//
//    public static void WhatIsTheSizeOfProduct() {
//        System.out.println("Введите ширину,длину,высоту товара");
//    }
//
//    public static void WhatIsTypeOfProduct() {
//        System.out.println("Введите тип вашего товара:\nПродукты питания\nХимические товары\nЭлектроника");
//    }
//
//    public static void WeightOfProduct() {
//        System.out.println("Введите массу товара");
//    }
//
//    public static void WhatIsDataOfEndings() {
//        System.out.println("Напише срок окончания хранения (год,месяц,день)");
//    }
//
//    public static void WhatIsDataOfStart() {
//        System.out.println("Напишите дату погрузки(Год,месяц,день)");
//    }
//
//    public static void NameOfProduct() {
//        System.out.println("НАзвание вашего товара");
//    }
//
//    public static void GreetingsWhatIsNext() {
//        System.out.println("Здраствуйте С чем вы хотите работать ?\nСклад\nТовар");
//    }
//
//    public static void ConditionsOfWarehouse() {
//        System.out.println("С какими параметрами Складского помещения вы хотитеработать\nРазмер\nТемпература\nВлажность");
//    }
//
//    public static void RiseOrDown() {
//        System.out.println("Вы хотите изменить ?\nПовысить?\nПонизить");
//    }
//
//    public static void Number() {
//        System.out.println("Введите насколько хотите изменить");
//    }
//
//    public static void Conditions() {
//        System.out.println("Какие параметры товара вы хотите увидеть ?\nРазмер\nТребуемая температура\nТребуемая влажность\nДата поступления\nОкончания хранения\nМасса\nСколько товаров на складе\nТип товара?");
//    }
}

