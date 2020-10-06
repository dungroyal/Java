import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Bài 4: Chương trình phân tích số nguyên N ra các thừa số nguyên tố.");

        System.out.print("Nhập số nguyên bất kì: ");
        int number = scanner.nextInt();

        Convert(number);
    }

    public static void Convert(int n) {
        int i = 2;
        while (n > 1) {
            if (isPrimeNumber(i)) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                } else
                    i++;
            } else
                i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
