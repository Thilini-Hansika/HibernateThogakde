/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Thilini Hansika
 */
@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String CustomerName;
   

    public CustomerEntity() {
    }

    public CustomerEntity( String CustomerName) {
      //  this.cid = cid;
        this.CustomerName = CustomerName;
    }

    public CustomerEntity(int cid, String CustomerName) {
        this.cid = cid;
        this.CustomerName = CustomerName;
    }

    /**
     * @return the cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(int cid) {
        this.cid = cid;
    }

    /**
     * @return the CustomerName
     */
    public String getCustomerName() {
        return CustomerName;
    }

    /**
     * @param CustomerName the CustomerName to set
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "cid=" + cid + ", CustomerName=" + CustomerName + '}';
    }

    
}
