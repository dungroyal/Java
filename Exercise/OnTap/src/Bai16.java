import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        System.out.println("*** Bài 16: Nhập số liệu  cho dãy số thực  a0 , a1 ,..., an-1 . In ra màn hình số lần xuất hiện của các phần tử.");
        System.out.print("Nhập chiều dài mảng A: ");
        int n = intInput();
        int array[] = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("A" + "[" + i + "]" + "=");
            array[i] = intInput();
        }
        for (int i = 0; i < n; i++) {
            if (count(array, i, array[i]) == 0) {
                System.out.println(">> Phần tử " + array[i] + " xuất hiện " + count(array, n, array[i]) + " lần");
            }
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

    public static int count(int a[], int n, int i) {
        int count = 0;
        for (int x = 0; x < n; x++) {
            if (a[x] == i)
                count++;
        }
        return (count);
    }
}
