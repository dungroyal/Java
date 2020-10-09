import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        System.out.println("*** Bài 17: Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng sau: Tính tổng các chữ số của n, Phân tích n thành các thừa số nguyên tố.");
        System.out.print("\nNhập số nguyên dương n bất kì: ");
        int n = intInput();
        System.out.println("\n   1.Tổng các chữ số của " + n + " là: " + SUM(n));
        System.out.print("   2.Số " + n + " được  thành các thừa số nguyên tố là:");
        Convert(n);
    }

    public static int SUM(int n) {
        int number = n;
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number = number / 10;
        }
        return sum;
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
}