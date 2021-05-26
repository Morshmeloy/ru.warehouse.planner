package ru.warehouse.planner;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        //Первоначальные настройки параметров склада
        TextPrinter.WhatIsHumidityInWarehouse();
        TextPrinter.WhatIsTemperatureOfWarehouse();
        TextPrinter.Square();

        ConditionsOfWarehouse conditionsOfWarehouse = new ConditionsOfWarehouse();
        conditionsOfWarehouse.ConditionsOfWarehouse(scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        //Здесь вносить 1 продукт ещё не посылаеться на стелаж или имеет возможность создавать несколько
        TextPrinter.NameOfProduct();
        TextPrinter.WhatIsTemperatureForProduct();
        TextPrinter.WhatIsHumidityForProduct();
        TextPrinter.WhatIsTheSizeOfProduct();
        TextPrinter.WhatIsDataOfStart();
        TextPrinter.WhatIsDataOfEndings();
        TextPrinter.WeightOfProduct();
        TextPrinter.WhatIsTypeOfProduct();
        ConditionsOfProduct conditionForProduct = new ConditionsOfProduct();
        conditionForProduct.ConditionsOfProduct(scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(), scanner.nextInt(),scanner.next());

        TextPrinter.GreetingsWhatIsNext();
        ArrayList<ConditionsOfProduct> products = new ArrayList<>();
        switch (scanner.next()) {
            //Здесь хочу настроить установку палетов и стелажей и изменнение если они стоят
            case ("Склад"): {
                TextPrinter.ConditionsOfWarehouse();
                switch (scanner.next()) {
                    case ("Размер"): {
                        System.out.println("Размер склада: " + ConditionsOfWarehouse.SizeOfWarehouse);
                        break;
                    }
                    case ("Температура"): {
                        TextPrinter.RiseOrDown();//Можно было бы и через знак сделать ,но так вроде легче
                        switch (scanner.next()) {
                            case ("Повысить"): {
                                TextPrinter.Number();
                                ConditionsOfWarehouse.TemperatureOfWarehouse = ConditionsOfWarehouse.TemperatureOfWarehouse + scanner.nextInt();
                                break;
                            }
                            case ("Понизить"): {
                                TextPrinter.Number();
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
                        TextPrinter.RiseOrDown();
                        switch (scanner.next()) {
                            case ("Повысить"): {
                                TextPrinter.Number();
                                ConditionsOfWarehouse.HumidityOfWarehouse = ConditionsOfWarehouse.HumidityOfWarehouse + scanner.nextInt();
                                break;
                            }
                            case ("Понизить"): {
                                TextPrinter.Number();
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
                TextPrinter.Conditions();
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
