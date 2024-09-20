import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời nhập số tiền gửi ");
        double Tg=sc.nextDouble();
        System.out.println(" mời nhập lãi suất hàng năm  ");
        double Lsnam=sc.nextDouble();
        System.out.println(" mời nhập số tháng   ");
        double thang=sc.nextDouble();
        double lsthang=Lsnam/12/100 ;
        double sotienlai= Tg*lsthang*thang ;
        double sotiencuoiky=Tg + sotienlai ;
        System.out.println(" số tiền lãi là"  + sotienlai + " VNĐ");
        System.out.println( " số tiền cuối kỳ " +sotiencuoiky + " VNĐ");
    }
}

