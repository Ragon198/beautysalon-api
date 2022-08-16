package com.beautysalon.beautysalonapi.data.models

import java.math.BigDecimal
import java.util.Date
import java.util.Timer

data class Schedule(
    val id: Long,
    val user: User,
    val date: Date,
    val time: Timer,
    val place: String,
    val services: List<Service>,
    val totalTime: Int,
    val totalValue: BigDecimal,
    val pay: Boolean
)