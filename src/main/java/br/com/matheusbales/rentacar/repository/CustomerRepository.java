package br.com.matheusbales.rentacar.repository;

import br.com.matheusbales.rentacar.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {



}
