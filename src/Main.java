public class Main {
    public static void main(String[] args) {
        /// Задание 1
        System.out.println("Задание 1");
        for (int year = 1906; year <= 2096; year++) {
            if (year % 4 ==0 && year % 100 != 0 || year %400 ==0) {
                System.out.println(year + " год является високосным");
            }
        }

        /// Задание 2
        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        /// Задание 3
        System.out.println("Задание 3");
        int number = 1;
        System.out.println(number);
        for (int i = 0; i < 9; i++) {
            number = number * 2;
                System.out.println(number);
        }
    }
}