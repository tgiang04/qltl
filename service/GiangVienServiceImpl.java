/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv.service;

import java.util.List;
import qlgv.dao.GiangVienDAO;
import qlgv.dao.GiangVienDaoImpl;
import qlgv.model.GiangVien;

/**
 *
 * @author ASUS
 */
public class GiangVienServiceImpl implements GiangVienService{
    
    private GiangVienDAO giangvienDAO = null;

    public GiangVienServiceImpl() {
        giangvienDAO = new GiangVienDaoImpl();
        
    }
                          
    
    
    public List<GiangVien> getList() {
        return giangvienDAO.getList();
    }

    @Override
    public int createrOrUpdate(GiangVien giangVien) {
        return giangvienDAO.createOrUpdate(giangVien);
    }
    
}
