package BaiTapJava4;
public abstract class ChuyenXe {
    String maSo;
    String hoTen;
    String soXe;
    long doanhThu;
    public ChuyenXe(String maSo, String hoTen, String soXe, long doanhThu){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public void thongTin(){
        System.out.println("Ma so: " + this.maSo + " Ho ten: " + this.hoTen + " So xe: " + this.soXe + " Doanh thu: " + this.doanhThu);
    }
}