public class MyMainClass {
    public static void main(String[] args) {
        SinhVienIT IT = new SinhVienIT("Nguyen Tuan Nghia", "CNTT", 10, 10, 10);
        SinhVienBiz Biz = new SinhVienBiz("Nguyen Van Nghia", "Biz", 10, 10, 10);
        SinhVienPoly Poly = new SinhVienPoly("Nguyen Thi Nghia", "Poly", 10, 10, 10);
    
        IT.xuat();
        System.out.println("Diem: " + IT.getDiem());
        System.out.println("Hoc luc: " + IT.getHocLuc());
    
        Poly.xuat();
        System.out.println("Diem: " + Poly.getDiem());
        System.out.println("hoc luc: " + Poly.getHocLuc());
    
        Biz.xuat();
        System.out.println("Diem: " + Biz.getDiem());
        System.out.println("Hoc luc: " + Biz.getHocLuc());
    }
}