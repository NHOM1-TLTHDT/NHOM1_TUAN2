package Bai_TH_Tuan_2;
//1.	Viết chương trình nhập vào tên của mình và xuất ra màn hình “Hello + Tên”

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        System.out.println("Hãy Nhập Tên Của Bạn");
        a = scanner.nextLine();
        System.out.println("Hello! " + a);
        scanner.close();
    }
}
