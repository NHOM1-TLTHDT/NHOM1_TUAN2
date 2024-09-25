
import java.util.*;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhập số tiền gửi của bạn:");
        double TienGui = sc.nextDouble();

        System.out.printf("nhập tỷ giá LaiSuatNam hàng năm: ");
        double LaiSuatNam = sc.nextDouble();

        System.out.printf("Nhap so thang gui: ");
        int SoThangGui = sc.nextInt();

        double TongLaiDonSauChuKy = TienGui*((LaiSuatNam/100)/12)*SoThangGui;
        double TongLaiKepSauChuKy = (TienGui * Math.pow((1 + ((LaiSuatNam/100)/12)), SoThangGui)) - TienGui;
        double TienGocCuoiKy_LaiDon =  TienGui + TongLaiDonSauChuKy;
        double TienGocCuoiKy_LaiKep =  TienGui + TongLaiKepSauChuKy;
        System.out.println("Tong lai don nhan duoc sau chu ky: " + TongLaiDonSauChuKy);
        System.out.println("Tong tien goc nhan duoc sau chu kỳ lai don: " + TienGocCuoiKy_LaiDon);
        System.out.println("Tong lai kep nhan duoc sau chu kỳ: " + TongLaiKepSauChuKy);
        System.out.println("Tong tien goc nhan duoc sau chu ky lai kep la: " + TienGocCuoiKy_LaiKep);
        sc.close();
    }
}