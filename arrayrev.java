import java.util.Scanner;
public class arrayrev {
    public static void main(String[] args){
        Scanner bj = new Scanner(System.in);
       
        int arr []=new int[4];
        for(int i =arr.length;i>=0;i++){
            arr[i]=bj.nextInt();
            System.err.println(arr[i]);
        }
    }
}
