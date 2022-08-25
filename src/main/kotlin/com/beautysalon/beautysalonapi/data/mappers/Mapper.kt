package com.beautysalon.beautysalonapi.data.mappers

import javax.persistence.Entity

interface Mapper <D, E> {
    fun fromEntity(entity: E): D
    fun toEntity(domain: D): E
}