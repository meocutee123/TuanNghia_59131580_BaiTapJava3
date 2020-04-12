package BaiTapJava4;

public class MyMainClass {
    public static void main(String[] args) {
        QuanLyChuyenXe ql = new QuanLyChuyenXe();
        ChuyenXe NgT = new NoiThanh("1ab", "Nguyen Tuan Nghia", "47f1490-87", 1000, 2, 19.5);
        ChuyenXe NgT2 = new NoiThanh("1ac", "Nguyen Tuan Nga", "47f1490-86", 1000, 2, 19.5);
        ChuyenXe NgT3 = new NoiThanh("1ad", "Nguyen Tuan Nghi", "47f1490-85", 1000, 2, 19.5);

        ql.them(NgT);
        ql.them(NgT2);
        ql.them(NgT3);

        ChuyenXe NoT = new NgoaiThanh("1aba", "Nguyen Tuan Nghia", "47f1490-87", 1000, 2, "Ha Noi");
        ChuyenXe NoT2 = new NgoaiThanh("1acb", "Nguyen Tuan Nga", "47f1490-86", 1000, 2, "Ha Tay");
        ChuyenXe NoT3 = new NgoaiThanh("1adc", "Nguyen Tuan Nghi", "47f1490-85", 1000, 2, "Ha Nam");

        ql.them(NoT);
        ql.them(NoT2);
        ql.them(NoT3);

        ql.xuat();

        System.out.println("Tong doanh thu noi thanh: " + ql.TDTNoiThanh());
        System.out.println("Tong doanh thu ngoai thanh: " + ql.TDTNgoaiThanh());
        System.out.println("Tong doanh thu: " + ql.tongDoanhThu());


    }
}