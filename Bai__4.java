package Bai_TH_Tuan_2;
/*
    Tính toán lãi suất ngân hàng:
•	Nhập vào số tiền gửi, lãi suất hàng năm và số tháng gửi.
•	Tính số tiền lãi và số tiền gốc cuối kỳ.
•	In kết quả ra màn hình.
Số tiền lãi = Số tiền gửi * lãi suất (%/năm) * số ngày thực gửi/365
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Bai__4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");
        float songaythuc, lai, cuoiki;
        float gui = 0, laixuat = 0, tuthang = 0, denthang = 0, sonam = 0, tunam = 0, dennam = 0;
        int count31 = 0, count30 = 0, hai = 0, nam = 0;
        boolean dk = false;
        boolean dkt = true;
        String thoihan;
        System.out.println("++-----Chào Bạn Đến Với Chương Trình Tính Lãi Xuất-----++");
        do {
            try {
                System.out.print("Nhập số tiền bạn muốn gửi: ");
                gui = scanner.nextFloat();
                if (gui < 100000) {
                    System.out.println("Số tiền gửi phải lớn hơn 100,000VNĐ. Yêu cầu nhập lại!!!");
                    dk = false;
                } else {
                    dk = true;
                }
            } catch (Exception e) {
                System.out.println("Lỗi nhập số tiền gửi. Vui lòng nhập lại!!!");
                scanner.next();
            }
        } while (!dk);
        //dk đang đúng
        do {
            try {
                System.out.print("Nhập lãi xuất hằng năm của ngân hàng bạn gửi: ");
                laixuat = scanner.nextFloat();
                scanner.nextLine();
                if (laixuat <= 0) {
                    System.out.println("Lỗi nhập lãi xuất!!!. Yêu cầu nhập số nguyên dương");
                    dk = true;
                } else {
                    dk = false;
                }
            } catch (Exception e1) {
                System.out.println("Lỗi nhập lãi xuất hằng năm. Vui lòng nhập lại!!!");
                scanner.next();
            }
        } while (dk);
        //dk đang sai
        do {

            System.out.print("Bạn muốn gủi theo 'Tháng' hay theo 'năm': ");
            thoihan = scanner.nextLine();
            switch (thoihan.toLowerCase()) {
                case "tháng":
                    do {
                        try {
                            System.out.print("Bạn muốn gủi từ tháng: ");
                            tuthang = scanner.nextFloat();
                            System.out.print("Đến hết tháng: ");
                            denthang = scanner.nextFloat();
                            if (tuthang > 12 || tuthang < 1 || denthang < 1 || denthang > 12) {
                                System.out.println("Lỗi nhập tháng!!!. Tháng phải lớn hơn 0 và nhỏ hơn 13");
                                dkt = true;
                            } else if ((denthang < tuthang) || (tuthang == denthang)) {
                                System.out.println("Lỗi nhập dữ liệu!!!. Tháng bắt đầu phải nhỏ hơn Tháng kết thúc");
                                dkt = true;
                            } else {
                                dkt = false;
                            }
                        } catch (Exception e2) {
                            System.out.println("Lỗi nhập dữ liệu!!!. Vui lòng nhập đúng Tháng bắt đầu và tháng kết thúc");
                            scanner.next();
                        }
                    } while (dkt);
                    //dkt đang sai
                    do {
                        try {
                            System.out.print("Nhập năm mà bạn gửi: ");
                            nam = scanner.nextInt();
                            if (nam < 1765) {
                                System.out.println("Lỗi nhập số năm!!!. Ngân hàng mở sổ tiết kiệm đầu tiền vào năm 1765");
                                dkt = false;
                            } else {
                                dkt = true;
                            }
                        } catch (Exception e3) {
                            System.out.println("Lỗi nhập số năm!!!. Vui lòng nhập đúng số năm");
                            scanner.next();
                        }
                    } while (!dkt);
                    //dkt đang đúng

                    for (float i = tuthang; i <= denthang; i++) {
                        if (i == 2) {
                            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                                hai = 29;
                            } else {
                                hai = 28;
                            }
                        }
                        if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                            count31++;
                        }
                        if (i == 4 || i == 6 || i == 9 || i == 11) {
                            count30++;
                        }
                    }
                    songaythuc = 30 * count30 + 31 * count31 + hai;
                    lai = gui * (laixuat / 100) * (songaythuc / 365);
                    System.out.println("Tiền lãi bạn nhận được nếu gửi " + df.format(gui) + " VNĐ từ tháng " + tuthang + " đến tháng " + denthang + " là: " + df.format(lai) + " VNĐ");
                    cuoiki = gui + lai;
                    System.out.println("Tiền gốc cuối kì của bạn nhận về là: " + df.format(cuoiki) + " VNĐ");
                    dk = true;
                    break;
                case "năm":
                    do {
                        try {
                            System.out.print("Bạn muốn gửi trong bao nhiêu năm: ");
                            sonam = scanner.nextFloat();
                            if (sonam < 1) {
                                System.out.println("Lỗi nhập số năm!. Vui lòng nhập lớn hơn 0");
                                dkt = true;
                            } else {
                                dkt = false;
                            }
                        } catch (Exception e4) {
                            System.out.println("Lỗi nhập số năm!. Vui lòng nhập đúng");
                        }
                    } while (dkt);
                    //dkt đang sai
                    if (sonam == 1) {
                        do {
                            try {
                                System.out.print("Năm bạn gửi là năm nào: ");
                                nam = scanner.nextInt();
                                if (nam < 1765) {
                                    System.out.println("Lỗi nhập số năm!!!. Ngân hàng mở sổ tiết kiệm đầu tiền vào năm 1765");
                                    dkt = false;
                                } else {
                                    dkt = true;
                                }
                            } catch (Exception e3) {
                                System.out.println("Lỗi nhập số năm!!!. Vui lòng nhập đúng số năm");
                                scanner.next();
                            }
                        } while (!dkt);
                        //dkt đang đúng
                        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                            hai = 366;
                        } else {
                            hai = 365;
                        }
                        songaythuc = hai;
                        lai = gui * (laixuat / 100) * (songaythuc / 365);
                        System.out.println("Tiền lãi bạn nhận được nếu gửi " + df.format(gui) + " VNĐ trong năm " + nam + " là: " + df.format(lai) + " VNĐ");
                        cuoiki = gui + lai;
                        System.out.println("Tiền gốc cuối kì của bạn nhận về là: " + df.format(cuoiki) + " VNĐ");
                    } else if (sonam > 2) {
                        do {
                            try {
                                System.out.print("Bạn muốn gửi từ năm: ");
                                tunam = scanner.nextFloat();
                                System.out.print("Đến hết năm: ");
                                dennam = scanner.nextFloat();
                                if((dennam-tunam+1)!=sonam){
                                    System.out.println("Lỗi!!!. Số năm và khoảng thời gian giữa hai năm bạn nhập không trùng nhau");
                                    System.out.println("Vui lòng nhập lại");
                                    dkt=true;
                                }else if (tunam < 1765 || dennam < 1766) {
                                    System.out.println("Lỗi nhập năm!. Năm bắt đầu phải lớn hơn 1765 và Năm kết thức phải lớn hơn 1766");
                                    dkt = true;
                                } else if ((dennam < tunam) || (tunam == dennam)) {
                                    System.out.println("Lỗi nhập dữ liệu!!!. Năm bắt đầu phải nhỏ hơn Năm kết thúc");
                                    dkt = true;
                                } else {
                                    dkt = false;
                                }
                            } catch (Exception e2) {
                                System.out.println("Lỗi nhập dữ liệu!!!. Vui lòng nhập đúng Năm bắt đầu và Năm kết thúc");
                                scanner.next();
                            }
                        } while (dkt);
                        for (float i = tunam; i <= dennam; i++) {
                            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                                hai += 366;
                            } else {
                                count31 += 365;
                            }
                        }
                        songaythuc = hai + count31;
                        lai = gui * (laixuat / 100) * (songaythuc / 365);
                        System.out.println("Tiền lãi bạn nhận được nếu gửi " + df.format(gui) + " VNĐ từ năm " + tunam + " đến năm " + dennam + " là: " + df.format(lai) + " VNĐ");
                        cuoiki = gui + lai;
                        System.out.println("Tiền gốc cuối kì của bạn nhận về là: " + df.format(cuoiki) + " VNĐ");
                    }
                    dk = true;
                    break;
                default:
                    System.out.println("Lỗi nhâp 'Tháng' hoặc 'Năm'!!!. Vui lòng nhập đúng 'Tháng' hoặc 'Năm'");
                    dk = false;
                    break;
            }
        } while (!dk);

    }
}
