package BaiTapJava4;

public class NoiThanh extends ChuyenXe {
    int soTuyen;
    double soKm;

    public NoiThanh(String maSo, String hoTen, String soXe, long doanhThu, int soTuyen, double soKm){
        super(maSo, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
}