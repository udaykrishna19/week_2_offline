import java.util.*;

class Positive{
    public static void main(String [] args){
          Scanner scan = new Scanner(System.in);
          System.out.println("enter number:");
          int n = scan.nextInt();

          if(n > 0)
            System.out.println("positive");
          
            else if(n < 0)
            System.out.println("negative");
            
            else
            System.out.println("zero");

            scan.close();

    }
}