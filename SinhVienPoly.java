public abstract class SinhVienPoly {
    public String hoTen;
    public String nganh;

    public SinhVienPoly(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc(){
        if (this.getDiem() < 5){
            return "Yeu";
        } else if (this.getDiem() < 6.5){
            return "Trung binh";
        } else if(this.getDiem() < 7.5){
            return "Kha";
        }else if(this.getDiem() < 9){
            return "Gioi";
        }else return "Xuat sac";
    }

    public void xuat(){
        System.out.println("Full name: " + this.hoTen + "Major: " + this.nganh);
    }
}