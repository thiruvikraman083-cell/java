// Online Java Compiler (Editor)
// Write and run Java online using this editor
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x=10;
        while(x-->0){
            int y=x+2;
            int z=y+x;
            if(y>z){
                x--;
            } else {
                x++;
            }
            x--;
            System.out.println(x);
        }
    }
    
}
