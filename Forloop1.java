import java.util.Scanner;
public class Forloop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int even= 0;
        int odd= 0;
        System.out.println("The number is: " + input);
        for(int i=1; i<=input; i++){
            if(i % 2 == 0){
                even+=1;
            } else {
                odd+=1;
            }
        }
        System.out.println("The sum even:"+even + " The sum odd:"+odd);
        sc.close();
    }
}