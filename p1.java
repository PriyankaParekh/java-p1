import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter The Second Nnumber: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter The Third Number: ");
        double num3 = sc.nextDouble();
        sc.close();
        System.out.print("Sum Of Entered Numbers Is :" + sum(num1, num2, num3));
        System.out.print("\nThe Average Of Entered Numbers Is:" + avr(num1, num2, num3));
    }

    public static double sum(double x, double y, double z) {
        return x + y + z;
    }

    public static double avr(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}