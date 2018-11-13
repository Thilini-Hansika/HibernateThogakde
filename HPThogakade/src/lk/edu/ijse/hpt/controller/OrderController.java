/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.controller;

import lk.edu.ijse.hpt.dto.OrdersDTO;

/**
 *
 * @author Thilini Hansika
 */
public interface OrderController {
    public boolean addOrder(OrdersDTO ordersDTO) throws Exception;
}
