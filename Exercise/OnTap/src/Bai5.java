import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Bài 5: Chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.");

        System.out.print("Nhập số nguyên bất kì: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(" >> "+ number +" không phải là số nguyên tố.");
        }else{
            System.out.print("Số nguyên tố nhỏ hơn "+number+" là:");
            for (int i = 2; i < number; i++) {
                if (isPrimeNumber(i)) {
                    System.out.print(" "+i);
                }
            }
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
