package com.example.pocspringcleanarch.common.infrastructure.persistence

interface EntityMapper<Domain, Entity> {
    fun mapToEntity(obj: Domain): Entity
    fun mapFromEntity(obj: Entity): Domain
}