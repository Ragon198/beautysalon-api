package com.beautysalon.beautysalonapi.data.models

import java.math.BigDecimal
import java.sql.Timestamp
import java.util.Date
import java.util.Timer
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "schedules")
data class Schedule(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = ForeignKey(name = "fk_user_id"), nullable = false)
    val user: User,

    @NotNull
    val dateTime: Timestamp,

    @NotNull
    val place: String,

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "schedule")
    val services: List<ScheduleService>,

    @NotNull
    val totalTime: Int,

    @NotNull
    val totalValue: BigDecimal,

    @NotNull
    val pay: Boolean = false
)