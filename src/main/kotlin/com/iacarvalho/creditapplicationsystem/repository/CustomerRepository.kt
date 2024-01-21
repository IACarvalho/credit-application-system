package com.iacarvalho.creditapplicationsystem.repository

import com.iacarvalho.creditapplicationsystem.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CustomerRepository: JpaRepository<Customer, UUID>