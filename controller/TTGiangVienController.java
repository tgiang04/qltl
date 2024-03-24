/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlgv.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import qlgv.model.GiangVien;
import qlgv.service.GiangVienService;
import qlgv.service.GiangVienServiceImpl;

/**
 *
 * @author ASUS
 */
public class TTGiangVienController {
    private JButton btnSubmit;
    private JTextField jtfMaGiangVien;
    private JTextField jtfHoTen;
    private JTextField jtfTrinhDo;
    private JTextArea jtaDiaChi;
    private GiangVien giangVien = null;
    private JLabel jlbMsg;
    
    private GiangVienService giangVienService = null;

    public TTGiangVienController(JButton btnSubmit, JTextField jtfMaGiangVien, JTextField jtfHoTen, JTextField jtfTrinhDo, JTextArea jtaDiaChi, JLabel jlbMsg) {
        this.btnSubmit = btnSubmit;
        this.jtfMaGiangVien = jtfMaGiangVien;
        this.jtfHoTen = jtfHoTen;
        this.jtfTrinhDo = jtfTrinhDo;
        this.jtaDiaChi = jtaDiaChi;
        this.jlbMsg = jlbMsg;
        this.giangVienService = new GiangVienServiceImpl();
    }

 


    public void setView(GiangVien giangVien){
        this.giangVien = giangVien;
        jtfMaGiangVien.setText(giangVien.getMa_giang_vien());
        jtfHoTen.setText(giangVien.getTen_giang_vien());
        jtfTrinhDo.setText(giangVien.getTrinh_do());
        jtaDiaChi.setText(giangVien.getDia_chi());
    }
    
    public void setEvent(){
        btnSubmit.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(jtfHoTen.getText().length()  == 0 || jtfMaGiangVien.getText().length() == 0){
                    jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
                }else{
                   giangVien.setTen_giang_vien(jtfHoTen.getText());
                   giangVien.setDia_chi(jtaDiaChi.getText());
                   giangVien.setTrinh_do(jtfTrinhDo.getText());
                   giangVien.setMa_giang_vien(jtfMaGiangVien.getText());
                   giangVienService.createrOrUpdate(giangVien);
                   jlbMsg.setText("Xử lý cập nhật dữ liệu thành công!");
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0,200,83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100,221,23));
                
            }
            
            
        });
    }
}
