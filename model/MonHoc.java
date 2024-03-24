
package qlgv.model;


public class MonHoc {
    private String ma_mon;
    private String ten_mon;
    private int tong_so_tiet;
    private int kinh_phi;

    public MonHoc(String ma_mon, String ten_mon, int tong_so_tiet, int so_tiet_lt, int kinh_phi) {
        this.ma_mon = ma_mon;
        this.ten_mon = ten_mon;
        this.tong_so_tiet = tong_so_tiet;
        this.kinh_phi = kinh_phi;
    }

    public MonHoc() {

    }

    public String getMa_mon() {
        return ma_mon;
    }

    public void setMa_mon(String ma_mon) {
        this.ma_mon = ma_mon;
    }

    public String getTen_mon() {
        return ten_mon;
    }

    public void setTen_mon(String ten_mon) {
        this.ten_mon = ten_mon;
    }

    public int getTong_so_tiet() {
        return tong_so_tiet;
    }

    public void setTong_so_tiet(int tong_so_tiet) {
        this.tong_so_tiet = tong_so_tiet;
    }

    public int getKinh_phi() {
        return kinh_phi;
    }

    public void setKinh_phi(int kinh_phi) {
        this.kinh_phi = kinh_phi;
    }

    @Override
    public String toString() {
        return  ma_mon  + "-" + ten_mon;
    }

    
    
          
    
}  