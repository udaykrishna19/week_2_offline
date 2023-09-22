public class Commandline {
    public static void main(String [] args){
        if(args.length == 0){
            System.out.println("no value");
        }
        else{
            for(String s : args)
            System.out.print(s+",");
        }
    }
    
}
