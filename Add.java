import  java.util.Scanner;
public class Add {
    public static void main(String[] args)
    {
        System.out.println("Taking input from user.");
        try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        System.out.println("The sum of given numbers is");
        System.out.println(a+b);
        }
    }
}