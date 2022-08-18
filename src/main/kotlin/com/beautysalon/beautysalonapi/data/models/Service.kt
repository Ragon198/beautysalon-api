package com.beautysalon.beautysalonapi.data.models

import java.math.BigDecimal
import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "services")
data class Service(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @NotNull
    @Size(min = 3, max = 50)
    val name: String,
    @NotNull
    val value: BigDecimal,
    @NotNull
    val duration: Int,
    @ManyToOne
    @JoinColumn(name = "schedule_id", foreignKey = ForeignKey(name = "fk_schedule_id"), nullable = true)
    val schedule: Schedule
)