import java.util.Scanner;
public class demo {
    public static void main(String[]args)
    {
        Scanner BJ = new Scanner(System.in);
        String Name= BJ.nextLine();
        int age = BJ.nextInt();
        BJ.nextLine();
        String Address = BJ.nextLine();
        System.out.println("my name is "+Name);
        System.out.println("my age is "+age);
        System.out.println("My Address is "+Address);
    }
}
