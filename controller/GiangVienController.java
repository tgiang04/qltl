package qlgv.controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;
import qlgv.model.GiangVien;
import qlgv.service.GiangVienServiceImpl;
import qlgv.service.GiangVienService;
import qlgv.utility.CLassTableModel;
import qlgv.view.GiangVienJFrame;

/**
 *
 * @author ASUS
 */
public class GiangVienController {
    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;
    
    private GiangVienService giangVienService = null;
    
    private String[] listColumn = { "STT","Mã Giảng Viên", "Họ và Tên","Địa Chỉ", "Trình Độ"};
    
    private TableRowSorter<TableModel> rowSorter = null;
            
    public GiangVienController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
        
        this.giangVienService = new GiangVienServiceImpl();
    }

    public GiangVienController(JButton btnSubmit, JTextField jtfMaGiangVien, JTextField jtfHoTen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
public void setDataToTable() {
    List<GiangVien> listItem = giangVienService.getList();
    DefaultTableModel model = new CLassTableModel().setTableGiangVien(listItem, listColumn);
    JTable table = new JTable(model);

    rowSorter = new TableRowSorter<>(table.getModel());
    table.setRowSorter(rowSorter);

    jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            String text = jtfSearch.getText();
            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, 0, 1, 2, 3,4));
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = jtfSearch.getText();
            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, 0, 1, 2, 3,4));
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
    });
    
    table.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getClickCount() == 2 && table.getSelectedRow() != -1){
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int selectedRowIndex = table.getSelectedRow();
                selectedRowIndex = table.convertColumnIndexToModel(selectedRowIndex);
                
                
                GiangVien giangVien = new GiangVien();
                giangVien.setMa_giang_vien(model.getValueAt(selectedRowIndex, 1).toString());
                giangVien.setTen_giang_vien(model.getValueAt(selectedRowIndex,2).toString());
                giangVien.setTrinh_do(model.getValueAt(selectedRowIndex, 4).toString());
                giangVien.setDia_chi(model.getValueAt(selectedRowIndex, 3).toString() != null ?
                    model.getValueAt(selectedRowIndex, 3).toString() : "" );
                
                GiangVienJFrame frame = new GiangVienJFrame(giangVien);
                frame.setTitle("Thông Tin Giảng Viên");
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        }
        
    });

    table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
    table.getTableHeader().setPreferredSize(new Dimension(100, 50));
    table.setRowHeight(50);
    table.validate();
    table.repaint();

    JScrollPane scroll = new JScrollPane();
    scroll.getViewport().add(table);
    scroll.setPreferredSize(new Dimension(1150, 400));

    jpnView.removeAll();
    jpnView.setLayout(new CardLayout());
    jpnView.add(scroll);
    jpnView.validate();
    jpnView.repaint();
}

    public void setEvent(){
        btnAdd.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                GiangVienJFrame frame = new GiangVienJFrame(new GiangVien());
                frame.setTitle("Thông Tin Giảng Viên");
                frame.setLocale(null);
                frame.setResizable(false);
                frame.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnAdd.setBackground(new Color(0,200,83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnAdd.setBackground(new Color(100,221,23));
                
            }
            
            
        }); 
    }
}


