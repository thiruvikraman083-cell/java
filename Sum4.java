import java.util.Scanner;
public class Sum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number of rows: ");
        int n= sc.nextInt();
        int k=1;
        int space = n / 2;
        for(int i=1; i<=n; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=0; j<k; j++){
                System.out.print("*"+" ");
            }
            if (i <= n / 2) {
                k += 2;
                space--;
            } else {
                k -= 2;
                space++;
            }
            System.out.println();
        }
        sc.close();
}
}