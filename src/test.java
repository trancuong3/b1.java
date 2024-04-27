import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a\n");
        int a=scanner.nextInt();
        System.out.println("enter b\n");
        int b=scanner.nextInt();
        System.out.println("enter c\n");
        int c=scanner.nextInt();
        if (a != 0) {
            double s = (c - b) / a;
            System.out.printf("Equation pass with x = %f \n", s);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
