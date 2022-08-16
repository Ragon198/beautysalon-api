package com.beautysalon.beautysalonapi.data.models

import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "users")
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @NotNull
    @Size(min = 3, max = 50)
    val name: String,

    @NotNull
    val pin: Long,

    @NotNull
    val password: String,

    @Email
    val email: String,

    @NotNull
    val cellNumber: String,

    @NotNull
    val gender: String
)