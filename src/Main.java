public class Main {
    public static void main(String[] args) {
        int mounth = 0;
        int total = 0;
        while (total < 2_459_000) {
            total = total + 15_000;
            System.out.println("Месяц " + mounth++ + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 1 конец");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println();
        int numberTwo = 10;
        while (numberTwo > 0) {
            System.out.print(numberTwo + " ");
            numberTwo = numberTwo - 1;
        }
        System.out.println();
        System.out.println("Задача 2 конец");
        int totalPopulation = 12_000_000;
        int born = 17;
        int dead = 8;
        int year = 2024;
        while (year < 2034) {
            totalPopulation += totalPopulation * born / 1000 - totalPopulation * dead / 1000;
            System.out.println("Год " + year++ + ", численность населения составляет " + totalPopulation);
        }
        System.out.println("Задача 3 конец");
        int firstSum = 15000;
        double percent = 7D / 100;
        int mounthSum = 0;
        while (firstSum < 12_000_000) {
            firstSum = (int) (firstSum * (1 + percent));
            mounthSum++;
            System.out.println("Месяц " + mounthSum + " сумма накоплений равна " + firstSum + " рублей");
        }
        System.out.println("Задача 4 конец");
        firstSum = 15000;
        percent = 7D / 100;
        mounthSum = 0;
        while (firstSum < 12_000_000) {
            firstSum = (int) (firstSum * (1 + percent));
            mounthSum++;
            if (mounthSum % 6 == 0)
                System.out.println("Месяц " + mounthSum + " сумма накоплений равна " + firstSum + " рублей");
        }
        System.out.println("Задача 5 конец");
        firstSum = 15000;
        percent = 7D / 100;
        mounthSum = 0;
        int totalMount = 9 * 12;
        while (mounthSum < totalMount) {
            firstSum = (int) (firstSum * (1 + percent));
            mounthSum++;
            if (mounthSum % 6 == 0)
                System.out.println("Месяц " + mounthSum + " сумма накоплений равна " + firstSum + " рублей");
        }
        System.out.println("Задача 6 конец");
        int day = 3;
        for (; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача 7 конец");
        int currentComet = 2024;
        int period = 79;
        int start = 0;
        int startCurrentComet = currentComet - 200;
        int endCurrentComet = currentComet + 100;
        for (; start < endCurrentComet; start += period) {
            if (start > startCurrentComet) {
                System.out.println(start);
            }
        }
    }
}