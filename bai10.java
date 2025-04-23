import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi, giới hạn không quá 80 ký tự
        String input;
        do {
            System.out.print("Nhập chuỗi (tối đa 80 ký tự): ");
            input = scanner.nextLine();
            if (input.length() > 80) {
                System.out.println("Chuỗi quá dài, vui lòng nhập lại!");
            }
        } while (input.length() > 80);

        // Nhập ký tự cần đếm
        System.out.print("Nhập một ký tự bất kỳ: ");
        char kyTu = scanner.next().charAt(0);  // Lấy ký tự đầu tiên người dùng nhập

        // Đếm số lần xuất hiện của ký tự
        int dem = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == kyTu) {
                dem++;
            }
        }

        // In kết quả
        System.out.println("Ký tự '" + kyTu + "' xuất hiện " + dem + " lần trong chuỗi.");
    }
}
