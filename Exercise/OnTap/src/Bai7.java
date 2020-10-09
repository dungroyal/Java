import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.println("*** Bài 7: Chương trình tìm số Fibonacci thứ n.");

        System.out.print("Nhập số nguyên bất kì: ");
        int number = intInput();

        System.out.println("Số fibonacci thứ "+number+" là:"+fibonaci(number));
    }
    
    public static int fibonaci(int n){
        if(n == 1 || n ==2)return 1;
        return fibonaci(n-1) + fibonaci(n-2);
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
