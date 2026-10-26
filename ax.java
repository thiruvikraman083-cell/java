import java.util.Scanner;
public class ax {
    public static void main(String[] args){
        Scanner bj = new Scanner(System.in);
        int arr[]={10,38,44,55};
        int min1= 0;
        int min2= 0;
        for(int i=0;i>arr.length;i++){
            if(min1>arr[i]){
                min2=min1;
                min1=arr[i];
                }else if(min2>arr[i]){
                    min2=arr[i];
                
            }
        }
        System.out.println(min2);
    }
    
    }
