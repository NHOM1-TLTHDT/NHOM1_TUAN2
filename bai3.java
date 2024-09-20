import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a=0 ,b=0;
        Boolean gt=false;
        while (!gt)
        {
            System.out.println("Nhập số nguyên thứ nhất: ");
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                gt = true;
            }
            else
            {
                System.out.println("Vui lòng nhập số nguyên hợp lệ.");
                sc.next();
            }

        }
        gt=false;
        while (!gt)
        {
            System.out.println("Nhập số nguyên thứ 2: ");
            if (sc.hasNextInt()) {
                b= sc.nextInt();
                gt = true;

            } else
            {
                System.out.println("Vui lòng nhập số nguyên hợp lệ.");
                sc.next();
            }
        }
        int tong = a + b;
        int hieu = a -b ;
        int tich = a * b;
        double thuong = a / b ;
        double chiadu = a% b ;
        System.out.println( " tổng là " +tong);
        System.out.println( " hiệu là " + hieu);
        System.out.println( " tích là " + tich);
        System.out.println( " thương là " + thuong);
        System.out.println( " chia dư là " + chiadu);


    }
}
