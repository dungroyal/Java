import java.util.*;

public class _Bai33 {
    public static String doiViTri(String strInput) {
        String str = _Bai31.chuanHoa(strInput);
        StringTokenizer strToken = new StringTokenizer(str, " ");
        String ho = strToken.nextToken();
        String hoDem = strToken.nextToken();
        String ten = strToken.nextToken();
        String strOutput = ten + " " + ho + " " + hoDem;
        return (strOutput);
    }

    public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner input= new Scanner(System.in);
    System.out.println("Nhap vao ho ten ( ho-ho dem -ten) : ");
    String strInput= input.nextLine();
    System.out.println("Ho va ten duoc sap xep lai (ten- ho - ho dem) : "+doiViTri(strInput));
    }
}