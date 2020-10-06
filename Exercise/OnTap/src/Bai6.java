import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Bài 6: Chương trình liệt kê n số nguyên tố đầu tiên.");

        System.out.print("Nhập số nguyên bất kì: ");
        int number = scanner.nextInt();

        
        System.out.print(" >> "+ number +" số nguyên tố đầu tiên là: ");
        int i = 2;
        int count = 0;
        while (count < number) {
            if (isPrimeNumber(i)) {
                System.out.print(i+" ");
                count++;
            }
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
