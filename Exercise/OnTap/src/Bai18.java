import java.util.*;

public class Bai18 {
    public static void main(String[] args) {
        System.out.println("*** Bài 18: Nhập một xâu ký tự. Đếm số từ của xâu ký tự đó.");
        Scanner input= new Scanner(System.in);
        System.out.print("Nhập một xâu ký tự: ");
        String str= input.nextLine();
        StringTokenizer strToken= new StringTokenizer(str, " ");
        System.out.println("Số từ của xâu ký tự : "+strToken.countTokens());
    }
}
