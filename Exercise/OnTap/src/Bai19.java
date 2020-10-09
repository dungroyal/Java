import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        System.out.println("*** Bài 19: Chương trình liệt kê tất cả các số nguyên tố có 5 chữ số sao cho tổng của các chữ số trong mỗi số nguyên tố đều bằng S cho trước.");
        System.out.print("Nhập tổng các chữ số của số nguyên tố có 6 chữ số: ");
        int number = intInput();
        int stt = 0;
        for (int i = 10000; i < 100000; i++) {
            if (isPrimeNumber(i) && SUM(i)==number) {
                System.out.println(i);
                stt = 1;
            }
        }

        if (stt == 0) {
            System.out.println(">> Không có số nguyên tố nào 6 chữ số có tổng bằng "+number);
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

    public static int SUM(int a) {
        int number = a;
        int sum = 0;
        while (number > 0 ) {
            sum += (number % 10);
            number = number/10;
        }
        return sum;
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
