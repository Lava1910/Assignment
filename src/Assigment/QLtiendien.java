package Assigment;

import java.util.Date;
import java.util.Scanner;



public class QLtiendien {
        private String name;
        private int id;
        private Date date;
        private int amout;
        private String subject;
        private String country;

        public void KhachHangVN() {
        }

        public void KhachHangVN(String name, int id, Date date, String subject, int amout) {
                this.name = name;
                this.id = id;
                this.date = date;
                this.subject = subject;
                this.amout = amout;
        }

        public void nhapKhachHangVN() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập mã khách hàng: ");
                id = scanner.nextInt();
                System.out.print("Nhập tên chủ hộ: ");
                name = scanner.next();
                System.out.print("Nhập đối tượng:  ");
                subject = scanner.next();
                System.out.print("Nhập số số điện: ");
                amout = scanner.nextInt();
        }


        public void KhachhangNN() {
        }

        public void KhachhangNN(String name, int id, Date date, String country, int amout) {
                this.name = name;
                this.id = id;
                this.date = date;
                this.country = country;
                this.amout = amout;
        }

        public void nhapKhachHangNN() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập mã khách hàng: ");
                id = scanner.nextInt();
                System.out.print("Nhập tên chủ hộ: ");
                name = scanner.next();
                System.out.print("Nhập quốc tịch:  ");
                country = scanner.next();
                System.out.print("Mã số số điện: ");
                amout = scanner.nextInt();
        }


        public int hoaDonVN(int amout) {
                int total = 0;
                int amout1;
                if (amout < 50) {
                        total = amout * 1000;
                } else if (amout < 100) {
                        amout1 = amout - 50;
                        total = amout1 * 1200 + 50 * 1000;
                } else if (amout < 200) {
                        amout1 = amout - 100;
                        total = amout1 * 1500 + 50 * 1000 + 50 * 1200;
                } else {
                        amout1 = amout - 200;
                        total = amout1 * 2000 + 50 * 1000 + 50 * 1200 + 100 * 1500;
                }
                return total;
        }

        public int hoaDonNN(int amout) {
                int total = 0;
                total = amout * 2000;
                return total;
        }

        public void hienThiHoaDonVN() {
                System.out.println("Mã khách hàng: " + id);
                System.out.println("Tên chủ hộ: " + name);
                System.out.println("Đối tượng: " + subject);
                System.out.println("Số điện: " + amout);
                System.out.println("Số tiền: " + hoaDonVN(amout));
        }

        public void hienThiHoaDonNN() {
                System.out.println("Mã khách hàng: " + id);
                System.out.println("Tên chủ hộ: " + name);
                System.out.println("Quốc tịch: " + country);
                System.out.println("Số điện: " + amout);
                System.out.println("Số tiền: " + hoaDonNN(amout));
        }

        public static void main(String[] args) {
                QLtiendien khachHang1 = new QLtiendien();
                Scanner sc = new Scanner(System.in);
                System.out.println("Khach hang la nguoi Viet Nam khong (1/0):  ");
                int x = sc.nextInt();
                if (x == 1) {
                        khachHang1.KhachHangVN();
                        khachHang1.nhapKhachHangVN();
                        khachHang1.hienThiHoaDonVN();
                } else if (x == 0) {
                        khachHang1.KhachhangNN();
                        khachHang1.nhapKhachHangNN();
                        khachHang1.hienThiHoaDonNN();
                } else {
                        System.out.println("Nhap sai, moi nhap lai: ");
                }
        }
}

