/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.dao;

import lk.edu.ijse.hpt.entity.OrdersEntity;
import org.hibernate.Session;
import org.hibernate.internal.CriteriaImpl;

/**
 *
 * @author Thilini Hansika
 */
public interface OrderDao {
    public boolean addOrder(OrdersEntity ordersEntity);
    public void setSession(Session session);
    
}
