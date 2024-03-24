
package qlgv.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import qlgv.model.MonHoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MonHocDaoImpl implements MonHocDAO  {

    @Override
    public List<MonHoc> getList() {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "SELECT * FROM `monhoc`";
            List <MonHoc> list  = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                MonHoc monHoc = new MonHoc();
                monHoc.setMa_mon(rs.getString("ma_mon"));
                monHoc.setTen_mon(rs.getString("ten_mon"));
                monHoc.setTong_so_tiet(rs.getInt("tong_so_tiet"));
                monHoc.setKinh_phi(rs.getInt("kinh_phi"));
                
                
                list.add(monHoc); 
            }
            ps.close();
            rs.close();
            cons.close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    return null;
    }
    public static void main(String[] args){
        MonHocDAO monHocDAO = new MonHocDaoImpl();
        System.out.println(monHocDAO.getList());
    }
    
    
}
