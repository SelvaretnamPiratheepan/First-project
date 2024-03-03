package com.example.demo.service;

import com.example.demo.DTO.customerSaveDTO;
import com.example.demo.custemorRepo.CustomerRepo;
import com.example.demo.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class customerServiceIMPLImpl implements customerService {

    private CustomerRepo customerRepo;

    @Override
    public String addCustomer(customerSaveDTO customerSaveDTO) {
        Customer customer = new Customer(
                customerSaveDTO.getCustomername(),
                customerSaveDTO.getCustomerAddress(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return customer.getCustomername();
    }


}
