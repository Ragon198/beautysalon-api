package com.beautysalon.beautysalonapi.data.dtos

import com.beautysalon.beautysalonapi.data.enums.TypeUserEnum
import com.beautysalon.beautysalonapi.data.models.Schedule

data class UserDTO(
    var id: Long,
    val name: String,
    val pin: Long,
    val password: String,
    val email: String,
    val cellNumber: String,
    val gender: String,
    val type: TypeUserEnum,
    val schedules: List<Schedule>
)