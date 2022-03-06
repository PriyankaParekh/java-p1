import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter " + (i + 1) + " Subject Marks: ");
            marks[i] = scan.nextInt();

            if (marks[i] > 100 || marks[i] < 0) {
                System.out.println("Please Enter Valid Marks.");
                i--;
            } else {
                sum += marks[i];
            }
            scan = new Scanner(System.in);
        }
        System.out.println("Percentage Of A Student Is:" + String.format("%.2f", (sum / 600) * 100) + "%");
        scan.close();
    }
}