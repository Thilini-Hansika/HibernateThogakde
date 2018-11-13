/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.daoImpl;

import java.io.Serializable;
import lk.edu.ijse.hpt.dao.OrderDao;
import lk.edu.ijse.hpt.entity.OrdersEntity;
import org.hibernate.Session;

/**
 *
 * @author Thilini Hansika
 */
public class OrderDaoImpl implements OrderDao {

    private Session session;

    @Override
    public boolean addOrder(OrdersEntity ordersEntity) {
        Serializable save = session.save(ordersEntity);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

}
