import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner isr = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows: ");
        int n = isr.nextInt();
        isr.close();

        int a[][] = new int[50][50];

        int i = 0, j = 0;

        for (i = 0; i < n; i++) {
            a[i][i] = a[i][0] = 1;
        }
        for (i = 0; i < n; i++) {
            for (j = 1; j < i; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}