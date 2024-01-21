package com.iacarvalho.creditapplicationsystem.entity

import com.iacarvalho.creditapplicationsystem.enumarations.Status
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

@Entity
data class Credit (
    @Id
    val id: UUID = UUID.randomUUID(),
    @Column(nullable = false)
    val creditValue: BigDecimal = BigDecimal.ZERO,
    @Column(nullable = false)
    val dayFirstInstallment: LocalDate,
    @Column(nullable = false)
    val numberOfInstallments: Int = 0,
    @Enumerated
    val status: Status = Status.IN_PROGRESS,
    @ManyToOne
    val customer: Customer? = null
)