import java.util.*;

public class Bai13 {
    public static void main(String[] args) {
        System.out.println("*** Bài 13: Nhập số liệu cho 2 dãy số thực a0 , a1 ,.., am-1 và b0 , b1 ,.., bn-1. Giả sử cả 2 dãy này đã được sắp theo thứ tự tăng dần. Hãy tận dụng tính sắp xếp của 2 dãy và tạo dãy c0 , c1 ,..., cm+n-1 là hợp của 2 dãy trên, sao cho dãy ci cũng có thứ tự tăng dần");
        System.out.print("Nhập chiều dài mảng A: ");
        int a = intInput();
        System.out.print("Nhập chiều dài mảng B: ");
        int b = intInput();

        int arrayA[] = new int[a + b];
        int arrayB[] = new int[b];
        
        System.out.println("\nNhập mảng A: ");
        for (int i = 0; i < a; i++) {
            System.out.print("A" + "[" + i + "]" + "=");
            arrayA[i] = intInput();
        }
        Arrays.sort(arrayA);

        System.out.println("\nNhập mảng B: ");
        for (int i = 0; i < a; i++) {
            System.out.print("B" + "[" + i + "]" + "=");
            arrayB[i] = intInput();
        }
        Arrays.sort(arrayB);

        // Gọp 2 mảng
        for (int i = 0; i < b; i++) {
            addArray(arrayA, a + b + 1, arrayB[i]);
        }
        sortArray(arrayA, 0, a + b);
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

    public static void addArray(int[] a, int n, int pt) {
        a[0] = pt;
        Arrays.sort(a);
    }

    public static void sortArray(int[] a, int begin, int end) {
        System.out.println();
        System.out.print(">> Sắp xếp: ");
        for (int i = begin; i < end; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
}
