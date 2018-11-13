/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Thilini Hansika
 */
@Entity
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oid;
    private String orderDate;
    @ManyToOne(cascade = CascadeType.ALL)
    private CustomerEntity customer;
  

    public OrdersEntity() {
    }

    public OrdersEntity(String orderDate, CustomerEntity customer) {
        
        this.orderDate = orderDate;
        this.customer = customer;
      
    }

    public OrdersEntity(int oid, String orderDate, CustomerEntity customer) {
        this.oid = oid;
        this.orderDate = orderDate;
        this.customer = customer;
   
    }

    /**
     * @return the oid
     */
    public int getOid() {
        return oid;
    }

    /**
     * @param oid the oid to set
     */
    public void setOid(int oid) {
        this.oid = oid;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the customer
     */
    public CustomerEntity getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    /**
     * @return the orderList
     */
 

    @Override
    public String toString() {
        return "OrdersEntity{" + "oid=" + oid + ", orderDate=" + orderDate + ", customer=" + customer + '}';
    }

   
}
