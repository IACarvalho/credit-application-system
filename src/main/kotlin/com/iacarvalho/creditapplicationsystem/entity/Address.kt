package com.iacarvalho.creditapplicationsystem.entity

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import java.util.UUID
@Embeddable
data class Address(
    @Column(nullable = false)
    var zipcode: String = "",
    @Column(nullable = false)
    var street: String = "",
)
