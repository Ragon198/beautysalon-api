package com.beautysalon.beautysalonapi.data.mappers

import com.beautysalon.beautysalonapi.data.dtos.UserDTO
import com.beautysalon.beautysalonapi.data.models.User
import org.springframework.stereotype.Service

@Service
class UserMapper: Mapper<UserDTO, User> {
    override fun fromEntity(entity: User): UserDTO = UserDTO(
        entity.id,
        entity.name,
        entity.pin,
        entity.password,
        entity.email,
        entity.cellNumber,
        entity.gender,
        entity.type,
        entity.schedules
    )

    override fun toEntity(domain: UserDTO): User = User(
        domain.id,
        domain.name,
        domain.pin,
        domain.password,
        domain.email,
        domain.cellNumber,
        domain.gender,
        domain.type,
        domain.schedules
    )

}