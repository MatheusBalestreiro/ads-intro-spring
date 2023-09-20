package br.com.matheusbales.rentacar.service;

import br.com.matheusbales.rentacar.exception.ResourceNotFoundException;
import br.com.matheusbales.rentacar.model.CustomerModel;
import br.com.matheusbales.rentacar.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService{

    @Autowired
    private CustomerRepository repository;

    public CustomerModel create(CustomerModel model){
        return repository.save(model);
    }

    public CustomerModel findById(int id) {
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException(null));
    }

    public CustomerModel update(CustomerModel model) {
        return repository.save(model);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
