import java.util.Scanner;
public class thangtrongnam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số từ 1 đến 12: ");
        int so = scanner.nextInt();

        String[] thang = {
            "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6",
            "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"
        };

        if (so >= 1 && so <= 12) {
            System.out.println(thang[so - 1]);
        } else {
            System.out.println("Số không hợp lệ, vui lòng nhập từ 1 đến 12.");
        }

        scanner.close();
    }
}
