import java.time.LocalDate;

public class Task2 {

    public static void main(String[] args) {
        // Примеры вызова метода
        recommendAppVersion(0, 2013); // iOS, 2013
        recommendAppVersion(1, 2018); // Android, 2018
        recommendAppVersion(0, 2025); // iOS, будущий год
    }

    public static void recommendAppVersion(int os, int deviceYear) {
        int currentYear = LocalDate.now().getYear(); // Получаем текущий год

        boolean isOldDevice = deviceYear < 2015 || deviceYear > currentYear;

        if (isOldDevice) {
            if (os == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (os == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (os == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if (os == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
    }
}
