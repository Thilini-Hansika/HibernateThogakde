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
public class OrdersDTO {
    private int oid;
    private  String orderdate;
    private CustomerDTO customerDTO;
    private List<OrderDetailDTO>orderList;

    public OrdersDTO() {
    }

    public OrdersDTO( String orderdate, CustomerDTO customerDTO, List<OrderDetailDTO> orderList) {
        
        this.orderdate = orderdate;
        this.customerDTO = customerDTO;
        this.orderList = orderList;
    }

    public OrdersDTO(int oid, String orderdate, CustomerDTO customerDTO, List<OrderDetailDTO> orderList) {
        this.oid = oid;
        this.orderdate = orderdate;
        this.customerDTO = customerDTO;
        this.orderList = orderList;
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
     * @return the orderdate
     */
    public String getOrderdate() {
        return orderdate;
    }

    /**
     * @param orderdate the orderdate to set
     */
    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    /**
     * @return the customerDTO
     */
    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    /**
     * @param customerDTO the customerDTO to set
     */
    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    /**
     * @return the orderList
     */
    public List<OrderDetailDTO> getOrderList() {
        return orderList;
    }

    /**
     * @param orderList the orderList to set
     */
    public void setOrderList(List<OrderDetailDTO> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" + "oid=" + oid + ", orderdate=" + orderdate + ", customerDTO=" + customerDTO + ", orderList=" + orderList + '}';
    }

  
}
