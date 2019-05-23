/**
 * Created by iyasuwatts on 10/17/17.
 */
// import scanner
import java.util.Scanner; 

public class Main {

    public static void main(String[] args){
        // create scanner object
        Scanner number = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = number.nextInt();
        int y = 0;
        
        for (int x = 1; x <= n; x ++) {
        y = y + x;
        
        }
        System.out.println("The sum of the numbers from 1 to " + n + " is " + y);
        
        
        

    }
}
