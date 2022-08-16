package com.beautysalon.beautysalonapi.data.models

import java.math.BigDecimal

data class Service(
    val id: Long,
    val name: String,
    val value: BigDecimal,
    val duration: Int
)