import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        System.out.println("*** Bài 20: Chương trình liệt kê các số Fibonaci nhỏ hơn n là số nguyên tố.");
        System.out.print("Nhập n: ");
        int n = intInput();
        System.out.printf("Các số fibonacci nhỏ hơn "+n+" và là số nguyên tố: ");
        int i = 0;
        while (fibonacci(i) < n) {
            int fi = fibonacci(i);
            if (isPrimeNumber(fi)) {
                System.out.print(fi + " ");
            }
            i++;
        }

    }

    public static int intInput() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = scanner.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập số! hãy nhập lại...");
                scanner.nextLine();
            }
        }
        return (n);
    }  

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
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
