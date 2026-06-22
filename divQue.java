import java.util.Scanner;
public class divQue{
    public static int divQue(int dividend, int divisor){
        // arm length - trivia / validation
        if(divisor == 0){
        return -1;
        }
        if(dividend < divisor){
             return 0;
        }     
        //call_helper
             return divQue_helper (dividend,divisor);
        }     
    private static int divQue_helper(int dividend, int divisor){
            //base case
            if(dividend < divisor){
             return 0;
            }
         //recursive case
             return 1 + divQue_helper( dividend - divisor,divisor);
}        
     
            public static void main(String[]parameter){
                Scanner kbrd = new Scanner(System.in);
                int dividend = kbrd.nextInt();
                int divisor = kbrd.nextInt();
                
                
                int quotient = divQue(dividend,divisor);
                 
                System.out.println(quotient);
                kbrd.close();
}
}    

        

    

    