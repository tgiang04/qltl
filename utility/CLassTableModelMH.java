package qlgv.utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import qlgv.model.MonHoc;

public class CLassTableModelMH {
    public DefaultTableModel setTableMonHoc(List<MonHoc> listItemMH, String[] listColumnMH){
        DefaultTableModel dtmMH = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == (listColumnMH.length - 1)) {
                    return Boolean.class; // Loại dữ liệu của cột cuối cùng là Boolean
                } else {
                    return String.class; // Loại dữ liệu của các cột còn lại là String
                }
            }
        };
        dtmMH.setColumnIdentifiers(listColumnMH);
        int columnsMH = listColumnMH.length;
        Object[] obj = null;
        int rows = listItemMH.size();
        if(rows > 0){
            for (int i = 0; i < rows; i++) {
                MonHoc monHoc = listItemMH.get(i);
                obj = new  Object[columnsMH];
                obj[0] = (i+1);
                obj[1] = monHoc.getMa_mon();
                obj[2] = monHoc.getTen_mon();
                obj[3] = monHoc.getTong_so_tiet();
                obj[4] = monHoc.getKinh_phi();
                dtmMH.addRow(obj);
            }
        }
        return dtmMH;
     }
}
