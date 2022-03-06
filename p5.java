import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n********Widening*********\n");

        System.out.println("Enter byte value:");
        byte num = scan.nextByte();
        short s = num;
        int i = num;
        long l = num;
        float f = num;
        double d = num;

        System.out.println("short value : " + s);
        System.out.println("int value : " + i);
        System.out.println("long value : " + l);
        System.out.println("float value : " + f);
        System.out.println("double value : " + d);

        scan = new Scanner(System.in);

        System.out.println("\n*******Narrowing*******\n");

        System.out.println("Enter double value:");
        double d2 = scan.nextDouble();
        byte b2 = (byte) d2;
        short s2 = (short) d2;
        int i2 = (int) d2;
        long l2 = (long) d2;
        float f2 = (float) d2;

        System.out.println("short value:  " + s2);
        System.out.println("int value: " + i2);
        System.out.println("long value: " + l2);
        System.out.println("float value:  " + f2);
        System.out.println("byte value: " + b2);
        scan.close();

    }
}