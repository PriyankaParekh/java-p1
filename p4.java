import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        int flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number:");
        int num = scan.nextInt();
        scan.close();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }

        if (num == 1 || flag == 1 || num == 0) {
            System.out.println(num + " Is Not Prime Number");
        } else {
            System.out.println(num + " Is Prime Number");
        }

    }
}