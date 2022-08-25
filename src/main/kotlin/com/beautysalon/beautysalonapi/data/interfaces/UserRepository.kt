package com.beautysalon.beautysalonapi.data.interfaces

import com.beautysalon.beautysalonapi.data.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {

    @Query("SELECT u FROM User as u")
    fun getAllUsers(): List<User>
}