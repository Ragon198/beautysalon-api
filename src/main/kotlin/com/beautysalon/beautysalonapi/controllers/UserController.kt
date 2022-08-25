package com.beautysalon.beautysalonapi.controllers

import com.beautysalon.beautysalonapi.data.dtos.UserDTO
import com.beautysalon.beautysalonapi.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("users")
class UserController(
    private val userService: UserService
) {

    @PostMapping
    fun createUser(@RequestBody @Valid userDTO: UserDTO): ResponseEntity<UserDTO> =
        ResponseEntity(userService.createUser(userDTO), HttpStatus.CREATED)

    @GetMapping
    fun getUsers(): ResponseEntity<List<UserDTO>> =
        ResponseEntity.ok(userService.getUsers())

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long) =
        ResponseEntity.ok(userService.getUser(id))

}