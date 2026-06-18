import java.util.Scanner;
public class Sib{
    public static void main(String[]parameter){
    Scanner kbrd = new Scanner(System.in);
    String name1 = kbrd.nextLine();
    String name2 = kbrd.nextLine();
    String name3 = kbrd.nextLine(); 
    int age1 = kbrd.nextInt();
    int age2 = kbrd.nextInt();
    int age3 = kbrd.nextInt();
    if(age1 > age2 && age1 > age3){
        System.out.println( name1+ " is the eldest ");
    }
      else if(age1 < age2 && age1 < age3){
        System.out.println( name1 + " is the youngest ");
      }
    else{
        System.out.println( name1 + " is the middle ");
    }
    if (age2 > age3 && age2 > age1){
        System.out.println(name2 + " is the eldest ");
    }
   
      else if(age2 < age3 && age2 < age1){
        System.out.println(name2 + " is the youngest ");
      }    
    else{
        System.out.println(name2 + " is the middle  ");
    }        
    if (age3 > age1&& age3 > age2){  
       System.out.println(name3 + " is the eldest ");
    }
      else if(age3 < age1&& age3 < age2){  
       System.out.println(name3 + " is the youngest"); 
    }   
    else {
        System.out.println(name3 + " is the middle ");
    }
        
    }
    }