/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.daoImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.hpt.dao.ItemDao;
import lk.edu.ijse.hpt.dto.ItemDTO;
import lk.edu.ijse.hpt.entity.ItemEntity;
import org.hibernate.Session;

/**
 *
 * @author Thilini Hansika
 */
public class ItemDaoImpl implements ItemDao {

    private Session session;

    @Override
    public boolean addItem(ItemEntity itemEntity) throws Exception {
        Serializable save = session.save(itemEntity);
        if (save != null) {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public ItemEntity searchItemByName(String Description) throws Exception {

        ItemEntity itemE = (ItemEntity) session.createQuery("from ItemEntity where description='" + Description + "'").list().get(0);
        
        return itemE;

    }

    @Override
    public List<ItemEntity> getAllDescriptions() throws Exception {
        List<ItemEntity> list;
        list = session.createCriteria(ItemEntity.class).list();
        return list;
    }

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void updateItem(ItemEntity item) throws Exception {
  
       session.update(item);
    }
 
}
