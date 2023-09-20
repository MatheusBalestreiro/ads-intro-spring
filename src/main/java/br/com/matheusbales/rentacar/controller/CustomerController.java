package br.com.matheusbales.rentacar.controller;


import br.com.matheusbales.rentacar.model.CustomerModel;
import br.com.matheusbales.rentacar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping
    public CustomerModel create(@RequestBody CustomerModel model){
        return service.create(model);
    }

    @GetMapping("/{id}")
    public CustomerModel findById(@PathVariable("id") int id){
        return service.findById(id);
    }



}
