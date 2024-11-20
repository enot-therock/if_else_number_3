import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("task number 1");
        System.out.println("Укажите свою операционную систему");
        String userClientOS = "";
        userClientOS = scan.next();
        if (userClientOS.equalsIgnoreCase("iOS")) {
            System.out.println("Установите приложение для iOS по ссылке ...");
        } else {
            System.out.println("Установите приложение для Android по ссылке ...");
        }

        System.out.println();
        System.out.println("task number 2");
        System.out.println("Укажите свою операционную систему и год выпуска телефона");
        int yearPhone = 0;
        userClientOS = scan.next();
        yearPhone = scan.nextInt();
        if (userClientOS.equalsIgnoreCase("iOS")) {
            System.out.print("Установите приложение для iOS по ссылке ...");
            if (yearPhone <= 2015) {
                System.out.println(", также Вы можете установить облегченную версию приложения для iOS по ссылке ...");
            }
        } else if (userClientOS.equalsIgnoreCase("Android")){
            System.out.print("Установите приложение для Android по ссылке ...");
            if (yearPhone <= 2015) {
                System.out.println(", также Вы можете установить облегченную версию приложения для Android по ссылке ...");
            }
        }

        System.out.println();
        System.out.println("task number 3");
        System.out.println("Напишите год, чтобы проверить високосный он или нет");
        int year = 0;
        year = scan.nextInt();
        if (((year % 4) == 0) && (year > 1584)) { // % == 0 - проверяем что год делится на 4 без остатка
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();
        System.out.println("task number 4");
        System.out.println("Введите расстояние от пункта доставки до Вас (в км)");
        int deliveryDistance = 0;
        deliveryDistance = scan.nextInt();
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки потребуется один день");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Для доставки потребуется 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Для доставки потребуется 3 дня");
        } else {
            System.out.println("Доставки на такое расстояние нет. Попробуйте воспользоваться другим сервисом");
        }

        System.out.println();
        System.out.println("task number 5");
        System.out.println("Введите номер месяца, чтобы узнать к какому времени года он относится");
        int monthNumber = 0;
        monthNumber = scan.nextInt();
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}