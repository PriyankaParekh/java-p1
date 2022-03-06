import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int num = scan.nextInt();
        scan.close();
        int i = 2;
        while (num <= 1) {
            System.out.println("Please Enter Valid Input.");
            System.exit(1);
        }
        System.out.println(num + "'s Factors Are: ");
        while (num > 1) {
            if (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            } else {
                i++;
            }

        }
    }
}
