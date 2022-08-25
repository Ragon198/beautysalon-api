package com.beautysalon.beautysalonapi.services

import com.beautysalon.beautysalonapi.data.dtos.UserDTO

interface UserService {

    fun createUser(userDTO: UserDTO): UserDTO
    fun getUsers(): List<UserDTO>
    fun getUser(id: Long): UserDTO

}