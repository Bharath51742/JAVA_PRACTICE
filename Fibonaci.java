import java.util.*;
class Fibonaci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int i=1;
        while(i<=n){
            System.out.println(" a " + a);
            int c=a+b;
            a=b;
            b=c;
            i++;      
            }
            sc.close();
    }
}
