package ru.warehouse.planner;

// использовать вариант из ветки enum_used
public class Text {

    public static void Squere(){System.out.println("Введите: длинну высоту и ширину помещения");}

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

    public static void WhatIsTypeOfProduct(){System.out.println("Введите тип вашего товара:\nПродукты питания\nХимические товары\nЭлектроника");}

    public static void WeightOfProduct(){System.out.println("Введите массу товара");}

    public static void WhatIsDataOfEndings() {System.out.println("Напише срок окончания хранения (год,месяц,день)");}

    public static void WhatIsDataOfStart(){System.out.println("Напишите дату погрузки(Год,месяц,день)");}

    public static void NameOfProduct(){System.out.println("НАзвание вашего товара"); }

    public static void GreetingsWhatIsNext(){System.out.println("Здраствуйте С чем вы хотите работать ?\nСклад\nТовар");}

    public static void ConditionsOfWarehouse(){System.out.println("С какими параметрами Складского помещения вы хотитеработать\nРазмер\nТемпература\nВлажность");}

    public static void RiseOrDown(){System.out.println("Вы хотите изменить ?\nПовысить?\nПонизить");}

    public static void Number(){System.out.println("Введите насколько хотите изменить");}

    public static void Conditions(){System.out.println("Какие параметры товара вы хотите увидеть ?\nРазмер\nТребуемая температура\nТребуемая влажность\nДата поступления\nОкончания хранения\nМасса\nСколько товаров на складе\nТип товара?");}


}
