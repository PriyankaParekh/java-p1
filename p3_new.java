import java.util.Scanner;

public class p3_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int[] Marks = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter Marks:-");
            Marks[i] = sc.nextInt();
            if (Marks[i] > 100 || Marks[i] < 0) {
                System.out.println("Please Enter Valid Marks.");
                i--;
                continue;
            }
            sum = sum + Marks[i];

        }
        sc.close();
        System.out.println("Percentage of student is:- " + String.format("%.2f", (sum / 600) * 100) + "%");

    }
}