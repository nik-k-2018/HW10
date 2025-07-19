public class Task1 {

    public static void main(String[] args) {
        // Пример использования метода
        checkLeapYear(2024);
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
}