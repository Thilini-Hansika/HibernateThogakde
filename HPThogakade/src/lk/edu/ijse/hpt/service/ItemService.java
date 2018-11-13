/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.service;

import java.util.List;
import lk.edu.ijse.hpt.dto.ItemDTO;
import lk.edu.ijse.hpt.entity.ItemEntity;

/**
 *
 * @author Thilini Hansika
 */
public interface ItemService {
    public boolean addItem(ItemEntity item)throws Exception;
    public ItemDTO searchByDescription(String description)throws Exception;
    public ItemDTO searchBYId(int id)throws Exception;
    public List<ItemDTO>getAllItems() throws Exception;
    public boolean updateItem(ItemDTO itemDTO) throws Exception;
}
