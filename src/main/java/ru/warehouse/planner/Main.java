package ru.warehouse.planner;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        ConditionsOfProduct conditionForProduct = new ConditionsOfProduct();
        ConditionsOfWarehouse conditionsOfWarehouse = new ConditionsOfWarehouse();

        Scanner scanner = new Scanner(System.in);
        //Первоначальные настройки параметров склада
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_HUMIDITY_IN_WAREHOUSE);
        conditionsOfWarehouse.setHumidityOfWarehouse(scanner.nextInt());
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_TEMPERATURE_OF_WAREHOUSE);
        conditionsOfWarehouse.setTemperatureOfWarehouse(scanner.nextDouble());
        TextPrinter.print(TextPrinter.MessageKey.SQUARE);
        conditionsOfWarehouse.setLengthOfWarehouse(scanner.nextDouble());
        conditionsOfWarehouse.setHeightOfWarehouse(scanner.nextDouble());
        conditionsOfWarehouse.setWidthOfWarehouse(scanner.nextDouble());

        //Все условия Склада

        //  conditionsOfWarehouse.ConditionsOfWarehouse(scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        //Здесь вносить 1 продукт ещё не посылаеться на стелаж или имеет возможность создавать несколько
        TextPrinter.print(TextPrinter.MessageKey.NAME_OF_PRODUCT);
        conditionForProduct.setNameOfProduct(scanner.next());
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_TEMPERATURE_FOR_PRODUCT);
        conditionForProduct.setTemperatureOfProduct(scanner.nextDouble());
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_HUMUDITY_FOR_PRODUCT);
        conditionForProduct.setHumidityOfProduct(scanner.nextInt());
        // переделать size
        // TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_THE_SIZE_OF_PRODUCT);

        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_DATA_OF_START);
        // настроить внос даты начала хранения
        // conditionForProduct.setContentStart();
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_DATA_OF_ENDINGS);
        //настроить внос даты окончания хранения
        //conditionForProduct.setContentEndings();
        TextPrinter.print(TextPrinter.MessageKey.WEIGHT_OF_PRODUCT);
        conditionForProduct.setWeightOfProduct(scanner.nextInt());
        TextPrinter.print(TextPrinter.MessageKey.WHAT_IS_TYPE_OF_PRODUCT);
        conditionForProduct.setTypeOfProduct(scanner.next());
        //Все условия товара

//        conditionForProduct.ConditionsOfProduct(scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(), scanner.nextInt(),scanner.next());

        TextPrinter.print(TextPrinter.MessageKey.GREETINGS_WHAT_IS_NEXT);
        ArrayList<ConditionsOfProduct> products = new ArrayList<>();
        switch (scanner.next()) {
            //Здесь хочу настроить установку палетов и стелажей и изменнение если они стоят
            case ("Склад"): {
                TextPrinter.print(TextPrinter.MessageKey.CONDITIONS_OF_WAREHOUSE);
                switch (scanner.next()) {
                    case ("Размер"): {
                        System.out.println("Размер склада: " + "\nШирина:" + conditionsOfWarehouse.getWidthOfWarehouse() + "\nДлина:" + conditionsOfWarehouse.getLengthOfWarehouse() + "\nВысота:" + conditionsOfWarehouse.getHeightOfWarehouse());
                        break;
                    }
                    case ("Температура"): {
                        TextPrinter.print(TextPrinter.MessageKey.RISE_OR_DOWN);//Можно было бы и через знак сделать ,но так вроде легче
                        switch (scanner.next()) {
                            case ("Повысить"): {
                                TextPrinter.print(TextPrinter.MessageKey.NUMBER);
                                conditionsOfWarehouse.setTemperatureOfWarehouse(conditionForProduct.getTemperatureOfProduct() + scanner.nextInt());
                                break;
                            }
                            case ("Понизить"): {
                                TextPrinter.print(TextPrinter.MessageKey.NUMBER);
                                conditionsOfWarehouse.setTemperatureOfWarehouse(conditionsOfWarehouse.getTemperatureOfWarehouse() - scanner.nextInt());
                                break;
                            }
                            case ("Показать Температуру"): {
                                System.out.println("Температура на складе: " + conditionsOfWarehouse.getTemperatureOfWarehouse());
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
                                conditionsOfWarehouse.setHumidityOfWarehouse(conditionsOfWarehouse.getHumidityOfWarehouse() + scanner.nextInt());
                                break;
                            }
                            case ("Понизить"): {
                                TextPrinter.print(TextPrinter.MessageKey.NUMBER);
                                conditionsOfWarehouse.setHumidityOfWarehouse(conditionsOfWarehouse.getHumidityOfWarehouse() - scanner.nextInt());
                                break;
                            }
                            case ("Показать Влажность"): {
                                System.out.println("Влажность на складе: " + conditionsOfWarehouse.getHumidityOfWarehouse());
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
                            //параметры товара
                            //conditionForProduct.ConditionsOfProduct(scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(), scanner.nextInt(),scanner.next());
                            products.add(conditionForProduct);
                            break;
                        }
                        case ("Посмотреть параметры товара"): {
                            switch (scanner.next()) {
                                case ("Требуемая влажность"): {
                                    System.out.println("Требуемая влажность для товара: " + conditionForProduct.getHumidityOfProduct());
                                    break;
                                }
                                case ("Требуемая температура"): {
                                    System.out.println("Требуемая температура: " + conditionForProduct.getTemperatureOfProduct());
                                    break;
                                }
                                case ("Размер"): {
                                    System.out.println("Размер: " + "\nШирина:" + conditionForProduct.getWidthOfProduct() + "\nДлина:" + conditionForProduct.getLengthOfProduct() + "\nВысота:" + conditionForProduct.getHeightofProduct());
                                    break;
                                }
                                case ("Масса"): {
                                    System.out.println("Масса: " + conditionForProduct.getWeightOfProduct());
                                    break;
                                }
                                case ("Дата окончания хранения"): {
                                    System.out.println("Дата окончания хранения: " + conditionForProduct.getContentEndings());
                                    break;
                                }
                                case ("Дата начала хранения"): {
                                    System.out.println("Дата начала хранения: " + conditionForProduct.getContentStart());
                                    break;
                                }
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
