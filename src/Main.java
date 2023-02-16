public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            total = total + total / 100;
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        int k = 10;
        for (; k > 0; ) {
            System.out.print(k + " ");
            k--;
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int people = 12000000;
        int birth = 17;
        int death = 8;
        int rate = birth - death;
        int ratePeople = rate * 12000;
        for (int i = 1; i < 11; i++) {
            people = people + ratePeople;
            System.out.println("Год " + i + ", численность населения составляет " + people);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15_000;
        int total = 0;
        for (int i = 1; total <= 12_000_000; i++) {
            total = total + total * 7 / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15_000;
        int total = 0;
        for (int i = 1; total <= 12_000_000; i++) {
            total = total + total * 7 / 100;
            total = total + salary;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15_000;
        int total = 0;
        for (int month = 1; month < 109; month++) {
            total = total + total * 7 / 100;
            total = total + salary;
            if (month % 6 == 0)
                System.out.println("Сумма накоплений за " + month + " месяцев, равна " + total);
        }
        System.out.println("Итоговая сумма за 9 лет равна " + total);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-ое число. Необходимо подготовить отчет!");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2023;
        int yearAgo = year - 200;
        int yearFuture = year + 100;
        while (year <= yearFuture) {
            year++;
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        int year2 = 2023;
        while (year2 >= yearAgo) {
            year2--;
            if (year2 % 79 == 0) {
                System.out.println(year2);
            }
        }
    }
}

