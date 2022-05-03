import java.util.Scanner;
import java.lang.Math;

public class SumTheDigits{
    public static void main(String[] args){
        System.out.print("Enter a number to sum the digits: ");
        Scanner scan = new Scanner(System.in);
        try {
            int num1 = scan.nextInt();
            System.out.println(sumDigits(num1));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            scan.close();
        }
    }

    public static int sumDigits(int num){
        //method that sums each singular digit in an integer num
        int len = NumberLength(num);
        int result=0;
        for(int i=1; i<=len; i++){ //loop for every digit in num
            result = result + ExtractDigit(num, i); //extract each digit and add it to the running sum
        }
        return result;
    }

    public static int NumberLength(int num){
        //method that returns number of digits in a number
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return count;
    }

    public static int ExtractDigit(int num, int pos){
        //for loops using this must start from i=1
        int digit = (int)Math.pow(10, pos);
        int denom = (int)Math.pow(10, pos-1);
        System.out.println(digit+ "digit:denom  " +denom);
        return (num%digit)/denom;
    }
}