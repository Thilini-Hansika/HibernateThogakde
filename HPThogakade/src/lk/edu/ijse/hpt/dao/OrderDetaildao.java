/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.dao;

import lk.edu.ijse.hpt.entity.OrderDetailEntity;
import org.hibernate.Session;

/**
 *
 * @author Thilini Hansika
 */
public interface OrderDetaildao {
    public boolean addOrderDetail(OrderDetailEntity detailEntity);
    public void setSession(Session session);
    
}
