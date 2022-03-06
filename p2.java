import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rupees:");
        double rup = sc.nextDouble();
        sc.close();
        System.out.println("\nConverted Dollar Is :" + String.format("%.2f", dol(rup)));

    }

    public static double dol(double x) {
        double dollar;
        dollar = x / 60;
        return dollar;
    }
}