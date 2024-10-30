package com.example.crm.controller


import com.example.crm.response.SuccessResponse
import com.example.crm.servis.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/customer")
class CustomerController {

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping()
    fun home(): SuccessResponse {
        return SuccessResponse().apply {
            status = "success"
            data = customerService.findAll()
        }
    }

}