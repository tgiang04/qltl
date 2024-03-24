package qlgv.service;

import java.util.List;
import qlgv.dao.MonHocDAO;
import qlgv.dao.MonHocDaoImpl;
import qlgv.model.MonHoc;

/**
 *
 * @author killk
 */
public class MonHocServiceImpl implements MonHocService{

    private MonHocDAO monHocDAO = null;

    public MonHocServiceImpl() {
        monHocDAO = new MonHocDaoImpl();
    }
    
    @Override
    public List<MonHoc> getList() {
        return monHocDAO.getList();
    }
    
}
