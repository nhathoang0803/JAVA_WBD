public class TinhTien {
    public static double tinhTienLai(double tienGui, double phanTram, int soThang) {
        double tongTienLai = 0;
        for (int i = 0; i < soThang; i++) {
            tongTienLai = tienGui * (phanTram / 100) / 12 * soThang;

        }
        System.out.println(tongTienLai);
        return tongTienLai;
    }

    public static void main(String[] args) {
        tinhTienLai(5000000, 1.5, 10);
    }
}
