import java.util.Scanner;
public class mark{
    public static void main(String[]parameter){
    Scanner kbrd = new Scanner(System.in);
    int mark1 = kbrd.nextInt();
    int mark2 = kbrd.nextInt();
    int mark3 = kbrd.nextInt();
    //find smallest num using Math.min
    int smallest = Math.min(mark1,Math.min(mark2,mark3));
    //find the highest num of mark 3
    int sumofhighestTwo = (mark1 + mark2 + mark3) - smallest;
    int finalscore = (sumofhighestTwo + 1)/ 2;
    System.out.println(finalscore);
    kbrd.close();
}
}
