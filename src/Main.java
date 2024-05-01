import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Android по ссылке");
        }

        int year = 1900;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        }

        int deliveryDistance = 99;
        if (deliveryDistance < 20) {
            System.out.println("Для доставки на " + deliveryDistance + " км потребуется 1 день");
        } else if (deliveryDistance < 60) {
            System.out.println("Для доставки на " + deliveryDistance + " км потребуется 2 дня");
        } else if (deliveryDistance < 100) {
            System.out.println("Для доставки на " + deliveryDistance + " км потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }


        int monthNumber = 0;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println(monthNumber + " - Некорректный номер месяца");
        }
    }
}