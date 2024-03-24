package qlgv.controller;

import java.awt.BorderLayout;
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
import qlgv.model.MonHoc;
import qlgv.service.MonHocService;
import qlgv.service.MonHocServiceImpl;
import qlgv.utility.CLassTableModelMH;


public class MonHocController {
    
    private JPanel jpnViewMH;
    private JButton btnAddMH;
    private JTextField jtfSearchMH;
    
    private MonHocService monHocService = null;
    
    private String[] listColumnMH = {"STT","Mã Môn","Tên môn", "Tổng số tiết", "Kinh phí"};
    
    private TableRowSorter<TableModel> rowSorterMH = null;
    
    public MonHocController(JPanel jpnViewMH, JButton btnAddMH, JTextField jtfSearchMH) {
        this.jpnViewMH = jpnViewMH;
        this.btnAddMH = btnAddMH;
        this.jtfSearchMH = jtfSearchMH;
        
        this.monHocService = new MonHocServiceImpl();
    }
    
    public void setDateToTableMH(){
        List<MonHoc> listItemMH = monHocService.getList();
        
        DefaultTableModel modelMH = new CLassTableModelMH().setTableMonHoc(listItemMH, listColumnMH);
        JTable tableMH = new JTable(modelMH);
        
        rowSorterMH = new TableRowSorter<>(tableMH.getModel());
        tableMH.setRowSorter(rowSorterMH);
        
        jtfSearchMH.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                String textMH = jtfSearchMH.getText();
                if(textMH.trim().length() == 0){
                    rowSorterMH.setRowFilter(null);                
                } else {
                    rowSorterMH.setRowFilter(RowFilter.regexFilter("(?i)" + textMH, 0, 1, 2, 3,4));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String textMH = jtfSearchMH.getText();
                if(textMH.trim().length() == 0){
                    rowSorterMH.setRowFilter(null);                
                } else {
                    rowSorterMH.setRowFilter(RowFilter.regexFilter("(?i)" + textMH, 0, 1, 2, 3,4));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
            
        });
        
        
        
        tableMH.getColumnModel().getColumn(0).setMinWidth(0);
        tableMH.getColumnModel().getColumn(0).setMaxWidth(0);
        tableMH.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        
        
        tableMH.getTableHeader().setFont(new Font("Arrial", Font.BOLD, 14));
        tableMH.getTableHeader().setPreferredSize(new Dimension(100, 50));
        tableMH.getRowHeight(50);
        tableMH.validate();
        tableMH.repaint();
        
        JScrollPane scrollPaneMH = new JScrollPane();
        scrollPaneMH.getViewport().add(tableMH);
        scrollPaneMH.setPreferredSize(new Dimension(1300, 400));
        
        jpnViewMH.removeAll();
        jpnViewMH.setLayout(new BorderLayout());
        jpnViewMH.add(scrollPaneMH);
        jpnViewMH.validate();
        jpnViewMH.repaint();
    }
    
    
    
}
