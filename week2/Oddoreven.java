import java.util.Scanner;

public class Oddoreven {
    public static void main(String [] args){
         Scanner scan = new Scanner(System.in);

         System.out.print("enetr number:");
         int x = scan.nextInt();
         if(x%2==0)
         System.out.print("even");
         else
         System.out.print("odd");

         scan.close();
    }
    
}
