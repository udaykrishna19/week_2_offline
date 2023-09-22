public class Lastdigit {

    public static boolean lastDigit(int a, int b){
           if(a%10 == b%10){
               return true;
           }
           return false;
    }
    public static void main(String [] args){
        System.out.println(lastDigit(7,17));
    }
}
