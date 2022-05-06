import java.util.Scanner;
public class AlternatePrimeNumber{
    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        System.out.println("The alternate prime numbers within "+num+" are :");
        int item = 2;
        for(int i = 2; i<=num;i++)
        {
            if(isPrime(i))
            {
            	if(item%2==0)
                    System.out.print(i+", ");
                item++;
            }
        }
    }
    static boolean isPrime(int num)
    {
        int item = 2;
        boolean flag = true;
        while (num > item)
        {
            if (num % item == 0)
            {
                flag = false;
                break;
            }
            item++;
        }
        return flag;
    }
}
