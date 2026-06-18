import java.util.Scanner;
public class vote{
 public static void main (String[] parameter){
 Scanner kbrd = new Scanner(System.in);
 int Age = kbrd.nextInt();
 if(Age>=18){
  System.out.println("You are a Major,you are eligible to vote");
 }
 else{
  System.out.println("You are a Minor,you are not eligible to vote");
 }
 }
}