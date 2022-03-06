import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        scan.close();
        System.out.println("\nGcd Of Two Number Is :" + intgcd(number1, number2));
    }

    public static int intgcd(int n1, int n2) {
        n1 = (n1 > 0) ? n1 : -n1;
        n2 = (n2 > 0) ? n2 : -n2;
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n2;
    }
}