/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.dao;

import java.util.List;
import lk.edu.ijse.hpt.dto.ItemDTO;
import lk.edu.ijse.hpt.entity.ItemEntity;
import org.hibernate.Session;

/**
 *
 * @author Thilini Hansika
 */
public interface ItemDao {

    public boolean addItem(ItemEntity itemEntity) throws Exception;

    public ItemEntity searchItemByName(String Description) throws Exception;

    public List<ItemEntity> getAllDescriptions() throws Exception;

    public void updateItem(ItemEntity item) throws Exception;

    public void setSession(Session session) throws Exception;
}
