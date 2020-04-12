package BaiTapJava4;
import java.util.ArrayList;
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> listChuyenXe = new ArrayList<ChuyenXe>();
    
    public void them(ChuyenXe cx){
        listChuyenXe.add(cx);
    }

    public void xuat(){
        listChuyenXe.forEach(cx -> cx.thongTin());
    }

    public double TDTNoiThanh(){
        long doanhThu = 0;
        for (ChuyenXe cx : listChuyenXe){
            if (cx instanceof NoiThanh){
                doanhThu += cx.doanhThu;
            }
        }
        return doanhThu;
    }
    public double TDTNgoaiThanh(){
        long doanhThu = 0;
        for (ChuyenXe cx : listChuyenXe){
            if (cx instanceof NoiThanh){
                doanhThu += cx.doanhThu;
            }
        }
        return doanhThu;
    }
    public double tongDoanhThu(){
        long doanhThu = 0;
        for (ChuyenXe cx : listChuyenXe){
                doanhThu += cx.doanhThu;
            }
        return doanhThu;
    }
}