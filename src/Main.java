public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите приложение для IOS по ссылке");
                break;
            case 1:
                System.out.println("Установите приложение для Android по ссылке");
                break;
            default:
                System.out.println("Мы не смогли определить Вашу версию ОС");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientSystem = 1;
        int clientDeviceYear = 2016;
        if (clientDeviceYear < 2015) {
            switch (clientSystem) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Мы не смогли определить Вашу версию ОС");
            }
        } else {
            switch (clientSystem) {
                case 0:
                    System.out.println("Установите приложение для IOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите приложение для Android по ссылке");
                    break;
                default:
                    System.out.println("Мы не смогли определить Вашу версию ОС");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
            System.out.println("Год " + year + " - високосный"); }
        else {
            System.out.println("Год " + year + " - не високосный");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliverydays = 0;
        if (deliveryDistance < 20) { deliverydays = 1; }
        else if (deliveryDistance < 60) { deliverydays = 2; }
        else if (deliveryDistance < 100) { deliverydays = 3; }
        if (deliverydays == 0) {
            System.out.println("Доставка не осуществляется"); }
            else {
                System.out.println("Для доставки потребуется " + deliverydays + " дней");
            }
        }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}