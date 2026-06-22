import java.util.Scanner;
public static int countOnBits(int number){

    // arm length - validation

    if(number == 0)
        return 0;

    // set environment

    // call helper - recursive, pass, initiate

    return countOnBits_helper(number);
}

private static int countOnBits_helper(int number)
{
    // base case

    if(number == 0)
        return 0;

    // recursive case

    return (number % 2) + countOnBits_helper(number / 2);
}
public static void main(String[]parameter){
        Scanner kbrd = new Scanner(System.in);
        int number = kbrd.nextInt();
        int result = countOnBits(number);
        System.out.println(result);
    }

