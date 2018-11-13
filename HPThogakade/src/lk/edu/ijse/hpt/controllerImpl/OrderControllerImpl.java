/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.controllerImpl;

import lk.edu.ijse.hpt.controller.OrderController;
import lk.edu.ijse.hpt.dto.OrdersDTO;
import lk.edu.ijse.hpt.entity.OrdersEntity;
import lk.edu.ijse.hpt.service.OrderService;
import lk.edu.ijse.hpt.serviceImpl.OrderserviceImpl;

/**
 *
 * @author Thilini Hansika
 */
public class OrderControllerImpl implements OrderController{
    OrderService orderService=new OrderserviceImpl();
    @Override
    public boolean addOrder(OrdersDTO ordersDTO) throws Exception {
        
        return orderService.addOrder(ordersDTO);
    }
    
}
