import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        System.out.println("*** Bài 14: Chương trình liệt kê các phần tử xuất hiện trong dãy đúng 1 lần.");
        System.out.print("Nhập chiều dài mảng A: ");
        int lengthArray = intInput();
        int array[] = new int[lengthArray];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < lengthArray; i++) {
            System.out.print("A" + "[" + i + "]" + "=");
            array[i] = intInput();
        }
        System.out.print(">> Các phần tử trong dẫy xuất hiện 1 lần:");
        for (int i = 0; i < lengthArray; i++) {
            if (count(array, lengthArray, array[i]) == 1)
                System.out.print(" " + array[i]);
        }
    }
    
    public static int count(int array[], int n, int i) {
        int count = 0;
        for (int x = 0; x < n; x++) {
            if (array[x] == i)
                count++;
        }
        return (count);
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
