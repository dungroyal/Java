import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Bài 6: Chương trình tìm số Fibonacci thứ n.");

        System.out.print("Nhập số nguyên bất kì: ");
        int number = scanner.nextInt();

        System.out.println("Số fibonacci thứ "+number+" là:"+fibonaci(number));
    }
    
    public static int fibonaci(int n){
        if(n == 1 || n ==2)return 1;
        return fibonaci(n-1) + fibonaci(n-2);
       }
    }
