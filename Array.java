import java.util.Scanner;
class Array
{
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
         sc.close();
    }
}