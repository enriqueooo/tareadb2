
package com.example.crm.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.example.crm.repository.CustomerRespository
import com.example.crm.entity.Customer

@Service
class CustomerService {
	@Autowired
	lateinit var customerRespository: CustomerRespository

	fun findAll(): List<Customer> {
		return customerRespository.findAll()
	}

}
