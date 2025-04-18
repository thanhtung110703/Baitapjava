import java.util.Scanner;

public class ngaytrongtuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 1 số từ bàn phím
        System.out.print("Nhap so tu 1-7: ");
        int ngay = scanner.nextInt();
        String Thu;
        switch (ngay) {
            case 1: Thu = "Thu hai";
                break;

            case 2: Thu = "Thu ba";
                
                break;
            case 3: Thu = "Thu tu";
                
                break;
            case 4: Thu = "Thu nam";
                
                break;
            case 5: Thu = "Thu sau";
                
                break;
            
            case 6: Thu = "Thu bay";
                
                break;
            case 7: Thu = "Thu chu nhat";
                
                break;
            default: Thu = "so khong hop le, vui long nhap so tu 1 den 7";
                break;
        }
        System.out.println(Thu);

        scanner.close();

}
}
