/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.dao;

import lk.edu.ijse.hpt.entity.CustomerEntity;
import org.hibernate.Session;

/**
 *
 * @author Thilini Hansika
 */
public interface CustomerDao {
    public boolean addCustomer(CustomerEntity ce);
    public void setSession(Session s );
}
