import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Bài 1: Tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên.");

        System.out.print("Nhập số nguyên dương A: ");
        int soA = scanner.nextInt();
        System.out.print("Nhập số nguyên dương B: ");
        int soB = scanner.nextInt();

        System.out.println(" >> UCLN: " + UCLN(soA, soB));
        System.out.println(" >> BCNN: " + BCNN(soA, soB));
    }

    public static int UCLN(int a, int b) {
        int temp1 = a;
        int temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int UCLN = temp1;
        return UCLN;
    }

    public static int BCNN(int soA, int soB) {
        return (soA * soB) / UCLN(soA, soB);
    }
}
