import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner inside main

        System.out.println("enter a value");
        int a = sc.nextInt();

        System.out.println("enter b value");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}