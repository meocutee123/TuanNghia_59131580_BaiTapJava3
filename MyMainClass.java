public class MyMainClass {
    public static void main(String[] args) {
        SinhVienIT IT = new SinhVienIT("Nguyen Tuan Nghia", "CNTT", 10, 10, 10);
        SinhVienBiz Biz = new SinhVienBiz("Nguyen Van Nghia", "Biz", 10, 10);

        IT.xuat();
        System.out.println("Diem: " + IT.getDiem());
        System.out.println("Hoc luc: " + IT.getHocLuc());
    
        Biz.xuat();
        System.out.println("Diem: " + Biz.getDiem());
        System.out.println("Hoc luc: " + Biz.getHocLuc());
    }
}