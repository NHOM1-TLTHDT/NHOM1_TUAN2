package Bai_TH_Tuan_2;
/*
3.	Nhập vào hai số nguyên từ bàn phím. Tính tổng, hiệu, tích, thương và phần dư của hai số đó. In kết quả ra màn hình.
 */

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean validInput = false;
        do {
            try {
                System.out.print("Nhập Số Nguyên a: ");
                a = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Yêu cầu nhập lại số nguyên a! Hãy nhập số nguyên");
                scanner.next();
            }
        } while (!validInput);
        validInput = false;
        do {
            try {
                System.out.print("Nhập Số Nguyên b: ");
                b = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Yêu cầu nhập lại số nguyên b! Hãy nhập số nguyên");
                scanner.next();
            }
        } while (!validInput);
        int tong = a + b;
        System.out.println(a + " + " + b + " là: " + tong);
        int hieu = a - b;
        System.out.println(a + " - " + b + " là: " + hieu);

        if (b != 0) {
            float thuong = (float) a / b;
            System.out.println(a + " / " + b + " là: " + thuong);
        } else {
            System.out.print(a + " / " + b + ": ");
            System.out.println("Lỗi!!!Không thể chia cho 0");
        }

        int tich = a * b;
        System.out.println(a + " * " + b + " là: " + tich);
        if (b != 0) {
            int du = a % b;
            System.out.println(a + "%" + b + " là: " + du);
        } else {
            System.out.print(a + " % " + b + ": ");
            System.out.println("Lỗi!!!Không thể chia cho 0");
        }
        scanner.close();

    }
}
