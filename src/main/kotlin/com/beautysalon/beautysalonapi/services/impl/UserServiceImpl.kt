package com.beautysalon.beautysalonapi.services.impl

import com.beautysalon.beautysalonapi.data.dtos.UserDTO
import com.beautysalon.beautysalonapi.data.interfaces.UserRepository
import com.beautysalon.beautysalonapi.data.mappers.UserMapper
import com.beautysalon.beautysalonapi.exceptions.UserException
import com.beautysalon.beautysalonapi.services.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository,
    private val userMapper: UserMapper
) : UserService {
    override fun createUser(userDTO: UserDTO): UserDTO {
        val user = userRepository.save(userMapper.toEntity(userDTO))
        return userMapper.fromEntity(user)
    }

    override fun getUsers(): List<UserDTO> {
        val users = userRepository.getAllUsers()

        if (users.isEmpty())
            throw UserException("Lista de usuários vazia.")

        return users.map {
            userMapper.fromEntity(it)
        }
    }

    override fun getUser(id: Long): UserDTO {
        val optionalUser = userRepository.findById(id)
        val user = optionalUser.orElseThrow{ UserException("Usuário com id $id não existe.") }
        return userMapper.fromEntity(user)
    }
}