package BaiTapJava4;
public abstract class ChuyenXe {
    char maSo;
    String hoTen;
    char soXe;
    long doanhThu;
    public ChuyenXe(char maSo, String hoTen, char soXe, long doanhThu){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public void Xuat(){
        System.out.println("Ma so: " + this.maSo + "Ho ten: " + this.hoTen + "So xe: " + this.soXe + "Doanh thu: " + this.doanhThu);
    }
}