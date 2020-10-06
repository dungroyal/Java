import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Bài 3: Chương trình tính tổng các chữ số của một số nguyên bất kỳ.");

        System.out.print("Nhập số nguyên bất kì: ");
        int number = scanner.nextInt();

        System.out.println(" >> Tổng các chữ số: " + SUM(number));
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
}
