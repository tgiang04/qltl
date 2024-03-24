package qlgv.dao;

import qlgv.model.GiangVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GiangVienDaoImpl implements GiangVienDAO {

    @Override
    public List<GiangVien> getList() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM giang_vien";
        List<GiangVien> list = new ArrayList<>();
        try {
            PreparedStatement ps =  cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               GiangVien giangvien = new GiangVien();
               giangvien.setMa_giang_vien(rs.getString("ma_giang_vien"));
               giangvien.setTen_giang_vien(rs.getString("ten_giang_vien"));
               giangvien.setDia_chi(rs.getString("dia_chi"));
               giangvien.setTrinh_do(rs.getString("trinh_do"));
                      
               list.add(giangvien);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static void main(String[] args) {
        GiangVienDAO giangVienDAO = new GiangVienDaoImpl();
        System.out.println(giangVienDAO.getList());
    }

    @Override
    public int createOrUpdate(GiangVien giangVien) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO giang_vien(ma_giang_vien, ten_giang_vien, dia_chi, trinh_do) VALUES(?, ?, ?, ?) ON DUPLICATE KEY UPDATE ma_giang_vien = VALUES(ma_giang_vien), ten_giang_vien = VALUES(ten_giang_vien), dia_chi = VALUES(dia_chi), trinh_do = VALUES(trinh_do);";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,giangVien.getMa_giang_vien());
            ps.setString(2, giangVien.getTen_giang_vien());
            ps.setString(3, giangVien.getDia_chi());
            ps.setString(4, giangVien.getTrinh_do());

            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

}
    

