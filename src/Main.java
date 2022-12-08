public class Main {
    public static void main(String[] args) {
        //task 1:
        System.out.println("task 1:");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        //task 2:
        System.out.println("task 2:");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //task 3:
        System.out.println("task 3:");
        for (int g = 0; g < 17; g = g + 2) {
            System.out.println(g);
        }
        //task 4
        System.out.println("task 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //task 5
        System.out.println("task 5:");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }
        //task 6
        System.out.println("task 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        //task 7
        System.out.println("task 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        //task 8
        System.out.println("task 8:");
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
        }
        //task 9
        System.out.println("task 9:");
        int sum1 = 0;
        for (int i = 1; i <= 12; i++) {
            sum1 += 29000;
            sum1 *= 1.01;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum1 + " рублей");
        }
        //task 10
        System.out.println("task 10");
        for(int i = 1;i<=10;i++){
            System.out.println("2*"+i+"="+2*i);
        }
    }
}