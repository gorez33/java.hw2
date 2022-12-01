import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum(20, 30);
        System.out.println(sun(20,20));
        System.out.println(sum1(11.4, 14.4));



        int a ;
        System.out.println("введите целое число");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("вы ввели " + a);


        double b;
        System.out.println("введите дробное число");
        b = scanner.nextDouble();
        System.out.println("вы ввели " + b);

        char c;
        System.out.println("введите текст");
        c = scanner.next().charAt(0);
        System.out.println(c);

    }

    static void sum (int a, int b) {
        System.out.println(a + b);
    }
    static int sun (int a, int b){
        return (a + b);
    }
    static double sum1 (double a, double b){
        return (a * b);
    }



}