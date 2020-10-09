public class Bai8 {
    public static void main(String[] args) {
        System.out.println("*** Bài 8: Liệt kê tất cả các số thuận nghịch độc có sáu chữ số.");
        System.out.println("Tất cả các số thuận nghịch có 6 chữ số là: ");
        for (int i = 100000; i < 1000000; i++) {
            if (isReversible(i)) {
                System.out.println(i);
            }
        }
    }
     
    public static boolean isReversible(int n) {
        String numberStr = String.valueOf(n);
        int size = numberStr.length();
        for (int i = 0; i < (size/2); i++) {
            if (numberStr.charAt(i) != numberStr.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
