public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
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

    }
}