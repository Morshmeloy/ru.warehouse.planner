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
        WHAT_IS_THE_SIZE_OF_PRODUCT,
        WHAT_IS_HUMUDITY_FOR_PRODUCT,
        WHAT_IS_HUMIDITY_FOR_PRODUCT,
        WHAT_IS_TYPE_OF_PRODUCT,
        WEIGHT_OF_PRODUCT,
        WHAT_IS_DATA_OF_ENDINGS,
        WHAT_IS_DATA_OF_START,
        NAME_OF_PRODUCT,
        GREETINGS_WHAT_IS_NEXT,
        CONDITIONS_OF_WAREHOUSE,
        RISE_OR_DOWN,
        NUMBER,
        CONDITIONS
    }

    private final static Map<MessageKey, String> messages = new EnumMap<>(MessageKey.class);

    static {
        messages.put(MessageKey.SQUARE, "Введите: длинну высоту и ширину помещения");
        messages.put(MessageKey.WHAT_IS_TEMPERATURE_OF_WAREHOUSE, "Какая сейчас температура на складу ?");
        messages.put(MessageKey.WHAT_IS_HUMIDITY_IN_WAREHOUSE, "Какая сейчас влажность на складу ?");
        messages.put(MessageKey.WHAT_IS_TEMPERATURE_FOR_PRODUCT, "Какая температура необходима товару ?");
        messages.put(MessageKey.WHAT_IS_THE_SIZE_OF_PRODUCT, "Введите ширину,длину,высоту товара");
        messages.put(MessageKey.WHAT_IS_HUMUDITY_FOR_PRODUCT,"Какая влажность необхадима для товара ?");
        messages.put(MessageKey.WHAT_IS_HUMIDITY_FOR_PRODUCT,"Какая влажность необхадима для товара ?");
        messages.put(MessageKey.WHAT_IS_TYPE_OF_PRODUCT,"Введите тип вашего товара:\nПродукты питания\nХимические товары\nЭлектроника");
        messages.put(MessageKey.WEIGHT_OF_PRODUCT,"Введите массу товара");
        messages.put(MessageKey.WHAT_IS_DATA_OF_ENDINGS,"Напише срок окончания хранения (год,месяц,день)");
        messages.put(MessageKey.WHAT_IS_DATA_OF_START,"Напишите дату погрузки(Год,месяц,день)");
        messages.put(MessageKey.NAME_OF_PRODUCT,"Название вашего товара");
        messages.put(MessageKey.GREETINGS_WHAT_IS_NEXT,"Здраствуйте С чем вы хотите работать ?\nСклад\nТовар");
        messages.put(MessageKey.CONDITIONS_OF_WAREHOUSE,"С какими параметрами Складского помещения вы хотитеработать\nРазмер\nТемпература\nВлажность");
        messages.put(MessageKey.RISE_OR_DOWN,"Вы хотите изменить ?\nПовысить?\nПонизить");
        messages.put(MessageKey.NUMBER,"Введите насколько хотите изменить");
        messages.put(MessageKey.CONDITIONS,"Какие параметры товара вы хотите увидеть ?\nРазмер\nТребуемая температура\nТребуемая влажность\nДата поступления\nОкончания хранения\nМасса\nСколько товаров на складе\nТип товара?");
    }

    public static void print(MessageKey key) {
        System.out.println(messages.get(key));
    }
}

