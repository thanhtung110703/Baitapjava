import java.util.Scanner;

public class MayTinhDonGian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 2 số
        System.out.print("Nhap so thứ nhat: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double b = scanner.nextDouble();

        // Thực hiện phép tính
        System.out.println("Ket qua:");
        System.out.println("Cong: " + (a + b));
        System.out.println("Tru: " + (a - b));
        System.out.println("Nhân: " + (a * b));
        if (b != 0) {
            System.out.println("Chia: " + (a / b));
        } else {
            System.out.println("Chia: Không thể chia cho 0!");
        } 
        System.out.println("Chia lay du: " + (a % b));
        if (a > b) {
            System.out.println(a + " lớn hơn " + b);
        } else if (a < b) {
            System.out.println(a + " nhỏ hơn " + b);
        } else {
            System.out.println(a + " bằng " + b);
        }

        scanner.close();
    }
}
