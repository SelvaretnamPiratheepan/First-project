package com.example.demo.customerController;

import com.example.demo.DTO.customerDTO;
import com.example.demo.DTO.customerSaveDTO;
import com.example.demo.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class customerController {

    @Autowired
    private customerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody customerSaveDTO customerSaveDTO)
    {
String id = customerService.addCustomer(customerSaveDTO);
return id;
    }
}

