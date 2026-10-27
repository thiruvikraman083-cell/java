import java.util.Scanner;
public class missin {
    public static void main(String[]args){
        Scanner bj = new Scanner(System.in);
        // int[]arr = {6,1,0,2,9,5,6,3,7,4};
        // boolean checknew boolean[arr.length];
        // check[0]=true;
        // for(int i=0;i<arr.length;i++){
        //     if(i>0 && i<=arr.length){
        //         check[arr[i]]= true;
        //         System.out.println(i);
        //     }
        //     for (int i=0;i<=check.length;i++){
        //         if(!check)
            // }
            // }

            int [] arr = {5,3,-1,2,1,8};
            int n=1;
            while(true){
                boolean found = false;
                for(int x : arr){
                    if(x==n){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    System.out.println(n);
                    break;
                }
                n++;
            }
        }
           }

