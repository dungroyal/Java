import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Bài 2: Chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số b bất kì (1< b≤ 36).");

        System.out.print("Nhập số nguyên bất kì: ");
        int number = scanner.nextInt();
        System.out.print("Nhập B cơ số bạn muốn chuyển đổi (1< B ≤ 36): ");
        int coSo = scanner.nextInt();
        
        System.out.print(">> Chuyển "+ number + " từ hệ cơ số 10 sang hệ cơ số "+ coSo +" là: ");

        String str = chuyen(number,coSo);
        for(int i = 0; i< str.length(); i++ ){
            System.out.print(str.charAt(str.length()-i-1));
            System.out.print("");
        }
    }
    
    static String chuyen(int number, int coSo){
        char code[]={
            '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H',
            'I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','Y','Z','W'
        };

        String str = "";
        int x = 0;
        while(number > 0 ){
            x = number%coSo;
            number /= coSo;
            str+= code[x];
        }
        return str;
    }
}
