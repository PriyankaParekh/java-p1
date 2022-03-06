import java.util.Scanner;

public class p4_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int num = sc.nextInt();
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (num == 1 || flag == 1 || num == 0) {
            System.out.println("Entered Number Is not Prime");
        } else {
            System.out.println("Entered Number Is Prime");
        }
    }
}
