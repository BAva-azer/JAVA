import java.util.Scanner;
public class triple{
    public static void main(String[]parameter){
        Scanner kbrd = new Scanner(System.in);
        String n1= kbrd.nextLine();  
        String n2= kbrd.nextLine();
        String n3= kbrd.nextLine(); 
        int age1= kbrd.nextInt();
        int age2= kbrd.nextInt();
        int age3= kbrd.nextInt();
        if(age1 == age2 && age3 == age2){
            System.out.printf(n1 + n2 + n3+ " are triplets");
        }
        else if(age1 == age2 ){
            System.out.println(n1 +" and "+ n2 + " are twins");
        }    
        else if(age1 == age3){
            System.out.printf(n1 +" and "+ n3 + " are twins"); 
        }    
        else if(age2 == age3){
            System.out.println(n2 +" and " + n3+  " are twins"); 
        }
 
        else{
           System.out.printf("not equal");
        }
        if(age1 > age2 && age1 > age3){
            System.out.println(n1 +  " is the greatest"); 
         }
        else if(age2 > age1 && age2 > age3){
            System.out.println(n2 +  " is the greatest"); 
         }
        else{
            System.out.println(n3 +  " is the greatest");
        }   
    }
}
