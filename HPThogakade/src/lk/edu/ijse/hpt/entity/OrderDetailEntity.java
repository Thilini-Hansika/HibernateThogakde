/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Thilini Hansika
 */
@Entity
public class OrderDetailEntity implements Serializable{
    private int orderQty;
    private double unitPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private OrdersEntity orders;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "itemcode",referencedColumnName = "itemcode",insertable = false,updatable = false)
    private ItemEntity item;
    @EmbeddedId
    private OrderDetai_pk orderDetai_pk;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(int orderQty, double unitPrice, OrdersEntity orders, ItemEntity item, OrderDetai_pk orderDetai_pk) {
        this.orderQty = orderQty;
        this.unitPrice = unitPrice;
        this.orders = orders;
        this.item = item;
        this.orderDetai_pk = orderDetai_pk;
    }

  

    /**
     * @return the orderQty
     */
    public int getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the orders
     */
    public OrdersEntity getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(OrdersEntity orders) {
        this.orders = orders;
    }

    /**
     * @return the item
     */
    public ItemEntity getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(ItemEntity item) {
        this.item = item;
    }

    /**
     * @return the orderDetai_pk
     */
    public OrderDetai_pk getOrderDetai_pk() {
        return orderDetai_pk;
    }

    /**
     * @param orderDetai_pk the orderDetai_pk to set
     */
    public void setOrderDetai_pk(OrderDetai_pk orderDetai_pk) {
        this.orderDetai_pk = orderDetai_pk;
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" + "orderQty=" + orderQty + ", unitPrice=" + unitPrice + ", orders=" + orders + ", item=" + item + ", orderDetai_pk=" + orderDetai_pk + '}';
    }
    
    
    
}
