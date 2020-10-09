import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        System.out.println("*** Bài 17: Chương trình nhập số n và dãy các số thực hãy cho hiện trên màn hình dãy trên theo thứ tự tăng dần.");
        System.out.print("Nhập chiều dài mảng A: ");
        int n = intInput();
        float array[] = new float[n];
        float temp;
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("A" + "[" + i + "]" + "=");
            array[i] = floatInput();
        }
        System.out.println("\n >> Sắp xếp các phần tử của mảng theo chiều tăng dần: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }

    public static float floatInput() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        float n = 0;
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
