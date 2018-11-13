/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.controller;

import java.util.List;
import lk.edu.ijse.hpt.dto.ItemDTO;
import lk.edu.ijse.hpt.entity.ItemEntity;

/**
 *
 * @author Thilini Hansika
 */
public interface ItemController {
    public boolean  addItem(ItemDTO itemDTO)throws Exception;
    public ItemDTO searchByNAme(String description)throws Exception;
    public List<ItemDTO> getAllItems()throws Exception;
    public boolean updateItem(ItemDTO itemDTO)throws Exception;
}
