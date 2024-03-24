/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv.service;

import java.util.List;
import qlgv.model.GiangVien;

/**
 *
 * @author ASUS
 */
public interface GiangVienService {
    
    public List<GiangVien> getList();
    public int createrOrUpdate(GiangVien giangVien);
}
