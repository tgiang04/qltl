/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv.dao;

import java.util.List;
import qlgv.model.GiangVien;

/**
 *
 * @author ASUS
 */
public interface GiangVienDAO {
    public List<GiangVien> getList();
    public int createOrUpdate(GiangVien giangVien);
}
