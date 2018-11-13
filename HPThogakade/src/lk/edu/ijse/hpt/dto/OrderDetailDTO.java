/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.dto;

/**
 *
 * @author Thilini Hansika
 */
public class OrderDetailDTO {

    
   
    private int qty;
    private double unitPrice;
    private OrdersDTO ordersDTO;
    private ItemDTO itemDTO;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int qty, double unitPrice, OrdersDTO ordersDTO, ItemDTO itemDTO) {
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.ordersDTO = ordersDTO;
        this.itemDTO = itemDTO;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
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
     * @return the ordersDTO
     */
    public OrdersDTO getOrdersDTO() {
        return ordersDTO;
    }

    /**
     * @param ordersDTO the ordersDTO to set
     */
    public void setOrdersDTO(OrdersDTO ordersDTO) {
        this.ordersDTO = ordersDTO;
    }

    /**
     * @return the itemDTO
     */
    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    /**
     * @param itemDTO the itemDTO to set
     */
    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }

    @Override
    public String toString() {
        return "OrderDetailDTO{" + "qty=" + qty + ", unitPrice=" + unitPrice + ", ordersDTO=" + ordersDTO + ", itemDTO=" + itemDTO + '}';
    }

  
}
