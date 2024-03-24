package qlgv.utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import qlgv.model.GiangVien;

/**
 *
 * @author ASUS
 */
public class CLassTableModel {
    public DefaultTableModel setTableGiangVien(List<GiangVien> listItem, String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
            return columnIndex == 7 ? Boolean.class : String.class;
            }
            
            
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows > 0){
            for (int i = 0; i < rows; i++) {
                GiangVien giangVien = listItem.get(i);
                obj = new  Object[columns];
                obj[0] = (i+1);
                obj[1] = giangVien.getMa_giang_vien();
                
                obj[2] = giangVien.getTen_giang_vien();
                obj[3] = giangVien.getDia_chi();
                obj[4] = giangVien.getTrinh_do();
                dtm.addRow(obj);
            }
        }
        return dtm;
     }
}
