/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.hpt.dao.CustomerDao;
import lk.edu.ijse.hpt.dao.ItemDao;
import lk.edu.ijse.hpt.dao.OrderDao;
import lk.edu.ijse.hpt.dao.OrderDetaildao;
import lk.edu.ijse.hpt.daoImpl.CustomerDaoImpl;
import lk.edu.ijse.hpt.daoImpl.ItemDaoImpl;
import lk.edu.ijse.hpt.daoImpl.OrderDaoImpl;
import lk.edu.ijse.hpt.daoImpl.OrderDetailDaoImpl;
import lk.edu.ijse.hpt.dto.ItemDTO;
import lk.edu.ijse.hpt.dto.OrderDetailDTO;
import lk.edu.ijse.hpt.dto.OrdersDTO;
import lk.edu.ijse.hpt.entity.CustomerEntity;
import lk.edu.ijse.hpt.entity.ItemEntity;
import lk.edu.ijse.hpt.entity.OrderDetai_pk;
import lk.edu.ijse.hpt.entity.OrderDetailEntity;
import lk.edu.ijse.hpt.entity.OrdersEntity;
import lk.edu.ijse.hpt.service.OrderService;
import lk.edu.ijse.hpt.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Thilini Hansika
 */
public class OrderserviceImpl implements OrderService {

    OrderDao orderDao = new OrderDaoImpl();
    CustomerDao customerDao = new CustomerDaoImpl();
    ItemDao itemDao = new ItemDaoImpl();
    OrderDetaildao detaildao = new OrderDetailDaoImpl();
    SessionFactory sf = SessionFactoryUtil.getSessionFactory();


    @Override
   
    public boolean addOrder(OrdersDTO orders) throws Exception {
      Session sessios = sf.openSession();
        Transaction tx = null;
        try {
            tx = sessios.beginTransaction();
            customerDao.setSession(sessios);
            
            CustomerEntity customerEntity=new CustomerEntity();
            customerEntity.setCustomerName(orders.getCustomerDTO().getCustomerName());
            
            OrdersEntity ordersD = new OrdersEntity();
            ordersD.setCustomer(customerEntity);
            ordersD.setOrderDate(orders.getOrderdate());
            orderDao.setSession(sessios);
            orderDao.addOrder(ordersD);

            List<OrderDetailEntity>orderList=new ArrayList<>();
            
            for (OrderDetailDTO orderDetailDTO : orders.getOrderList()) {
                
                ItemDTO itemD=orderDetailDTO.getItemDTO();
                ItemEntity item1=new ItemEntity();
                item1.setItemcode(itemD.getItemcode());
                item1.setDescription(itemD.getDescription());
                item1.setQtyOnHand(itemD.getQtyOnHand());
                item1.setUnitPrice(itemD.getUnitPrice());
                
                OrderDetailEntity detail=new OrderDetailEntity();
                detail.setOrderQty(orderDetailDTO.getQty());
                detail.setUnitPrice(orderDetailDTO.getUnitPrice());
                detail.setOrders(ordersD);
                detail.setItem(item1);
                detail.setOrderDetai_pk(new OrderDetai_pk(item1.getItemcode(),ordersD.getOid()));

                orderList.add(detail);
                itemDao.setSession(sessios);
                itemDao.updateItem(item1);
                detaildao.setSession(sessios);
                detaildao.addOrderDetail(detail);
                
            }
            tx.commit();
            return  true;
            
         
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
             return false;
        }finally{
            sessios.close();
        }
       }

}
