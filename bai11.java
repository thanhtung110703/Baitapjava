import java.util.Scanner;
import java.util.Arrays;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng và nhập giá trị
        int[] A = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // In mảng ban đầu
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(A);

        // In mảng sau khi sắp xếp
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

