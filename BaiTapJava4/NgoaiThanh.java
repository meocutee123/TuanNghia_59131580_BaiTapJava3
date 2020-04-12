package BaiTapJava4;

public class NgoaiThanh extends ChuyenXe {
    double soNgay;
    String noiDen;

    public NgoaiThanh(String maSo, String hoTen, String soXe, long doanhThu, double soNgay, String noiDen){
        super(maSo, hoTen, soXe, doanhThu);
        this.soNgay = soNgay;
        this.noiDen = noiDen;
    }
}