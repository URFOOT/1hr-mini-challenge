import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double A;
        double B;
        double numberA;
        double numberB;
       double number;
      
        System.out.println("Enter the 1st number");

        A = input.nextDouble();

        System.out.println("Enter the 2nd number");

   B = input.nextDouble();

   System.out.println("1 for Addition or 2 for Subtraction");

   number = input.nextDouble();
numberA = A;
numberB = B;
   if(number == 1){
    number = Addition(A, B);
    System.out.println( numberA+numberB);
   }
   if(number == 2){
   number = Subtraction(A, B);
   System.out.println( numberA-numberB);
   }
   
   
  

       
   
   
   
   
    }
    public static double Addition(double numberA, double numberB){
        return numberA + numberB;
    }
    public static double Subtraction(double numberA, double numberB){
        return numberA + numberB;
    }
}































