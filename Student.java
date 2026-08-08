public class Student{
    
    int instanceVar = 10;


    static int staticVar = 20;

    public void display() {
        
        int localVar = 30;
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }
    public static void main(String[] args) {
    Student obj = new Student();
        obj.display();
    }
}
