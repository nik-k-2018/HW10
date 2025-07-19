public class Task3 {

    public static void main(String[] args) {
        int deliveryDistance = 95; // расстояние до клиента

        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 0) {
            return -1; // Некорректное расстояние
        } else if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1; // Свыше 100 км — доставка не осуществляется
        }
    }
}