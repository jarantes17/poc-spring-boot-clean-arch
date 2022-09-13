package com.example.pocspringcleanarch.common.domain.model

interface DTOMapper<DTO, Domain> {
    fun mapFromDTO(obj: DTO): Domain
    fun mapToDTO(obj: Domain): DTO
}

interface RequestResponseDTOMapper<Request, Response, Domain> {
    fun mapFromDTO(obj: Request): Domain
    fun mapToDTO(obj: Domain): Response
}