import java.util.*;

class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String name = sc.nextLine();
        
        
        System.out.println("Length: " + name.length());
        
       
        System.out.println("Uppercase: " + name.toUpperCase());
        
       
        System.out.println("Lowercase: " + name.toLowerCase());
        
       
        System.out.println("First character: " + name.charAt(0));
        
        
        System.out.println("Equals 'hello': " + name.equals("hello"));
        
        
        System.out.println("Contains 'a': " + name.contains("a"));
        
        
        if (name.length() >= 3) {
            System.out.println("Substring (0,3): " + name.substring(0, 3));
        }
        
        
        System.out.println("Replace 'a' with 'x': " + name.replace('a', 'x'));
        
        sc.close();
    }
}
