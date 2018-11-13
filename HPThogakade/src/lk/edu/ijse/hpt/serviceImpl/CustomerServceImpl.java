/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.hpt.dao.CustomerDao;
import lk.edu.ijse.hpt.dao.OrderDao;
import lk.edu.ijse.hpt.daoImpl.CustomerDaoImpl;
import lk.edu.ijse.hpt.daoImpl.OrderDaoImpl;
import lk.edu.ijse.hpt.dto.CustomerDTO;
import lk.edu.ijse.hpt.dto.OrdersDTO;
import lk.edu.ijse.hpt.entity.CustomerEntity;
import lk.edu.ijse.hpt.entity.OrdersEntity;
import lk.edu.ijse.hpt.service.CustomerService;
import lk.edu.ijse.hpt.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Thilini Hansika
 */
public class CustomerServceImpl implements CustomerService {

    CustomerDao customerDao = new CustomerDaoImpl();
    OrderDao orderDao = new OrderDaoImpl();

    SessionFactory sf = SessionFactoryUtil.getSessionFactory();

    @Override
    public boolean addCustomer(CustomerDTO ce) {

        CustomerEntity customerD = new CustomerEntity();
        customerD.setCustomerName(ce.getCustomerName());

        Session session = sf.openSession();
        Transaction tx = null;
        try {

            tx = session.beginTransaction();
            customerDao.setSession(session);

            boolean result = customerDao.addCustomer(customerD);
            if (result) {
                tx.commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }

    }

}
