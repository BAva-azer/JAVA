import java.util.Scanner;
 class domo{
    public static void main(String args[])
  {
    Scanner doo = new Scanner(System.in);
    int num1 = doo.nextInt();
    int num2 = doo.nextInt();

    if(num1==num2)
    {
      System.out.print("both the number are equal");
    }
    else{
      System.out.print("its not equal");
    }
  }
}