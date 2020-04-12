public class SinhVienIT extends SinhVienPoly {
    public double diemJava;
    public double diemCss;
    public double diemHTML;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHTML){
        super(hoTen, nganh);
        this.diemCss = diemCss;
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem(){
        return (2 * this.diemJava + this.diemCss + this.diemHTML)/4;
    }
}