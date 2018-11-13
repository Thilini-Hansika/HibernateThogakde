/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.dto;

import java.util.List;

/**
 *
 * @author Thilini Hansika
 */
public class CustomerDTO {

    private int cid;
    private String customerName;
    private List<OrdersDTO>orderList;

    public CustomerDTO() {
    }

    public CustomerDTO( String customerName, List<OrdersDTO> orderList) {
       // this.cid = cid;
        this.customerName = customerName;
        this.orderList = orderList;
    }

    public CustomerDTO(int cid, String customerName, List<OrdersDTO> orderList) {
        this.cid = cid;
        this.customerName = customerName;
        this.orderList = orderList;
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
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the orderList
     */
    public List<OrdersDTO> getOrderList() {
        return orderList;
    }

    /**
     * @param orderList the orderList to set
     */
    public void setOrderList(List<OrdersDTO> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" + "cid=" + cid + ", customerName=" + customerName + ", orderList=" + orderList + '}';
    }

   
}
