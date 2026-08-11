import java.util.*;

class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times to print?");
        int n = sc.nextInt();  

        int i = 1;  
        do {
            System.out.println("hello");
            i++;
        } while (i <= n);  

        sc.close();
    }
}
