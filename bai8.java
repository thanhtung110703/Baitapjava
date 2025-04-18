import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();

        // Khởi tạo biến tổng và mảng số
        int[] mang = new int[n];
        int tong = 0;

        // Nhập từng phần tử và tính tổng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
            tong += mang[i];
        }

        // Tính trung bình cộng
        double trungBinh = (double) tong / n;

        // In kết quả
        System.out.println("Trung bình cộng của " + n + " số là: " + trungBinh);

        scanner.close();
    }
}

