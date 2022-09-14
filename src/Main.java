public class Main {
    public static void main(String[] args) {
        /// Задание 1
        System.out.println("Задание 1");
        int monay = 29000;
        int sun = 0;
        for (int i = 1; i <= 12; i++) {
            sun += monay;
            System.out.println("Месяц " +i+ " сумма накоплений равна " + sun + " рублей");
        }

        /// Задание 2
        System.out.println("Задание 2");
        double sumPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumPercent = (sumPercent + monay) * (1 + percent);
            System.out.println("Месяц " +i+ " сумма накоплений равна " +sumPercent+ "рублей");
        }
    }
}