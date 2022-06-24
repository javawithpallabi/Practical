 import java.util.Scanner;
class Getinput
{
   public static void main(String[] args)
   {
      int num;
      Scanner a = new Scanner(System.in);
      
      System.out.print("Enter an Integer Value: ");
      num = a.nextInt();
      
      System.out.println("\nYou've entered: " +num);
   }
}