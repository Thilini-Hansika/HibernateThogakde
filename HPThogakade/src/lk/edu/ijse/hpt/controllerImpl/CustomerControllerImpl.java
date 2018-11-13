/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.hpt.controllerImpl;

import lk.edu.ijse.hpt.controller.CustomerController;
import lk.edu.ijse.hpt.dto.CustomerDTO;
import lk.edu.ijse.hpt.entity.CustomerEntity;
import lk.edu.ijse.hpt.service.CustomerService;
import lk.edu.ijse.hpt.serviceImpl.CustomerServceImpl;

/**
 *
 * @author Thilini Hansika
 */
public class CustomerControllerImpl implements CustomerController {

    CustomerService customerService = new CustomerServceImpl();

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {

        return customerService.addCustomer(customerDTO);

    }

}
