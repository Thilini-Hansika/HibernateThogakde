/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.daoImpl;

import java.io.Serializable;
import lk.edu.ijse.hpt.dao.CustomerDao;
import lk.edu.ijse.hpt.entity.CustomerEntity;
import org.hibernate.Session;

/**
 *
 * @author Thilini Hansika
 */
public class CustomerDaoImpl implements CustomerDao{
private Session session;
    @Override
    public boolean addCustomer(CustomerEntity ce) {
        Serializable save=session.save(ce);
        if(save!=null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void setSession(Session s) {
    this.session=s;
    }
    
}
