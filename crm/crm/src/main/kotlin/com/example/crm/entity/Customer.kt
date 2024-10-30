package com.example.crm.entity
import jakarta.persistence.*

@Table(name = "customer")
@Entity
class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var fullName: String? = null
    var adress: String? = null
    var age: Long? = null
}