import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Bài 6: Chương trình liệt kê n số nguyên tố đầu tiên.");

        System.out.print("Nhập số nguyên bất kì: ");
        int number = scanner.nextInt();

        System.out.print(">> "+number + " số nguyên tố đầu tiên là:");
        int count = 0;
        int i = 0;
        while (number > count) {
            if (isPrimeNumber(i)) {
                System.out.print(" "+i);
                count++;
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
