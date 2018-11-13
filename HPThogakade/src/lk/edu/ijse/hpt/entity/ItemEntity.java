/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Thilini Hansika
 */
@Entity
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemcode;
    private String description;
    private double unitPrice;
    private int qtyOnHand;

    public ItemEntity() {
    }

    public ItemEntity(String description, double unitPrice, int qtyOnHand) {
       
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    public ItemEntity(int itemcode, String description, double unitPrice, int qtyOnHand) {
        this.itemcode = itemcode;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    /**
     * @return the itemcode
     */
    public int getItemcode() {
        return itemcode;
    }

    /**
     * @param itemcode the itemcode to set
     */
    public void setItemcode(int itemcode) {
        this.itemcode = itemcode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return the qtyOnHand
     */
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * @param qtyOnHand the qtyOnHand to set
     */
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    @Override
    public String toString() {
        return "ItemEntity{" + "itemcode=" + itemcode + ", description=" + description + ", unitPrice=" + unitPrice + ", qtyOnHand=" + qtyOnHand + '}';
    }

       
}
