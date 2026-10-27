 import java.util.Scanner;
public class search {
    public static void main(String[] args){
        Scanner bj = new Scanner(System.in); {
    int arr[]={10,20,10,40,20,20,10,30,40,50};
    }
    static int countOccurances(int[] arr, int target) {
        int count = 0;
        for (int value : arr) {
            if (value == target) {
                count++;
            }
        }       
        return count;
    }
}