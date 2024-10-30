package com.example.crm.servis

import com.example.demo.entity.Customer
import com.example.crm.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service

class CustomerService {
    //atributos

    @Autowired
    lateinit var customerRepository: CustomerRepository
    //metodos

    fun findAll(): List<Customer>{
        return customerRepository.findAll()
    }

}