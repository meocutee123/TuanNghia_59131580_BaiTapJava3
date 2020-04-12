package BaiTapJava4;

public class NoiThanh extends ChuyenXe {
    char soTuyen;
    double soKm;

    public NoiThanh(char maSo, String hoTen, char soXe, long doanhThu, char soTuyen, double soKm){
        super(maSo, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
}