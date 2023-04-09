import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Marks obtained in Subject 1 :");
            int a = sc.nextInt();
            System.out.println("Enter Marks obtained in Subject 2 :");
            int b = sc.nextInt();
            System.out.println("Enter Marks obtained in Subject 3 :");
            int c = sc.nextInt();
            System.out.println("Enter Marks obtained in Subject 4 :");
            int d = sc.nextInt();
            System.out.println("Enter Marks obtained in Subject 5 :");
            int e = sc.nextInt();

            float per = (a+b+c+d+e)*100/500;
            System.out.printf("Percent marks is = %f",per);
        }
    }
}
