public class Main {
    public static void main(String[] args) {
        task1();
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

}