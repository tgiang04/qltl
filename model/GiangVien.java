package qlgv.model;

/**
 *
 * @author minhq
 */
public class GiangVien {
    private  String ma_giang_vien;
    private String ten_giang_vien;
    private String dia_chi;
    private String trinh_do;

    public GiangVien(String ma_giang_vien, String ten_giang_vien, String dia_chi, String trinh_do) {
        this.ma_giang_vien = ma_giang_vien;
        this.ten_giang_vien = ten_giang_vien;
        this.dia_chi = dia_chi;
        this.trinh_do = trinh_do;
    }

    public GiangVien() {
       
    }

    public String getMa_giang_vien() {
        return ma_giang_vien;
    }

    public void setMa_giang_vien(String ma_giang_vien) {
        this.ma_giang_vien = ma_giang_vien;
    }

    public String getTen_giang_vien() {
        return ten_giang_vien;
    }

    public void setTen_giang_vien(String ten_giang_vien) {
        this.ten_giang_vien = ten_giang_vien;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getTrinh_do() {
        return trinh_do;
    }

    public void setTrinh_do(String trinh_do) {
        this.trinh_do = trinh_do;
    }

    @Override
    public String toString() {
        return ma_giang_vien+ " - "+ ten_giang_vien;
    }

 
}