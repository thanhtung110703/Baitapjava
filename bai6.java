import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            long giaithua = 1;
            System.out.print("Nhập một số nguyên: ");
            int so = scanner.nextInt();
            for( int i=1 ; i<=so ; i++ ){
                giaithua = giaithua * i;
            }


        System.out.println(so + "! =" + giaithua);
        scanner.close();
    }
}
