public class p6 {

    public static void main(String[] args) {
        int[][] myNumbers = { { 1 }, { 2, 2 }, { 3, 3, 3 }, { 4, 4, 4, 4 } };
        int[][] myNumbers2 = { { 4 }, { 3, 3 }, { 2, 2, 2 }, { 1, 1, 1, 1 } };
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j]);
                sum += myNumbers[i][j];
            }
            System.out.print("\n");
        }

        System.out.print("Sum Of First Pattern's Element Is: " + sum);
        System.out.print("\n");

        for (int i = 0; i < myNumbers2.length; ++i) {
            for (int j = 0; j < myNumbers2[i].length; ++j) {
                System.out.print(myNumbers2[i][j]);
                sum2 += myNumbers2[i][j];
            }
            System.out.print("\n");
        }
        System.out.print("Sum Of Second Pattern's Element Is: " + sum2);

    }

}
