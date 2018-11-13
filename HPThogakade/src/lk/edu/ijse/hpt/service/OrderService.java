/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.service;

import lk.edu.ijse.hpt.dto.OrdersDTO;
import lk.edu.ijse.hpt.entity.OrdersEntity;

/**
 *
 * @author Thilini Hansika
 */
public interface OrderService {
    public boolean addOrder(OrdersDTO orders)throws Exception;
    
}
