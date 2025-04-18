import java.util.Scanner;

public class thangtrongnam  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 1 số từ bàn phím
        System.out.print("Nhap so tu 1-12: ");
        int so = scanner.nextInt();
        String Thang;
        switch (so) {
            case 1: Thang = "Thang 1";
                break;

            case 2: Thang = "Thang 2";
                
                break;
            case 3: Thang = "Thang 3";
                
                break;
            case 4: Thang = "Thang 4";
                
                break;
            case 5: Thang = "Thang 5";
                
                break;
            
            case 6: Thang = "Thang 6";
                
                break;
            case 7: Thang = "Thang 7";
                
                break;
            case 8: Thang = "Thang 8";
                
                break;
            case 9: Thang = "Thang 9";
                
                break;
            case 10: Thang = "Thang 10";
                
                break;
            case 11: Thang = "Thang 11";
                
                break;
            case 12: Thang = "Thang 12";
                
                break;

            default: Thang = "so khong hop le, vui long nhap so tu 1 den 7";
                break;
        }
        System.out.println(Thang);

        scanner.close();

}
}


