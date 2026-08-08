import java.util.Scanner;
class EvenNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a nuber");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("the number is even");
        }
            else{
                System.out.println("the number is odd");

            }
        }
    }
