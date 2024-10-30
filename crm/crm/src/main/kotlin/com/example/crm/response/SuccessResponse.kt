
package com.example.crm.response

import com.example.crm.entity.Customer
import com.example.crm.service.CustomerService
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

class SuccessResponse (
    var status: String? = null,
    var data: List<Customer> = emptyList()
)
