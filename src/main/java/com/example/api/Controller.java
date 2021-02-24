package com.example.api;

import com.example.service.ServiceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Map;

@RequestMapping("api/data")//Part of the address to api
@RestController
public class Controller {
    private final ServiceCustomer service;

    @Autowired
    public Controller(ServiceCustomer service) {
        this.service = service;
    }

    @PostMapping
    public void addCustomerData(@Valid @NonNull @RequestBody Map<String, String> body){
        service.setCustomerData(null);
    }

    @GetMapping
    public String getAllCustomerData(){
        return service.getCustomerData();
    }


}
