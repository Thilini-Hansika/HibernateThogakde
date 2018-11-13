/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.service;

import lk.edu.ijse.hpt.dto.CustomerDTO;
import lk.edu.ijse.hpt.entity.CustomerEntity;

/**
 *
 * @author Thilini Hansika
 */
public interface CustomerService {
    public boolean addCustomer(CustomerDTO CustomerEntity)throws Exception;
    
}
