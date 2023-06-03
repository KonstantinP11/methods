import java.time.LocalDate;

class Main {

    public static void toPrintLeapYear(int number) {
        if (number % 400 == 0 || number % 4 == 0 && number % 100 != 0) {
            System.out.println(number + " год — високосный год");
        } else {
            System.out.println(number + " год — невисокосный год");
        }
    }

    public static void installProgram(int phoneOs, int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        String weight = "";
        String os = "Android";
        if (phoneOs == 0) {
            os = "iOS";
        }
        if (phoneYear < currentYear) {
            weight = "облегченную";
        }
        System.out.println("Установите " + weight + " версию приложения для " + os + " по ссылке");
    }

    public static int deliverCard(int dDistance) {
        int days = 1;
        if (dDistance > 0 && dDistance <= 20) {
            days = 1;
        } else if (dDistance > 20 && dDistance <= 60) {
            days += 1;
        } else if (dDistance > 60 && dDistance <= 100) {
            days += 2;
        }
        return days;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("задача 1");
        int year = 2024;
        toPrintLeapYear(year);

    }

    public static void task2() {
        System.out.println("задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        installProgram(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("задача 3");
        int deliveryDistance = 90;
        var answer = "Потребуется дней: ";
        int deliveryDays = deliverCard(deliveryDistance);
        answer = answer + deliveryDays;
        if (deliveryDistance > 100) {
            answer = "доставки нет";
        }
        System.out.println(answer);
    }
}