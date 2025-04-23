import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi bất kỳ: ");
        String input = scanner.nextLine();

        int demThuong = 0;
        int demHoa = 0;
        int demSo = 0;

        // Duyệt từng ký tự trong chuỗi
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLowerCase(c)) {
                demThuong++;
            } else if (Character.isUpperCase(c)) {
                demHoa++;
            } else if (Character.isDigit(c)) {
                demSo++;
            }
        }

        // In kết quả
        System.out.println("Số ký tự thường: " + demThuong);
        System.out.println("Số ký tự hoa: " + demHoa);
        System.out.println("Số ký tự là số: " + demSo);
    }
}
