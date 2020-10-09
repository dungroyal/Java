import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        System.out.println("*** Bài 12: Tính giá trị của đa thức theo cách tính của Horner.");
        System.out.println("Nhập bặc của đẳng thức n= ");
        int number = intInput();
        int[] arr = new int[number + 1];
        for (int i = number; i >= 0; i--) {
            System.out.print("Nhập hệ số của x^" + i + " = ");
            arr[i] = intInput();
        }
        Horner(arr, number);
    } 

    public static void Horner(int a[], int n) {
        int T = 0, i, x;
        System.out.print("\nNhập X= ");
        x = intInput();
        T = a[n];
        for (i = n; i > 0; i--) {
            T = T * x + a[i - 1];
        }
        System.out.print(">> Giá trị của bấc đẳng thức theo Horner là: " + T);
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
