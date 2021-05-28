package ru.warehouse.planner;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        //Первоначальные настройки параметров склада
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_HUMIDITY_IN_WAREHOUSE);
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_TEMPERATURE_OF_WAREHOUSE);
        TextPrinter.print(TextPrinter.MessageKey.SQUARE);

        ConditionsOfWarehouse conditionsOfWarehouse = new ConditionsOfWarehouse();
        conditionsOfWarehouse.ConditionsOfWarehouse(scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        //Здесь вносить 1 продукт ещё не посылаеться на стелаж или имеет возможность создавать несколько
        TextPrinter.print(TextPrinter.MessageKey.NAME_OF_PRODUCT);
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_TEMPERATURE_FOR_PRODUCT);
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_HUMUDITY_FOR_PRODUCT);
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_THE_SIZE_OF_PRODUCT);
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_DATA_OF_START);
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_DATA_OF_ENDINGS);
        TextPrinter.print(TextPrinter.MessageKey.WEIGHT_OF_PRODUCT);
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_TYPE_OF_PRODUCT);
        ConditionsOfProduct conditionForProduct = new ConditionsOfProduct();
        conditionForProduct.ConditionsOfProduct(scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(), scanner.nextInt(),scanner.next());

        TextPrinter.print(TextPrinter.MessageKey.GREETINGS_WHAT_IS_NEXT);
        ArrayList<ConditionsOfProduct> products = new ArrayList<>();
        switch (scanner.next()) {
            //Здесь хочу настроить установку палетов и стелажей и изменнение если они стоят
            case ("Склад"): {
                TextPrinter.print(TextPrinter.MessageKey.CONDITIONS_OF_WAREHOUSE);
                switch (scanner.next()) {
                    case ("Размер"): {
                        System.out.println("Размер склада: " + ConditionsOfWarehouse.SizeOfWarehouse);
                        break;
                    }
                    case ("Температура"): {
                        TextPrinter.print(TextPrinter.MessageKey.RISE_OR_DOWN);//Можно было бы и через знак сделать ,но так вроде легче
                        switch (scanner.next()) {
                            case ("Повысить"): {
                                TextPrinter.print(TextPrinter.MessageKey.NUMBER);
                                ConditionsOfWarehouse.TemperatureOfWarehouse = ConditionsOfWarehouse.TemperatureOfWarehouse + scanner.nextInt();
                                break;
                            }
                            case ("Понизить"): {
                                TextPrinter.Number();
                                TextPrinter.print(TextPrinter.MessageKey.NUMBER);
                                ConditionsOfWarehouse.TemperatureOfWarehouse = ConditionsOfWarehouse.TemperatureOfWarehouse - scanner.nextInt();
                                break;
                            }
                            case ("Показать Температуру"): {
                                System.out.println("Температура на складе: " + ConditionsOfWarehouse.TemperatureOfWarehouse);
                                break;
                            }
                            //Здесь конец изменений температуры Склада
                        }
                        break;
                    }
                    case ("Влажность"): {
                        TextPrinter.print(TextPrinter.MessageKey.RISE_OR_DOWN);
                        switch (scanner.next()) {
                            case ("Повысить"): {
                                TextPrinter.print(TextPrinter.MessageKey.NUMBER);
                                ConditionsOfWarehouse.HumidityOfWarehouse = ConditionsOfWarehouse.HumidityOfWarehouse + scanner.nextInt();
                                break;
                            }
                            case ("Понизить"): {
                                TextPrinter.print(TextPrinter.MessageKey.NUMBER);
                                ConditionsOfWarehouse.HumidityOfWarehouse = ConditionsOfWarehouse.HumidityOfWarehouse - scanner.nextInt();
                                break;
                            }
                            case ("Показать Влажность"): {
                                System.out.println("Влажность на складе: " + ConditionsOfWarehouse.HumidityOfWarehouse);
                                break;
                            }
                        }
                        break;
                    }
                    //Здесь конец изменений Влажности Склада
                }
                break;
            }
            //Дальше идёт описания товара надо сделать с выбором
            case ("Товар"): {
                TextPrinter.print(TextPrinter.MessageKey.CONDITIONS);
                //Добавления товара в Arraylist
                //Добавления товара на палеты и стелажы
                while (scanner.next() != "Выход") {
                    switch (scanner.next()) {
                        case ("Добавить товар"): {
                            conditionForProduct.ConditionsOfProduct(scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(), scanner.nextInt(),scanner.next());
                            products.add(conditionForProduct);
                            break;
                        }
                        case ("Посмотреть параметры товара"): {
                            switch (scanner.next()) {
                                case ("Требуемая влажность"): {
                                    System.out.println("Требуемая влажность для товара: " + conditionForProduct.HumidityOfProduct);
                                    break;
                                }
                                case ("Требуемая температура"): {
                                    System.out.println("Требуемая температура: " + conditionForProduct.TemperatureOfProduct);
                                    break;
                                }
                                case ("Размер"): {
                                    System.out.println("Размер: " + conditionForProduct.SizeOfProduct);
                                    break;
                                }
                                case ("Масса"): {
                                    System.out.println("Масса: " + conditionForProduct.weightOfProduct);break;
                                }
                                case ("Дата окончания хранения"): { System.out.println("Дата окончания хранения: " + conditionForProduct.contentEndings);break;
                                }
                                case ("Дата начала хранения"):{System.out.println("Дата начала хранения: "+conditionForProduct.contentStart);break;}
                                case ("Сколько товаров на складе: "): {
                                    //добавить возможность просмотра их местоположения и изменения его
                                    //логистика
                                    //аудит
                                    System.out.println("Количество товаров хранящийся на складе: " + products.size());
                                }
                            }
                            break;
                        }
                    }

                }
                break;
            }

        }
    }
}
