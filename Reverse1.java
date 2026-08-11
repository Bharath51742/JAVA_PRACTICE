import java.util.*;
class Reverse1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str= sc.nextLine();
        String reverse=" ";
        int i=str.length()-1;
        while(i>=0){
            reverse=reverse + str. charAt(i);
            i--;
        }
         System.out.println("reverse "+ reverse);
         sc.close();
    }
} 