public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            total = total + total/100;
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей" );
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i<11) {
            System.out.print(i + " " );
            i++;
        }

        System.out.println();

        int k = 10;
        for (;k>0;) {
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
            System.out.println("Год " + i + ", численность населения составляет " + people );
        }
    }

}