/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.controllerImpl;

import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.hpt.controller.ItemController;
import lk.edu.ijse.hpt.dto.ItemDTO;
import lk.edu.ijse.hpt.entity.ItemEntity;
import lk.edu.ijse.hpt.service.ItemService;
import lk.edu.ijse.hpt.serviceImpl.ItemServiceImpl;

/**
 *
 * @author Thilini Hansika
 */
public class ItemControllerImpl implements ItemController {

    ItemService itemService = new ItemServiceImpl();

    @Override
    public boolean addItem(ItemDTO itemDTO) throws Exception {
        ItemEntity entity = new ItemEntity();
        entity.setDescription(itemDTO.getDescription());
        entity.setQtyOnHand(itemDTO.getQtyOnHand());
        entity.setUnitPrice(itemDTO.getUnitPrice());
        return itemService.addItem(entity);
    }

    @Override
    public ItemDTO searchByNAme(String description) throws Exception {
        System.out.println("asfs" + description);
        return itemService.searchByDescription(description);
    }

    @Override
    public List<ItemDTO> getAllItems() throws Exception {
        //  ItemDTO item = new ItemDTO();
        // List<ItemDTO> list = new ArrayList<>();
        // item.getDescription();
        // list.add(item);
        return itemService.getAllItems();
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws Exception {
        return itemService.updateItem(itemDTO);
    }

}
