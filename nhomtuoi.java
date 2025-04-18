import java.util.Scanner;
public class nhomtuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập tên
        System.out.print("nhap ten cua ban:");
        String Ten = scanner.nextLine();
        //nhập tuổi
        System.out.print("Nhập tuổi của bạn:");
        int tuoi = scanner.nextInt();
        if (tuoi <16){
            System.out.println("Bạn " + Ten + "Ở độ tuổi vị thành niên");
        }
        else if (tuoi>=16 && tuoi <18 ){
            System.out.println("Bạn " + Ten + "Ở độ tuổi trưởng thành");
        }else {
            System.out.println("Bạn " + Ten + "đã già");
        }
        scanner.close();
        }
    }

        

    
