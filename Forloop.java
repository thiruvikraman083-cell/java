import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        System.out.println("The number is: " + input);
        for(int i=1; i<=input; i++){
            if(i % 2 == 0){
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
        System.out.println("The sum is even : " +"The sum odd:"+odd);
        sc.close();
    }
        }